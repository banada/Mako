SUMMARY = "A distribution to help makers quickly build their project with Intel Edison or MinnowBoard Max"

IMAGE_INSTALL_append = " python-core flask nodejs nodejs-npm nginx calamari calamari-tests opencv-dev bash"

inherit core-image

IMAGE_FEATURES += "ssh-server-openssh"

#MACHINE_EXTRA_RDEPENDS += "calamari"
