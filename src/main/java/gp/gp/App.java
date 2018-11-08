package gp.gp;
import java.util.ArrayList;

import org.jgrapht.Graph;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;

import gp.gp.DataProvider;

/**
 * 
 *
 */
public class App 

{
    public static void main( String[] args )
    {
    	graphFactory gf= new graphFactory(); 
    	ArrayList<ArrayList<String>> a =  new ArrayList<ArrayList<String>>();
    	ArrayList<String> x = new ArrayList<String>();
    	x.add("nm4043618");
    	x.add("nm0719637");
    	ArrayList<String> y = new ArrayList<String>();
    	y.add("nm4043618");
    	y.add("nm1107001");
        a.add(y);
        Graph<Vertice, Aresta> g = gf.GenerateGraph(a);
    }
}
