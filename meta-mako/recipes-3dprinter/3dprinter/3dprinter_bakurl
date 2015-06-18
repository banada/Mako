DESCRIPTION = "UI of 3d printer."

LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/COPYING.GPLv2;md5=751419260aa954499f7abaabaa882bbe"

SRC_URI = "git://git-amr-1.devtools.intel.com:29418/otc_prc_platform-printerui3d.git;protocol=ssh"
SRCREV = "${AUTOREV}"

S = "${WORKDIR}/git"

do_compile () {
}

do_install () {
	install -d ${D}/usr/share/
	install -d ${D}/usr/bin/
	cp -a ${S} ${D}/usr/share/3dprinter-1.0
	cp -a ${S}/3dprinter  ${D}/usr/bin/
}

RDEPENDS_${PN} += "cura-engine python nginx uwsgi flask werkzeug jinja2"

FILES_${PN} =  "/*"

