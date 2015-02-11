package controllers;

import play.*;
import play.mvc.*;

import views.html.*;

public class Application extends Controller {

    public static Result index() {
        return ok(index.render("your new application is not working.Please check"));
    }
    public static Result login() {
		return ok(login.render());
	}

}
