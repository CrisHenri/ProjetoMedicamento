package app.easykey.entidade;

public enum StatusAtendente {
	LIVRE("Livre"),OCUPADO("Ocupado");
	
	//descurcao da enumera��o
	private String descricao;
	
	private StatusAtendente(String descricao){
		this.descricao = descricao;
	}
	
	@Override
	public String toString() {
		return descricao;
	}
}
