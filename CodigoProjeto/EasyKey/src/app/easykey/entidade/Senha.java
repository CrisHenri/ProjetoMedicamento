package app.easykey.entidade;

import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.Columns;
@Entity
public class Senha {
	//atributos da senha
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	@Enumerated(EnumType.ORDINAL)
	private TipoSenha senha;
	@Temporal(TemporalType.TIMESTAMP)
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
