
package views.html.tests

import _root_.play.twirl.api.TwirlFeatureImports._
import _root_.play.twirl.api.TwirlHelperImports._
import _root_.play.twirl.api.Html
import _root_.play.twirl.api.JavaScript
import _root_.play.twirl.api.Txt
import _root_.play.twirl.api.Xml
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import java.lang._
import java.util._
import scala.collection.JavaConverters._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._
import play.data._
import play.core.j.PlayFormsMagicForJava._

object remove extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[Long,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(id: Long):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.1*/("""
"""),_display_(/*3.2*/main("Test/Index title")/*3.26*/ {_display_(Seq[Any](format.raw/*3.28*/("""
    """),format.raw/*4.5*/("""<h1>Test/Index """),_display_(/*4.21*/id),format.raw/*4.23*/("""</h1>
""")))}),format.raw/*5.2*/("""
"""))
      }
    }
  }

  def render(id:Long): play.twirl.api.HtmlFormat.Appendable = apply(id)

  def f:((Long) => play.twirl.api.HtmlFormat.Appendable) = (id) => apply(id)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Sun Aug 05 16:29:50 BRT 2018
                  SOURCE: /home/cesar/Code/github/play-framework/java/sandbox/test-v180804/app/views/tests/remove.scala.html
                  HASH: c92bc4c0ae9d0ca945ceea51814d7ad83cef6086
                  MATRIX: 953->1|1057->12|1084->14|1116->38|1155->40|1186->45|1228->61|1250->63|1286->70
                  LINES: 28->1|33->2|34->3|34->3|34->3|35->4|35->4|35->4|36->5
                  -- GENERATED --
              */
          