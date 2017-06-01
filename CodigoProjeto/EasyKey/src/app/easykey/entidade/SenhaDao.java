package app.easykey.entidade;


import java.util.Calendar;
import java.util.List;




import org.hibernate.Hibernate;
import org.hibernate.Session;
import org.hibernate.query.Query;

import br.cnec.fcsl.util.*;

public class SenhaDao {
	
	Session session;
	public SenhaDao(){
		session= HibernateUtil.getSession();
	}
	//salva a senha no banco
	public void salvar(Senha senha){//recebe a senha que ir� ser salva como par�metro
      session.getTransaction().begin();//iniciando a sess�o
      session.saveOrUpdate(senha);//salva o objeto em mem�ria 
      session.getTransaction().commit();//Salva o objeto no banco de dados
	}
	
	public List<Senha> listarSenhas(TipoSenha tipo,Calendar data){
		int pesquisa= tipo.ordinal();
		Query query =  session.createQuery("from Senha s where s.tipoSenha= :tipo");
		query.setParameter("tipo", pesquisa);
		List<Senha> lista = query.list();
		return lista;
		
	}
}
