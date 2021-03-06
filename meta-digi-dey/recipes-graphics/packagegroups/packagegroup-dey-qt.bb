#
# Copyright (C) 2013-2017, Digi International Inc.
#
SUMMARY = "QT packagegroup for DEY image"

PACKAGE_ARCH = "${MACHINE_ARCH}"
inherit packagegroup

MACHINE_QT5_EXTRA_INSTALL ?= ""
MACHINE_QT5_EXTRA_INSTALL_ccimx6 ?= "qtwebengine-examples"

QT5_PKS = "qtserialport"
QT5_PKS_append_ccimx6 = " qtdeclarative-tools"

QT5_EXAMPLES = ""
QT5_EXAMPLES_append_ccimx6 = " \
    qt3d-examples \
    qtbase-examples \
    qtconnectivity-examples \
    qtdeclarative-examples \
    qtmultimedia-examples \
    qtsvg-examples \
"

QT5_DEMOS = "qtsmarthome"
QT5_DEMOS_append_ccimx6 = " \
    cinematicexperience \
    qt5-demo-extrafiles \
    qt5everywheredemo \
"

RDEPENDS_${PN} += " \
    liberation-fonts \
    ${QT5_PKS} \
    ${QT5_DEMOS} \
    ${QT5_EXAMPLES} \
    ${MACHINE_QT5_EXTRA_INSTALL} \
"
