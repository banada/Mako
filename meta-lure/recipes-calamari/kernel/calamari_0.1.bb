SUMMARY = "Kernel module for the Calamari lure"
DESCRIPTION = "Kernel module for the Calamari lure"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://calamari.c;endline=79;md5=f791a00e620ae4c95d90ec31d7a536b3"

inherit module

PR = "r0"
PV = "0.1"

SRC_URI = "file://Makefile \
           file://calamari.c \
          "

S = "${WORKDIR}"

# The inherit of module.bbclass will automatically name module packages with
# "kernel-module-" prefix as required by the oe-core build environment.
