package controllers;

import play.*;
import play.mvc.*;

import views.html.*;

public class Application extends Controller {

    public static Result index() {
    	System.out.println("hello i am siva");
        return ok(index.render("your new application is not working.Please check"));
    }

}
