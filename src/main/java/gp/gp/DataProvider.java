package gp.gp;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

public class DataProvider {
	
	
	public JsonObject getjson(String movieId) {
		String fim = "?api_key=91e41056f6b7f4453d009dc51fc2732b&language=en-US&external_source=imdb_id";
		String inicio = "https://api.themoviedb.org/3/find/";
		String sURL = inicio + movieId + fim;
		
		try {
	    URL url = new URL(sURL);
	    URLConnection request = url.openConnection();
	    request.connect();
	    JsonParser jp = new JsonParser(); //from gson
	    JsonElement root = jp.parse(new InputStreamReader((InputStream) request.getContent())); //Convert the input stream to a json element
	    JsonObject rootobj = root.getAsJsonObject(); //May be an array, may be an object.
        JsonArray k = rootobj.get("person_results").getAsJsonArray();
        JsonObject l = (JsonObject) k.get(0);
	    return l ;}
		
		catch(Exception e){
			return null;
		}

	    
	}
	
}
