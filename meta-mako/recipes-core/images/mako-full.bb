SUMMARY = "A distribution to help makers quickly build their project with Intel Edison or MinnowBoard Max"

IMAGE_INSTALL_append = " python-core flask nodejs nodejs-npm nginx calamari calamari-tests opencv-dev bash connman connman-client linux-firmware-rtl8192cu linux-firmware-ralink mako-tools upm mraa bluez5 bluez5-dev cmake werkzeug jinja2 itsdangerous markupsafe python-simplejson"

inherit core-image

IMAGE_FEATURES += "ssh-server-openssh"

IMAGE_ROOTFS_SIZE = "1048576"

#MACHINE_EXTRA_RDEPENDS += "calamari"
