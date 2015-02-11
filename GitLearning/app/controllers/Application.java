package controllers;

import play.*;
import play.mvc.*;

import views.html.*;

public class Application extends Controller {

    public static Result index() {
        return ok(index.render("I'm trying to solve merge"));
    }
    
    public static Result login() {
		return ok(login.render());
	}
    
    public static Result welcome(){
    	
    	Logger.info("Entered into Welcome API");
    	return ok(welcome.render("Welcome to git learning"));
    }

}
