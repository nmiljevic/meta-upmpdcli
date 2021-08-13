# Recipe created by recipetool
# This is the basis of a recipe and may need further editing in order to be fully functional.
# (Feel free to remove these comments when editing.)

# WARNING: the following LICENSE and LIC_FILES_CHKSUM values are best guesses - it is
# your responsibility to verify that the values are complete and correct.
#
# The following license files were not able to be identified and are
# represented as "Unknown" below, you will need to check them yourself:
#   COPYING
#   debian/copyright
LICENSE = "Unknown"
LIC_FILES_CHKSUM = "file://COPYING;md5=394a0f17b97f33426275571e15920434 \
                    file://debian/copyright;md5=c52aea92915eed029b1d905988c3c38a"

SRC_URI = "git://framagit.org/medoc92/npupnp.git;protocol=https"

# Modify these as desired
PV = "4.1.4+git${SRCPV}"
SRCREV = "${AUTOREV}"

S = "${WORKDIR}/git"

DEPENDS = "libmicrohttpd expat curl"

# NOTE: if this software is not capable of being built in a separate build directory
# from the source, you should replace autotools with autotools-brokensep in the
# inherit line
inherit pkgconfig autotools

# Specify any options you want to pass to the configure script using EXTRA_OECONF:
EXTRA_OECONF = ""

