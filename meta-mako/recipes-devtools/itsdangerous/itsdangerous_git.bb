DESCRIPTION = "Various helpers to pass data to untrusted environments and to get it back safe and sound."
HOMEPAGE = "pythonhosted.org/itsdangerous/"
SECTION = "net"

LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b61841e2bf5f07884148e2a6f1bcab0c"

PR = "r0"

SRCNAME = "itsdangerous"
SRC_URI = "git://github.com/mitsuhiko/itsdangerous.git"
SRCREV="4c3923561fd7d3aa53013b0b6b27bb3221bd473a"

S = "${WORKDIR}/git"

inherit setuptools

RDEPENDS_${PN} += "python"
