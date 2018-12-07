package gp.gp;

import java.util.ArrayList;
import java.util.List;

import org.jgrapht.Graph;

public class graphFactory {
	Grafo g;
	
	public graphFactory() {
		g = new Grafo();
	}
	// este metodo recebe um array com um conjunto de arestas que contem pares
	// de vertices [a,b] a origem b destino
	public Graph<Vertice, Aresta> GenerateGraph(ArrayList<ArrayList<String>> a2) {
		 
		
		
		
		for( ArrayList<String> a: a2) {
			String o = a.get(0);
			String d = a.get(1);
	
			Vertice origem = getv(o);
			Vertice destino = getv(d);
			
			if(origem == null) {
				origem = new Vertice(o);
				g.addVertice(origem);
			}
			
			if(destino == null) {
				destino = new Vertice(d);
				g.addVertice(destino);
			}
			
			g.addAresta(origem, destino);
		}
		
		
			
			return g.getG();
	}
	
	public Vertice getv(String id) {
		
		for(Vertice v : g.getG().vertexSet()) {
		    
			if(v.getId()+"" == id+"") {
				return v;
			}
		}
		
	return null;
		
	}
	
	
	
	
	
}
