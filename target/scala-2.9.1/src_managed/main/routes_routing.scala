// @SOURCE:/Users/kouphax/Projects/hands-free-bookmarklet/conf/routes
// @HASH:99d1b6769c34ab1faab98d342c19e716e3ea5f8a
// @DATE:Tue Apr 10 22:24:59 BST 2012

import play.core._
import play.core.Router._
import play.core.j._

import play.api.mvc._


import Router.queryString

object Routes extends Router.Routes {


// @LINE:5
val controllers_Application_index0 = Route("GET", PathPattern(List(StaticPart("/"))))
                    

// @LINE:6
val controllers_Application_sample1 = Route("GET", PathPattern(List(StaticPart("/sample"))))
                    

// @LINE:9
val controllers_Assets_at2 = Route("GET", PathPattern(List(StaticPart("/assets/"),DynamicPart("file", """.+"""))))
                    
def documentation = List(("""GET""","""/""","""controllers.Application.index"""),("""GET""","""/sample""","""controllers.Application.sample"""),("""GET""","""/assets/$file<.+>""","""controllers.Assets.at(path:String = "/public", file:String)"""))
             
    
def routes:PartialFunction[RequestHeader,Handler] = {        

// @LINE:5
case controllers_Application_index0(params) => {
   call { 
        invokeHandler(_root_.controllers.Application.index, HandlerDef(this, "controllers.Application", "index", Nil))
   }
}
                    

// @LINE:6
case controllers_Application_sample1(params) => {
   call { 
        invokeHandler(_root_.controllers.Application.sample, HandlerDef(this, "controllers.Application", "sample", Nil))
   }
}
                    

// @LINE:9
case controllers_Assets_at2(params) => {
   call(Param[String]("path", Right("/public")), params.fromPath[String]("file", None)) { (path, file) =>
        invokeHandler(_root_.controllers.Assets.at(path, file), HandlerDef(this, "controllers.Assets", "at", Seq(classOf[String], classOf[String])))
   }
}
                    
}
    
}
                