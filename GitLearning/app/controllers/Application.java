package controllers;

import play.*;
import play.mvc.*;

import views.html.*;

public class Application extends Controller {

    public static Result index() {
        System.out.println("Hi Good Afternoon every body")
        return ok(index.render("Welcome to the world of :Arvind Agrwal abc ..... :) "));

    }
    
    public static Result login() {
		return ok(login.render());
	}
    
   
}
