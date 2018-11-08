package gp.gp;

import java.util.ArrayList;
import java.util.List;

import org.jgrapht.Graph;

public class graphFactory {
	Grafo g = new Grafo();
	// este metodo recebe um array com um conjunto de arestas que contem pares
	// de vertices [a,b] a origem b destino
	public Graph<Vertice, Aresta> GenerateGraph(ArrayList<ArrayList<String>> a2) {
		
		
		
		for( ArrayList<String> a: a2) {
			String o = a.get(0);
			String d = a.get(1);
			
			Vertice origem = new Vertice(o);
			Vertice destino = new Vertice(d);
			g.addVertice(origem);
			g.addVertice(destino);
			g.addAresta(origem, destino);
		}
		
		
			
			return g.getG();
	}
}
