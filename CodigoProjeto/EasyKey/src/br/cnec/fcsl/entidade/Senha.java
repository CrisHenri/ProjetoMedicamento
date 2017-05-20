package br.cnec.fcsl.entidade;

import java.util.Calendar;

public class Senha {
	//atributos da senha
	private long id;
	private TipoSenha senha;
	private Calendar data;
	
	
	
	//Getters and Setters
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public TipoSenha getSenha() {
		return senha;
	}
	public void setSenha(TipoSenha senha) {
		this.senha = senha;
	}
	public Calendar getData() {
		return data;
	}
	public void setData(Calendar data) {
		this.data = data;
	}
	
	
	

}
