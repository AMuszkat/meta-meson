#
# Linux Support for 32bit Amlogic Meson SoCs
#

FILESEXTRAPATHS:prepend := "${THISDIR}/${PN}-${PV}:"

KERNEL_CLASSES = "kernel-uimage-meson"

# Linux stable tree
SRC_URI = " \
	git://git.kernel.org/pub/scm/linux/kernel/git/stable/linux-stable.git;protocol=git;nocheckout=1;branch=linux-6.5.y;name=meson \
	file://defconfig \
"

# tag: v5.4.24
SRCREV_meson = "43a868577dfcd9be6930453dc5ec557ab2e9ad89"

KERNEL_VERSION_SANITY_SKIP="1"
	
# Linux stable tree
LINUX_VERSION = "6.5.10"

LINUX_VERSION_EXTENSION:append = "-meson32"
KBUILD_DEFCONFIG = "multi_v7_defconfig"

require linux-yocto-meson.inc

# Checksum changed on 4.17
LIC_FILES_CHKSUM = "file://COPYING;md5=bbea815ee2795b2f4230826c0c6b8814"
