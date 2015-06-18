DESCRIPTION = "Jinja2 is a full featured template engine for Python."
HOMEPAGE = "jinja.pocoo.org"
SECTION = "net"

LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://LICENSE;md5=20c831f91dd3bd486020f672ba2be386"

PR = "r0"

SRCNAME = "jinja"
SRC_URI = "git://github.com/mitsuhiko/jinja2.git"
SRCREV="2f8b7cfc89e412b6cba0a1f5aa1a319190b9b65f"

S = "${WORKDIR}/git"

inherit setuptools

RDEPENDS_${PN} += "python markupsafe"
