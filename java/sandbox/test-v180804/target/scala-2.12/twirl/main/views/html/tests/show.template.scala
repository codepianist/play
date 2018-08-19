
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

object show extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[Long,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(id: Long):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.1*/("""
"""),_display_(/*3.2*/main("Test/Show title")/*3.25*/ {_display_(Seq[Any](format.raw/*3.27*/("""
    """),format.raw/*4.5*/("""<h1>Test/Show """),_display_(/*4.20*/id),format.raw/*4.22*/("""</h1>
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
                  SOURCE: /home/cesar/Code/github/play-framework/java/sandbox/test-v180804/app/views/tests/show.scala.html
                  HASH: 322ab1339bd9b5a26dafe4ffcdead0486ddb5733
                  MATRIX: 951->1|1055->12|1082->14|1113->37|1152->39|1183->44|1224->59|1246->61|1282->68
                  LINES: 28->1|33->2|34->3|34->3|34->3|35->4|35->4|35->4|36->5
                  -- GENERATED --
              */
          