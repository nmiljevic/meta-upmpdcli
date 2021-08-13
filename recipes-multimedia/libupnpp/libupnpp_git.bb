# Recipe created by recipetool
# This is the basis of a recipe and may need further editing in order to be fully functional.
# (Feel free to remove these comments when editing.)

# WARNING: the following LICENSE and LIC_FILES_CHKSUM values are best guesses - it is
# your responsibility to verify that the values are complete and correct.
#
# The following license files were not able to be identified and are
# represented as "Unknown" below, you will need to check them yourself:
#   COPYING
#   LICENSE
#   debian/copyright
LICENSE = "Unknown"
LIC_FILES_CHKSUM = "file://COPYING;md5=321bf41f280cf805086dd5a720b37785 \
                    file://LICENSE;md5=3595b15429ee39c5903ff3643d4fee57 \
                    file://debian/copyright;md5=98c9c2651c1d4f0b818fa8aedfbf002b"

SRC_URI = "git://framagit.org/medoc92/libupnpp.git;protocol=https"

# Modify these as desired
PV = "0.21.0+git${SRCPV}"
SRCREV = "${AUTOREV}"

S = "${WORKDIR}/git"

DEPENDS = "expat curl libnpupnp"

# NOTE: if this software is not capable of being built in a separate build directory
# from the source, you should replace autotools with autotools-brokensep in the
# inherit line
inherit pkgconfig autotools

# Specify any options you want to pass to the configure script using EXTRA_OECONF:
EXTRA_OECONF = ""

