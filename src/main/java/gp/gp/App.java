package gp.gp;
import java.util.ArrayList;
import java.util.Set;

import org.jgrapht.Graph;
import org.jgrapht.UndirectedGraph;
import org.jgrapht.alg.util.VertexDegreeComparator;
import org.jgrapht.graph.DefaultDirectedWeightedGraph;

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
    	CsvReader cs = new CsvReader();
    	
    	graphFactory gf= new graphFactory(); 
    	// gera o grafo a partir do csv
    	//ArrayList<ArrayList<String>> a =  cs.read("C:/Users/Leonardo/Desktop/resp/src/resources/convertcsvComrep.csv");
    	
    	
        //Graph<Vertice, Aresta> g = gf.GenerateGraph(a);
        
        //VertexDegreeComparator<Vertice, Aresta> comp = new  VertexDegreeComparator<Vertice, Aresta>((UndirectedGraph<Vertice, Aresta>) g);        
       
        // estão como comentario Pois não conseguimos enviar o csv ao git
    	
    
        
        
        
        
    }
} 
