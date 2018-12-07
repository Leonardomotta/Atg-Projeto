package gp.gp;

import com.google.gson.JsonObject;
public class Vertice   {
	
	private String id ;
	
	


	private String sexo;
	private String nome;
	
	
	//construtor do vertice , recebe um id;
	
	public Vertice(String id) {
		
		DataProvider dp = new DataProvider();
		JsonObject dado = dp.getjson(id);
		this.id = id;
		if(dado != null) {
		this.nome = dado.get("name").getAsString();
		String aux = dado.get("gender").getAsString();
		if(aux == "1") {
			this.sexo = "Feminino";
		}
		else {this.sexo = "Masculino";}
		}
		
		
	}
	
	
	@Override
	public boolean equals(Object obj) {
		

		if(obj instanceof Vertice) {
			
			Vertice v = (Vertice) obj;
			if(this.getId().equals(v.getId())) {
				return true;
			}
		}
		
		return false;
	}
	
	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}


	public String getSexo() {
		return sexo;
	}


	public void setSexo(String sexo) {
		this.sexo = sexo;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}
	
	@Override
	public String toString() {
		return this.nome;
	}


}
