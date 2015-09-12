KV = "3.18.18"
SRCDATE = "20150907"

require et-dvb-modules.inc

SRC_URI = "http://xtrendet.net/${MACHINE}-drivers-${KV}-${SRCDATE}.zip"

SRC_URI[md5sum] = "e992182bbefbd0dea279b1b34c840111"
SRC_URI[sha256sum] = "21f10357212f10023891279740f58995f84c60048586758d51b455f5807a9718"

COMPATIBLE_MACHINE = "et8500"
