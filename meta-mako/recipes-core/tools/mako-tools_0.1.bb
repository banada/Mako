SUMMARY = "Scripts for makers using Mako"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${WORKDIR}/LICENSE;md5=74204dc09a2efb71c97454c63aaa00d9"
DESCRIPTION = "Scripts for makers using Mako"

SRC_URI = "file://LICENSE \
           file://setup.sh \
"

do_install() {
    install -d ${D}${ROOT_HOME}/
    install -m 0777 ${WORKDIR}/setup.sh ${D}${ROOT_HOME}/
}

FILES_${PN} = "${ROOT_HOME}"
