KV = "4.1.21"
SRCDATE = "20161114"
GCC = "5.3.0"

require et-dvb-modules.inc

SRC_URI = "http://gi-et.info/et7000mini/${MACHINE}-drivers-${KV}-${GCC}-${SRCDATE}.zip"

SRC_URI[md5sum] = "133beb990b66d70940a4a0ee2ef5ad5e"
SRC_URI[sha256sum] = "88a31a2cb13959c3be53629197d2ed05316eab20199b0b66e5b05b72cdf8335a"

COMPATIBLE_MACHINE = "et7000mini"
