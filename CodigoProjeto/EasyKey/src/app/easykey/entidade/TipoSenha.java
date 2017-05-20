package app.easykey.entidade;

public enum TipoSenha {
	PREFERENCIAL("Prefer�ncial","Branco"), JUDICIARIO("Judici�rio","Vermelho"), ALTO_CUSTO("Auto custo","Azul"), COMUM("Comum","Verde");
	
	//atributo descri��o do enum
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
