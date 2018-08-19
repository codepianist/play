// @GENERATOR:play-routes-compiler
// @SOURCE:/home/cesar/Code/github/play-framework/java/sandbox/test-v180804/conf/routes
// @DATE:Sun Aug 05 01:08:13 BRT 2018


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}
