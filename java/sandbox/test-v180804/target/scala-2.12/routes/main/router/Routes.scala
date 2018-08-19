// @GENERATOR:play-routes-compiler
// @SOURCE:/home/cesar/Code/github/play-framework/java/sandbox/test-v180804/conf/routes
// @DATE:Sun Aug 05 01:08:13 BRT 2018

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._

import play.api.mvc._

import _root_.controllers.Assets.Asset
import _root_.play.libs.F

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:6
  HomeController_0: controllers.HomeController,
  // @LINE:7
  TestController_2: controllers.TestController,
  // @LINE:14
  Assets_1: controllers.Assets,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:6
    HomeController_0: controllers.HomeController,
    // @LINE:7
    TestController_2: controllers.TestController,
    // @LINE:14
    Assets_1: controllers.Assets
  ) = this(errorHandler, HomeController_0, TestController_2, Assets_1, "/")

  def withPrefix(prefix: String): Routes = {
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, HomeController_0, TestController_2, Assets_1, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix, """controllers.HomeController.index"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """tests""", """controllers.TestController.index"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """tests/create""", """controllers.TestController.create"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """tests/""" + "$" + """id<[^/]+>""", """controllers.TestController.show(id:Long)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """tests/save""", """controllers.TestController.save()"""),
    ("""DELETE""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """tests/remove""", """controllers.TestController.remove(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/""" + "$" + """file<.+>""", """controllers.Assets.versioned(path:String = "/public", file:Asset)"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:6
  private[this] lazy val controllers_HomeController_index0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix)))
  )
  private[this] lazy val controllers_HomeController_index0_invoker = createInvoker(
    HomeController_0.index,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "index",
      Nil,
      "GET",
      this.prefix + """""",
      """ An example controller showing a sample home page""",
      Seq()
    )
  )

  // @LINE:7
  private[this] lazy val controllers_TestController_index1_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("tests")))
  )
  private[this] lazy val controllers_TestController_index1_invoker = createInvoker(
    TestController_2.index,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.TestController",
      "index",
      Nil,
      "GET",
      this.prefix + """tests""",
      """""",
      Seq()
    )
  )

  // @LINE:8
  private[this] lazy val controllers_TestController_create2_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("tests/create")))
  )
  private[this] lazy val controllers_TestController_create2_invoker = createInvoker(
    TestController_2.create,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.TestController",
      "create",
      Nil,
      "GET",
      this.prefix + """tests/create""",
      """""",
      Seq()
    )
  )

  // @LINE:9
  private[this] lazy val controllers_TestController_show3_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("tests/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_TestController_show3_invoker = createInvoker(
    TestController_2.show(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.TestController",
      "show",
      Seq(classOf[Long]),
      "GET",
      this.prefix + """tests/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:10
  private[this] lazy val controllers_TestController_save4_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("tests/save")))
  )
  private[this] lazy val controllers_TestController_save4_invoker = createInvoker(
    TestController_2.save(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.TestController",
      "save",
      Nil,
      "POST",
      this.prefix + """tests/save""",
      """""",
      Seq()
    )
  )

  // @LINE:11
  private[this] lazy val controllers_TestController_remove5_route = Route("DELETE",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("tests/remove")))
  )
  private[this] lazy val controllers_TestController_remove5_invoker = createInvoker(
    TestController_2.remove(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.TestController",
      "remove",
      Seq(classOf[Long]),
      "DELETE",
      this.prefix + """tests/remove""",
      """""",
      Seq()
    )
  )

  // @LINE:14
  private[this] lazy val controllers_Assets_versioned6_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_versioned6_invoker = createInvoker(
    Assets_1.versioned(fakeValue[String], fakeValue[Asset]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "versioned",
      Seq(classOf[String], classOf[Asset]),
      "GET",
      this.prefix + """assets/""" + "$" + """file<.+>""",
      """ Map static resources from the /public folder to the /assets URL path""",
      Seq()
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:6
    case controllers_HomeController_index0_route(params@_) =>
      call { 
        controllers_HomeController_index0_invoker.call(HomeController_0.index)
      }
  
    // @LINE:7
    case controllers_TestController_index1_route(params@_) =>
      call { 
        controllers_TestController_index1_invoker.call(TestController_2.index)
      }
  
    // @LINE:8
    case controllers_TestController_create2_route(params@_) =>
      call { 
        controllers_TestController_create2_invoker.call(TestController_2.create)
      }
  
    // @LINE:9
    case controllers_TestController_show3_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_TestController_show3_invoker.call(TestController_2.show(id))
      }
  
    // @LINE:10
    case controllers_TestController_save4_route(params@_) =>
      call { 
        controllers_TestController_save4_invoker.call(TestController_2.save())
      }
  
    // @LINE:11
    case controllers_TestController_remove5_route(params@_) =>
      call(params.fromQuery[Long]("id", None)) { (id) =>
        controllers_TestController_remove5_invoker.call(TestController_2.remove(id))
      }
  
    // @LINE:14
    case controllers_Assets_versioned6_route(params@_) =>
      call(Param[String]("path", Right("/public")), params.fromPath[Asset]("file", None)) { (path, file) =>
        controllers_Assets_versioned6_invoker.call(Assets_1.versioned(path, file))
      }
  }
}
