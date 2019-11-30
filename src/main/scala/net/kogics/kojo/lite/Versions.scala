package net.kogics.kojo.lite

object Versions {
  val KojoMajorVersion = "2.7"
  val KojoVersion = "2.7.09"
  val KojoRevision = "r21"
  val KojoBuildDate = "30 November 2019"
  val JavaVersion = {
    val jrv = System.getProperty("java.runtime.version")
    val arch = System.getProperty("os.arch")
    if (jrv == null) {
      val jv = System.getProperty("java.version")
      s"$jv; $arch"
    }
    else {
      s"$jrv; $arch"
    }
  }
  val ScalaVersion = scala.tools.nsc.Properties.versionString.substring("version ".length)
}