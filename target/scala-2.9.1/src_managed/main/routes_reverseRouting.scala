// @SOURCE:/Users/kouphax/Projects/hands-free-bookmarklet/conf/routes
// @HASH:99d1b6769c34ab1faab98d342c19e716e3ea5f8a
// @DATE:Tue Apr 10 22:24:59 BST 2012

import play.core._
import play.core.Router._
import play.core.j._

import play.api.mvc._


import Router.queryString


// @LINE:9
// @LINE:6
// @LINE:5
package controllers {

// @LINE:6
// @LINE:5
class ReverseApplication {
    


 
// @LINE:6
def sample() = {
   Call("GET", "/sample")
}
                                                        
 
// @LINE:5
def index() = {
   Call("GET", "/")
}
                                                        

                      
    
}
                            

// @LINE:9
class ReverseAssets {
    


 
// @LINE:9
def at(file:String) = {
   Call("GET", "/assets/" + implicitly[PathBindable[String]].unbind("file", file))
}
                                                        

                      
    
}
                            
}
                    


// @LINE:9
// @LINE:6
// @LINE:5
package controllers.javascript {

// @LINE:6
// @LINE:5
class ReverseApplication {
    


 
// @LINE:6
def sample = JavascriptReverseRoute(
   "controllers.Application.sample",
   """
      function() {
      return _wA({method:"GET", url:"/sample"})
      }
   """
)
                                                        
 
// @LINE:5
def index = JavascriptReverseRoute(
   "controllers.Application.index",
   """
      function() {
      return _wA({method:"GET", url:"/"})
      }
   """
)
                                                        

                      
    
}
                            

// @LINE:9
class ReverseAssets {
    


 
// @LINE:9
def at = JavascriptReverseRoute(
   "controllers.Assets.at",
   """
      function(file) {
      return _wA({method:"GET", url:"/assets/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("file", file)})
      }
   """
)
                                                        

                      
    
}
                            
}
                    


// @LINE:9
// @LINE:6
// @LINE:5
package controllers.ref {

// @LINE:6
// @LINE:5
class ReverseApplication {
    


 
// @LINE:6
def sample() = new play.api.mvc.HandlerRef(
   controllers.Application.sample(), HandlerDef(this, "controllers.Application", "sample", Seq())
)
                              
 
// @LINE:5
def index() = new play.api.mvc.HandlerRef(
   controllers.Application.index(), HandlerDef(this, "controllers.Application", "index", Seq())
)
                              

                      
    
}
                            

// @LINE:9
class ReverseAssets {
    


 
// @LINE:9
def at(path:String, file:String) = new play.api.mvc.HandlerRef(
   controllers.Assets.at(path, file), HandlerDef(this, "controllers.Assets", "at", Seq(classOf[String], classOf[String]))
)
                              

                      
    
}
                            
}
                    
                