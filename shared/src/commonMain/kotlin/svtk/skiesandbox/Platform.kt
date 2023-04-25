package svtk.skiesandbox

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform