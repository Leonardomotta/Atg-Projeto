package gp.gp;
import java.util.ArrayList;

import org.jgrapht.Graph;
import org.jgrapht.WeightedGraph;
import org.jgrapht.graph.DefaultDirectedWeightedGraph;
import org.jgrapht.graph.DefaultEdge;
import org.jgrapht.graph.SimpleGraph;
import org.jgrapht.graph.SimpleWeightedGraph;

public class Grafo {
	
	 private Graph<Vertice,Aresta> g = new DefaultDirectedWeightedGraph(Aresta.class);
	 Aresta aux ;
	 Aresta aux2;
	public void addAresta(Vertice origem , Vertice destino) {
		
		  aux = myGetEdge(origem,destino);
		 aux2 = myGetEdge(destino,origem);

		if(aux != null) {
			System.out.println(aux);
			aux.setPeso(aux.getPeso()+ 1);
			
		}
		
		else if(aux2 != null) {
			
			aux2.setPeso(aux2.getPeso() +1);
		}
		
		
		
		else {try {
		
			g.addEdge(origem,destino);
			}
		 catch(Exception e) {
			 System.out.println(e.getCause());
		 }
		}
	}
	
	private Aresta myGetEdge(Vertice origem, Vertice destino) {
		for(Aresta a : g.edgeSet()) {
			if(a != null && origem != null && destino != null) {
			if (origem.equals(a.getSource()) && destino.equals(a.getTarget())) {
				return a;
			}
		}}
		return null;
	}

	public boolean addVertice(Vertice v) {
		if(g.vertexSet().contains(v)) {
			return false;
		}
		else {
		return g.addVertex(v);}
		
	}

	public Graph<Vertice, Aresta> getG() {
		return g;
	}

	public void setG(Graph<Vertice, Aresta> g) {
		this.g = g;
	}
	
}
