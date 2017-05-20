package app.easykey.entidade;

public enum TipoSenha {
	PREFERENCIAL("Preferêncial","Branco"), JUDICIARIO("Judiciário","Vermelho"), ALTO_CUSTO("Auto custo","Azul"), COMUM("Comum","Verde");
	
	//atributo descrição do enum
	private final String descricao,cor;
	
	private TipoSenha(String descricao,String cor){
		this.descricao = descricao;
		this.cor = cor;
	}
	public String getDescricao() {
		return descricao;
	}
	public String getCor(){
		return cor;
	}
	
	public String toString() {
		return descricao;
		
	};


}
