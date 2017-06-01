package br.cnec.fcsl.controle;

import java.util.Calendar;

import app.easykey.entidade.Senha;
import app.easykey.entidade.SenhaDao;
import app.easykey.entidade.TipoSenha;

public class Controle {
		
		SenhaDao senhaDb= new  SenhaDao();//instancia o objeto senhaDao que cont�m m�todos para trabalhar com o banco
	//M�todos que ir� gerar a senha
		public void gerarSenha(TipoSenha tipoSenha){//recebe o tipo de senha que dever� ser armazenado
			Senha novaSenha= new Senha();//instancia uma nova senha
			novaSenha.setData(Calendar.getInstance());//atribui a data do objeto a data atual do sistema
			novaSenha.setSenha(tipoSenha);//seta o tipo da senha para o tipoSenha que foi recebido como par�metro
			senhaDb.salvar(novaSenha);//chama o met�do da classe Dao que salva a senha no banco
		}
		public void chamarSenha(){
			
		}
		public void buscarOutraFila(){
			
		}
		public void consultar(){
			
		}
		
}
