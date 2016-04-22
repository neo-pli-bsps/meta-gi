KV = "3.18.24"
SRCDATE = "20160421"
GCC = "4.9.1"

require et-dvb-modules.inc

SRC_URI = "http://gi-et-7000-mini.eu/${MACHINE}-drivers-${KV}-${GCC}-${SRCDATE}.zip"

SRC_URI[md5sum] = "11b8b425eb590f35dcafb0dc03677203"
SRC_URI[sha256sum] = "6ba3e906e7e71588ea10c4611844c14e7690ae313a7eb8fe1f4d4f154fe78aa9"

COMPATIBLE_MACHINE = "et7000mini"
