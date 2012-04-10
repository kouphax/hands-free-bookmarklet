
package views.html

import play.templates._
import play.templates.TemplateMagic._

import play.api.templates._
import play.api.templates.PlayMagic._
import models._
import controllers._
import play.api.i18n._
import play.api.mvc._
import play.api.data._
import views.html._
/**/
object index extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template0[play.api.templates.Html] {

    /**/
    def apply():play.api.templates.Html = {
        _display_ {

Seq(format.raw/*1.1*/("""<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <title>Hands Free Scroller</title>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta name="description" content="">
    <meta name="author" content="">
    <link href="http://twitter.github.com/bootstrap/assets/css/bootstrap.css" rel="stylesheet">
    <style>
      body """),format.raw("""{"""),format.raw/*11.13*/("""
        padding-top: 60px;
      """),format.raw("""}"""),format.raw/*13.8*/("""

      .navbar-fixed-top .brand """),format.raw("""{"""),format.raw/*15.33*/("""
        font-weight: bold;
        color: #000;
        text-shadow: 1px 1px 0 rgba(255,255,255,.125), 0 0 30px rgba(255,255,255,.125);
      """),format.raw("""}"""),format.raw/*19.8*/("""

      .input-prepend input[class*="span"],
      .input-append input[class*="span"] """),format.raw("""{"""),format.raw/*22.43*/("""
        width: auto;
        display: inline-block;
      """),format.raw("""}"""),format.raw/*25.8*/("""
    </style>
    <link href="http://twitter.github.com/bootstrap/assets/css/bootstrap-responsive.css" rel="stylesheet">

    <!-- Le HTML5 shim, for IE6-8 support of HTML5 elements -->
    <!--[if lt IE 9]>
      <script src="http://html5shim.googlecode.com/svn/trunk/html5.js"></script>
    <![endif]-->

    <link rel="shortcut icon" href="http://twitter.github.com/bootstrap/assets/ico/favicon.ico">
  </head>

  <body>

    <div class="navbar navbar-fixed-top">
      <div class="navbar-inner">
        <div class="container">
          <a class="brand" href="/">Hands Free Scroll</a>
        </div>
      </div>
    </div>

    <div class="container">

      <form class="form-horizontal">
        <fieldset>
          <legend>Scroll Values</legend>
          <div class="control-group">
            <label class="control-label" for="interval">Scroll Interval</label>
            <div class="controls">
              <div class="input-append">
                  <input class="span1" size="4" id="interval" type="text" value="100"><span class="add-on">ms</span>
              </div>
            </div>
          </div>
          <div class="control-group">
            <label class="control-label" for="increment">Scroll Increment</label>
            <div class="controls">
              <div class="input-append">
                  <input class="span1" size="4" id="increment" type="text"value="1"><span class="add-on">px</span>
              </div>
            </div>
          </div>      
        </fieldset>

        <div class="tabbable">
          <ul class="nav nav-tabs">
            <li class="active"><a href="#1" data-toggle="tab">Code</a></li>
            <li><a href="#2" data-toggle="tab">Preview</a></li>
            <li><a href="#3" data-toggle="tab">About</a></li>
          </ul>
          <div class="tab-content">
            <div class="tab-pane active" id="1">
              <div class="control-group">
                <textarea class="input-xlarge" style="width:100%" id="code" rows="3">
                </textarea>
              </div>
              <legend>How Now?</legend>
              <ol>
                <li>Bookmark this page</li>
                <li>Copy the code above</li>
                <li>Edit the bookmark replacing the bookmark url with the code above</li>
                <li>Goto desired page, activate bookmark</li>
                <li>Amazeballs</li>
              </ol>
            </div>
            <div class="tab-pane" id="2">
              <fieldset>
                <div class="control-group">
                  <div class="row">
                    <iframe class="span12" style="height:100px;border:0;" id="sample" src=""""),_display_(Seq(/*95.93*/(routes.Application.sample))),format.raw/*95.120*/("""?interval=100&increment=1" ></iframe> 
                  </div>
                </div>
              </fieldset>
            </div>
            <div class="tab-pane" id="3">
              <fieldset>
                <div class="control-group">
                  <div class="row">
                    <div class="span12">
                      Want to read hands free?  Perhaps you have anew born that you need to bottlefeed and can't manage the scrolling and the feeding?  This will save you from the monotonay of the late night bottle!
                    </div>
                  </div>
                </div>
              </fieldset>
            </div>
          </div>
        </div>
      </form>
    </div>
    <script src="http://twitter.github.com/bootstrap/assets/js/jquery.js"></script>
    <script src="http://twitter.github.com/bootstrap/assets/js/bootstrap-tab.js"></script>
    <script type="text/javascript">
      (function()"""),format.raw("""{"""),format.raw/*118.19*/("""
        var template = "javascript:(function(host)"""),format.raw("""{"""),format.raw/*119.52*/(""" return """),format.raw("""{"""),format.raw/*119.61*/(""" start: function()"""),format.raw("""{"""),format.raw/*119.80*/(""" host.scrollBy(0, """),format.raw("""{"""),format.raw("""{"""),format.raw/*119.100*/("""increment"""),format.raw("""}"""),format.raw("""}"""),format.raw/*119.111*/("""); host.setTimeout(arguments.callee, """),format.raw("""{"""),format.raw("""{"""),format.raw/*119.150*/("""interval"""),format.raw("""}"""),format.raw("""}"""),format.raw/*119.160*/(""") """),format.raw("""}"""),format.raw/*119.163*/(""" """),format.raw("""}"""),format.raw/*119.165*/("""; """),format.raw("""}"""),format.raw/*119.168*/("""(this)).start();"
        var interval = 100;
        var increment = 1;

        $("#interval").change(function()"""),format.raw("""{"""),format.raw/*123.42*/("""
          interval = this.value;
          applySettings();
        """),format.raw("""}"""),format.raw/*126.10*/(""")

        $("#increment").change(function()"""),format.raw("""{"""),format.raw/*128.43*/("""
          increment = this.value;
          applySettings();
        """),format.raw("""}"""),format.raw/*131.10*/(""")

        var applySettings = function()"""),format.raw("""{"""),format.raw/*133.40*/("""
          setTimeout(function()"""),format.raw("""{"""),format.raw/*134.33*/("""
            document.getElementById("code").value = template.replace(""""),format.raw("""{"""),format.raw("""{"""),format.raw/*135.73*/("""increment"""),format.raw("""}"""),format.raw("""}"""),format.raw/*135.84*/("""", increment).replace(""""),format.raw("""{"""),format.raw("""{"""),format.raw/*135.109*/("""interval"""),format.raw("""}"""),format.raw("""}"""),format.raw/*135.119*/("""", interval)
            document.getElementById("sample").src = """"),_display_(Seq(/*136.55*/(routes.Application.sample))),format.raw/*136.82*/("""?interval=" + interval + "&increment=" + increment + ""
          """),format.raw("""}"""),format.raw/*137.12*/(""", 0)
        """),format.raw("""}"""),format.raw/*138.10*/("""

        applySettings();
      """),format.raw("""}"""),format.raw/*141.8*/(""")()
    </script>
  </body>
</html>
"""))}
    }
    
    def render() = apply()
    
    def f:(() => play.api.templates.Html) = () => apply()
    
    def ref = this

}
                /*
                    -- GENERATED --
                    DATE: Tue Apr 10 22:25:32 BST 2012
                    SOURCE: /Users/kouphax/Projects/hands-free-bookmarklet/app/views/index.scala.html
                    HASH: 90a6ac800157ae0933255fd0bf4b1b9c2399ef2e
                    MATRIX: 564->0|991->380|1072->415|1153->449|1343->593|1477->680|1583->740|4294->3420|4344->3447|5334->4389|5434->4441|5491->4450|5558->4469|5646->4489|5725->4500|5832->4539|5910->4549|5962->4552|6013->4554|6065->4557|6228->4672|6346->4742|6439->4787|6558->4858|6648->4900|6729->4933|6869->5006|6947->5017|7040->5042|7118->5052|7217->5119|7267->5146|7382->5213|7444->5227|7525->5261
                    LINES: 22->1|32->11|34->13|36->15|40->19|43->22|46->25|116->95|116->95|139->118|140->119|140->119|140->119|140->119|140->119|140->119|140->119|140->119|140->119|140->119|144->123|147->126|149->128|152->131|154->133|155->134|156->135|156->135|156->135|156->135|157->136|157->136|158->137|159->138|162->141
                    -- GENERATED --
                */
            