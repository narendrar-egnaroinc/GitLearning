package controllers;

import play.*;
import play.mvc.*;

import views.html.*;

public class Application extends Controller {

    public static Result index() {
        return ok(index.render("Tommorow is my birthday"));
    }
    public static Result login() {
		return ok(login.render());
	}

}
