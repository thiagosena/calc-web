package controllers;

import play.*;
import play.mvc.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.*;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

public class Application extends Controller {
	public static String recurso = "http://calclib-thiagosena.rhcloud.com/calclib/";
    
	public static void index() {
        render();
    }
    
    public static void operation(String arg1, String arg2, String selection) {
    	String result = parse(recurso+selection+"?valor1="+arg1+"&valor2="+arg2);
        render(arg1, arg2, selection, result);
    }
    
    public static String parse(String resp) {
    	URL url;
    	String inputLine = "";
		try {
			// get URL content
			url = new URL(resp);
			URLConnection conn = url.openConnection();
 
			// open the stream and put it into BufferedReader
			BufferedReader br = new BufferedReader(
                               new InputStreamReader(conn.getInputStream()));
 
			inputLine = br.readLine();

 			br.close();
 
 			
 			
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return inputLine;
    }

}
