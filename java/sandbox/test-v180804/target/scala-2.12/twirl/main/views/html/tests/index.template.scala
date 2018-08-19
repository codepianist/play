
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

object index extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[List[model.Test],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(tests: List[model.Test]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.1*/("""
"""),_display_(/*3.2*/main("Test/Index title")/*3.26*/ {_display_(Seq[Any](format.raw/*3.28*/("""
    """),format.raw/*4.5*/("""<h1>Tests/Index</h1>
    <p>"""),_display_(/*5.9*/tests),format.raw/*5.14*/("""</p>
    <ul>
        """),_display_(/*7.10*/for(test <- tests) yield /*7.28*/{_display_(Seq[Any](format.raw/*7.29*/("""
             """),format.raw/*8.14*/("""<li>"""),_display_(/*8.19*/test),format.raw/*8.23*/(""" """),format.raw/*8.24*/("""</li>
        """)))}),format.raw/*9.10*/("""
    """),format.raw/*10.5*/("""</ul>
""")))}),format.raw/*11.2*/("""
"""))
      }
    }
  }

  def render(tests:List[model.Test]): play.twirl.api.HtmlFormat.Appendable = apply(tests)

  def f:((List[model.Test]) => play.twirl.api.HtmlFormat.Appendable) = (tests) => apply(tests)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Sun Aug 05 16:36:10 BRT 2018
                  SOURCE: /home/cesar/Code/github/play-framework/java/sandbox/test-v180804/app/views/tests/index.scala.html
                  HASH: 639afc71f122722d21a274500f54dd46959f9b77
                  MATRIX: 964->1|1083->27|1110->29|1142->53|1181->55|1212->60|1266->89|1291->94|1340->117|1373->135|1411->136|1452->150|1483->155|1507->159|1535->160|1580->175|1612->180|1649->187
                  LINES: 28->1|33->2|34->3|34->3|34->3|35->4|36->5|36->5|38->7|38->7|38->7|39->8|39->8|39->8|39->8|40->9|41->10|42->11
                  -- GENERATED --
              */
          