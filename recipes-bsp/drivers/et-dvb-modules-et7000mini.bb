KV = "4.1.21"
SRCDATE = "20170318"
GCC = "6.2.0"

require et-dvb-modules.inc

SRC_URI = "http://gi-et.info/et7000mini/${MACHINE}-drivers-${KV}-${GCC}-${SRCDATE}.zip"

SRC_URI[md5sum] = "71412352450f2ddeec561a8f05a5dfdd"
SRC_URI[sha256sum] = "668e8d64e16a7a952affd087139aac38b6686b45d6a26537ee72339ab34dd692"

COMPATIBLE_MACHINE = "et7000mini"
