DESCRIPTION = "Matchbox window manager core library"
SECTION = "x11/libs"
HOMEPAGE = "http://matchbox-project.org/"
BUGTRACKER = "http://bugzilla.yoctoproject.com/"

LICENSE = "LGPLv2+"
LIC_FILES_CHKSUM = "file://COPYING;md5=7fbc338309ac38fefcd64b04bb903e34 \
                    file://libmb/mbexp.c;endline=20;md5=28c0aef3b23e308464f5dae6a11b0d2f \
                    file://libmb/mbdotdesktop.c;endline=21;md5=5a287156b3207e851c1d68d09c439b51"

DEPENDS = "virtual/libx11 libxext expat libxft jpeg libpng zlib libxsettings-client startup-notification"

SRC_URI = "http://downloads.yoctoproject.org/releases/matchbox/${BPN}/${PV}/${BPN}-${PV}.tar.bz2"
SRC_URI[md5sum] = "fc6cc807f55a3e7c752d8013176875d7"
SRC_URI[sha256sum] = "254cab52e304a3512c8df4be59d690cf3921bbb68a28ede7fe26b93534217b53"

inherit autotools pkgconfig

EXTRA_OECONF = "--enable-jpeg --enable-xsettings"
