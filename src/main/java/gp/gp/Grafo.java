package gp.gp;
import org.jgrapht.Graph;
import org.jgrapht.WeightedGraph;
import org.jgrapht.graph.DefaultDirectedWeightedGraph;
import org.jgrapht.graph.DefaultEdge;
import org.jgrapht.graph.SimpleGraph;
import org.jgrapht.graph.SimpleWeightedGraph;

public class Grafo {
	
	 private Graph<Vertice,Aresta> g = new DefaultDirectedWeightedGraph(DefaultEdge.class);
	
	public void addAresta(Vertice origem , Vertice destino) {
		
		Aresta aux = g.getEdge(origem,destino);
		Aresta aux2 = g.getEdge(destino,origem);
		
		if(aux != null) {
			
			g.getEdge(origem,destino).setPeso(aux.getPeso() + 1);
			
		}
		
		else if(aux2 != null) {
			
			g.getEdge(origem,destino).setPeso(aux2.getPeso() + 1);
		}
		
		
		
		else {try {
		
			g.addEdge(origem,destino);}
		 catch(Exception e) {
			 System.out.println(e);
		 }
		}
	}
	
	public boolean addVertice(Vertice v) {
		
		return g.addVertex(v);
		
	}

	public Graph<Vertice, Aresta> getG() {
		return g;
	}

	public void setG(Graph<Vertice, Aresta> g) {
		this.g = g;
	}
	
}
