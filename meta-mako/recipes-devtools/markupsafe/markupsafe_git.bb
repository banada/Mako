DESCRIPTION = "MarkupSafe is a library for Python that implements a unicode string that is aware of HTML escaping rules and can be used to implement automatic string escaping."
HOMEPAGE = "www.pocoo.org/projects/markupsafe/"
SECTION = "net"

LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://LICENSE;md5=c6d1adcf45d69359f256c1cea3254127"

PR = "r0"

SRCNAME = "markupsafe"
SRC_URI = "git://github.com/mitsuhiko/markupsafe.git"
SRCREV="ff1e1bf21c1ac82fc9134e4a31bb0243d170723b"

S = "${WORKDIR}/git"

inherit setuptools

RDEPENDS_${PN} += "python"
