package br.cnec.fcsl.controle;

import java.util.Calendar;

import app.easykey.entidade.Senha;
import app.easykey.entidade.SenhaDao;
import app.easykey.entidade.TipoSenha;

public class Controle {
		
		SenhaDao senhaDb= new  SenhaDao();//instancia o objeto senhaDao que contém métodos para trabalhar com o banco
	//Métodos que irá gerar a senha
		public void gerarSenha(TipoSenha tipoSenha){//recebe o tipo de senha que deverá ser armazenado
			Senha novaSenha= new Senha();//instancia uma nova senha
			novaSenha.setData(Calendar.getInstance());//atribui a data do objeto a data atual do sistema
			novaSenha.setSenha(tipoSenha);//seta o tipo da senha para o tipoSenha que foi recebido como parâmetro
			senhaDb.salvar(novaSenha);//chama o metódo da classe Dao que salva a senha no banco
		}
		public void chamarSenha(){
			
		}
		public void buscarOutraFila(){
			
		}
		public void consultar(){
			
		}
		
}
