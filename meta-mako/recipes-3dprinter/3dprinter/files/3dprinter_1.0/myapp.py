import os,sys,json
import commands
# We'll render HTML templates and access data sent by POST
# using the request object from flask. Redirect and url_for
# will be used to redirect the user once the upload is done
# and send_from_directory will help us to send/show on the
# browser the file that the user just uploaded
from flask import Flask,jsonify,render_template, request, redirect, url_for, send_from_directory
from werkzeug import secure_filename
 
# Initialize the Flask application
app = Flask(__name__)
 
# This is the path to the upload directory
app.config['UPLOAD_FOLDER'] = 'static/models/'
app.config['OUTPUT_FOLDER'] = 'static/outfile/'
app.config['INPUT_FOLDER'] = 'static/models/'
# These are the extension that we are accepting to be uploaded
app.config['ALLOWED_EXTENSIONS'] = set(['stl','txt', 'pdf', 'png', 'jpg', 'jpeg', 'gif'])
 
# For a given file, return whether it's an allowed type or not
def allowed_file(filename):
    return '.' in filename and \
           filename.rsplit('.', 1)[1] in app.config['ALLOWED_EXTENSIONS']
 
# This route will show a form to perform an AJAX request
# jQuery is loaded to execute the request and update the
# value of the operation
@app.route('/')
def index():
    return render_template('index.html')
 
 
# Route that will process the file upload
@app.route('/upload', methods=['POST'])
def upload():
    # Get the name of the uploaded files
    uploaded_files = request.files.getlist("file[]")
    filenames = []
    print filenames
    print uploaded_files 
    for file in uploaded_files:
        # Check if the file is one of the allowed types/extensions
        if file and allowed_file(file.filename):
            # Make the filename safe, remove unsupported chars
            filename = secure_filename(file.filename)
            # Move the file form the temporal folder to the upload
            # folder we setup
            file.save(os.path.join(app.config['UPLOAD_FOLDER'], filename))
            # Save the filename into a list, we'll use it later
            filenames.append(filename)
	    return jsonify(result= "upload complete.",filename=filename) 
            # Redirect the user to the uploaded_file route, which
            # will basicaly show on the browser the uploaded file
    # Load an html page with a link to each uploaded file
    return jsonify(result="error!" ) 
 
# This route is expecting a parameter containing the name
# of a file. Then it will locate that file on the upload
# directory and show it on the browser, so if the user uploads
# an image, that image is going to be show after the upload
# http://www.sharejs.com
@app.route('/slice', methods=['POST'])
def slice_file():
    jsondata =request.json
    currentfile = jsondata['currentfile']
    matrix_str = '-m '+ str(jsondata['matrix']).replace('[',' ').replace(']',' ').replace(' ','')
    settings = jsondata['settings']
 #   print matrix_str
    settings_str = ' ' 
    for (key,value) in settings.items():
       settings_str += '-s '+ key + "=" + str(value)+" "
#    print settings_str
#   print commands.getstatusoutput('CuraEngine -o static/outfile/myout.gcode static/models/test1.stl')
    print 'CuraEngine ' + matrix_str + settings_str+'-o static/outfile/myout.gcode ' + app.config['INPUT_FOLDER'] + currentfile 
    status, output = commands.getstatusoutput('CuraEngine ' + matrix_str + settings_str+'-o static/outfile/myout.gcode ' + app.config['INPUT_FOLDER'] + currentfile) 
    if status == 0:
	commands.getstatusoutput('cp static/outfile/myout.gcode  /home/ldd/test/')
        return jsonify(result = "Success",output = output)
    return jsonify(result = "Error",output = output)

@app.route('/print', methods=['POST'])
def print_file():
#   currentfile = request.json['currentfile']
#   print currentfile
#   print commands.getstatusoutput('CuraEngine -o static/outfile/myout.gcode static/models/test1.stl')
    status, output = commands.getstatusoutput('ls -la ./static/outfile/')
    if status == 0:
        return jsonify(result = "Success",output = output)
    return jsonify(result = "Error",output = output)


@app.route('/listfile', methods=['GET'])
def list_file():
	listfile=os.listdir('./static/models/')
	stl_list = []
	for line in listfile:
	    if line[-4:] == '.stl':
            	stl_list.append(line)
	print stl_list
	return jsonify(filelist = stl_list)


if __name__ == '__main__':
    app.run(
        debug=True
    )

