DESCRIPTION = "Flask is a micro webdevelopment framework for Python."
HOMEPAGE = "http://flask.pocoo.org/"
SECTION = "net"

LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://LICENSE;md5=79aa8b7bc4f781210d6b5c06d6424cb0"

PR = "r0"

SRCNAME = "flask"
SRC_URI = "git://github.com/mitsuhiko/flask.git"
SRCREV="298334fffc8288b5a9a45ef4150e3c4292e45318"

S = "${WORKDIR}/git"

inherit setuptools

DEPENDS += " \
            "
#	Werkzeug 
#	Jinja2

RDEPENDS_${PN} += "python itsdangerous"
