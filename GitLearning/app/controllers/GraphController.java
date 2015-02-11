package controllers;


import play.*;
import play.mvc.*;

import views.html.*;

public class GraphController extends Controller{

	public static Result AdminLogin(){
		System.out.println("hello!");
		return ok();
	}
}
