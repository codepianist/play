// @GENERATOR:play-routes-compiler
// @SOURCE:/home/cesar/Code/github/play-framework/java/sandbox/test-v180804/conf/routes
// @DATE:Sun Aug 05 01:08:13 BRT 2018

import play.api.mvc.Call


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:6
package controllers {

  // @LINE:6
  class ReverseHomeController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:6
    def index(): Call = {
      
      Call("GET", _prefix)
    }
  
  }

  // @LINE:14
  class ReverseAssets(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:14
    def versioned(file:Asset): Call = {
      implicit lazy val _rrc = new play.core.routing.ReverseRouteContext(Map(("path", "/public"))); _rrc
      Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[play.api.mvc.PathBindable[Asset]].unbind("file", file))
    }
  
  }

  // @LINE:7
  class ReverseTestController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:9
    def show(id:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "tests/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)))
    }
  
    // @LINE:8
    def create(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "tests/create")
    }
  
    // @LINE:10
    def save(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "tests/save")
    }
  
    // @LINE:11
    def remove(id:Long): Call = {
      
      Call("DELETE", _prefix + { _defaultPrefix } + "tests/remove" + play.core.routing.queryString(List(Some(implicitly[play.api.mvc.QueryStringBindable[Long]].unbind("id", id)))))
    }
  
    // @LINE:7
    def index(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "tests")
    }
  
  }


}
