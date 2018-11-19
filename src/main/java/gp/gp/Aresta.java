package gp.gp;
import org.jgrapht.Graph;
import org.jgrapht.WeightedGraph;
import org.jgrapht.graph.DefaultEdge;
import org.jgrapht.graph.DefaultWeightedEdge;
import org.jgrapht.graph.SimpleGraph;
import org.jgrapht.graph.SimpleWeightedGraph;

public class Aresta extends DefaultWeightedEdge{
	
	public int peso;
	public Vertice origem;
	public Vertice destino;
	
	
	
	
	public Aresta() {
		super();
		this.peso = 1;
	}
	
	
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Aresta) {
			Aresta a = (Aresta) obj;
			if(a.origem.equals(this.origem)&& a.destino.equals(this.destino)) {
				return true;
			}
			if(a.destino.equals(this.origem)&&a.origem.equals(this.destino)) {
				return true;
			}
		}
		
		return false;
	}
	
	public int getPeso() {
		return peso;
	}
	
	public void setPeso(int peso) {
		this.peso = peso;
	}
	
	public Vertice getOrigem() {
		return origem;
	}
	
	public void setOrigem(Vertice origem) {
		this.origem = origem;
	}
	
	public Vertice getDestino() {
		return destino;
	}
	
	public void setDestino(Vertice destino) {
		this.destino = destino;
	}
	
	@Override
	public String toString() {
		
		return ("("+super.getSource()+","+super.getTarget()+","+this.getWeight()+")");
	}
	
	
	@Override
	protected double getWeight() {
		// TODO Auto-generated method stub
		return this.peso;
	}
	
	
	@Override
	protected Object getSource() {
		// TODO Auto-generated method stub
		return super.getSource();
	}
	

	@Override
	protected Object getTarget() {
		// TODO Auto-generated method stub
		return super.getTarget();
	}
	
	

}
