package controllers;

import play.*;
import play.mvc.*;

import java.util.*;

import models.*;

public class Application extends Controller {

    public static void index() {
        render();
    }
    
    public static void operation(String arg1, String arg2, String selection) {
        render(arg1, arg2, selection);
    }

}
