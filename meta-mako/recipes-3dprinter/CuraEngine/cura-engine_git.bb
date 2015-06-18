SUMMARY = "The CuraEngine is a C++ console application for 3D printing GCode generation."
LICENSE = "AGPLv3"
LIC_FILES_CHKSUM = "file://LICENSE;md5=73f1eb20517c55bf9493b7dd6e480788"

SRCREV = "2e5b72cfefc4c60214f0793dbe13f948a3a7e7f1"

SRC_URI = "git://github.com/Ultimaker/CuraEngine.git"


S = "${WORKDIR}/git/"

##EXTRA_OEMAKE = "'CC=${CC}' 'RANLIB=${RANLIB}' 'AR=${AR}' 'CFLAGS=${CFLAGS} -std=c++11 -isystem libs -I${S}/libs -DWITHOUT_XATTR' 'LDFLAGS=${LDFLAGS} -Lbuild/ -lclipper' 'BUILDDIR=${S}'"

do_compile () {
    export CXX="${CCACHE}${HOST_PREFIX}g++ ${TARGET_CC_ARCH}"
    make
}

do_install () {
    install -d ${D}/usr/bin
    install -m 0755 ${S}/build/CuraEngine ${D}/usr/bin/
}

