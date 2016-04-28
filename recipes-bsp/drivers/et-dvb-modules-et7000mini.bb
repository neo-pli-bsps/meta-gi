KV = "4.1.21"
SRCDATE = "20160428"
GCC = "4.9.1"

require et-dvb-modules.inc

SRC_URI = "http://gi-et-7000-mini.eu/${MACHINE}-drivers-${KV}-${GCC}-${SRCDATE}.zip"

SRC_URI[md5sum] = "30ccbeeb34dd2dbf88d8e122f5783c24"
SRC_URI[sha256sum] = "8ae7e86397e599f7573241497a9393042643e15515b216b87683fd0684c62408"

COMPATIBLE_MACHINE = "et7000mini"
