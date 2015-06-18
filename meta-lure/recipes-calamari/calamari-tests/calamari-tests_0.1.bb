SUMMARY = "Calamari Lure test scripts"
LICENSE = "TBD"
LIC_FILES_CHKSUM = "file://${WORKDIR}/LICENSE;md5=e4f1b2d8e96f34376bc57c4a6d7e86d2"

DESCRIPTION = "Calamari Lure test scripts"

SRC_URI = " file://calamari-7seg.sh \
            file://calamari-btns.sh \
            file://calamari-i2c-eeprom.sh \
            file://calamari-leds-gpio.sh \
            file://calamari-leds-pwm.sh \
            file://calamari-rgb.sh \
            file://calamari-spi-adc-pot.sh \
            file://calamari-spidev-test.c \
            file://LICENSE \
"

do_install() {
    install -d ${D}${ROOT_HOME}/calamari-tests/
    install -m 0777 ${WORKDIR}/calamari-7seg.sh ${D}${ROOT_HOME}/calamari-tests/
    install -m 0777 ${WORKDIR}/calamari-btns.sh ${D}${ROOT_HOME}/calamari-tests/
    install -m 0777 ${WORKDIR}/calamari-i2c-eeprom.sh ${D}${ROOT_HOME}/calamari-tests/
    install -m 0777 ${WORKDIR}/calamari-leds-gpio.sh ${D}${ROOT_HOME}/calamari-tests/
    install -m 0777 ${WORKDIR}/calamari-leds-pwm.sh ${D}${ROOT_HOME}/calamari-tests/
    install -m 0777 ${WORKDIR}/calamari-rgb.sh ${D}${ROOT_HOME}/calamari-tests/
    install -m 0777 ${WORKDIR}/calamari-spi-adc-pot.sh ${D}${ROOT_HOME}/calamari-tests/
    install -m 0777 ${WORKDIR}/calamari-spidev-test.c ${D}${ROOT_HOME}/calamari-tests/
    install -m 0777 ${WORKDIR}/LICENSE ${D}${ROOT_HOME}/calamari-tests/
}

FILES_${PN} = "${ROOT_HOME}"
