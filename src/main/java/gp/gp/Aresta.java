package gp.gp;

public class Aresta {
	
	private int peso;
	private Vertice origem;
	private Vertice destino;
	
	
	Aresta(Vertice origem,Vertice destino){
		this.peso = 1;
		this.origem = origem;
		this.destino = destino;
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
	
	
	

}
