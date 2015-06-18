DESCRIPTION = "Werkzeug is a WSGI utility library for Python."
HOMEPAGE = "werkzeug.pocoo.org"
SECTION = "net"

LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://LICENSE;md5=a68f5361a2b2ca9fdf26b38aaecb6faa"

PR = "r0"

SRCNAME = "werkzeug"
SRC_URI = "git://github.com/mitsuhiko/werkzeug.git"
SRCREV="cd2c97bb0a076da2322f11adce0b2731f9193396"

S = "${WORKDIR}/git"

inherit setuptools

RDEPENDS_${PN} += "python python-email python-pkgutil python-html python-difflib python-pprint"
