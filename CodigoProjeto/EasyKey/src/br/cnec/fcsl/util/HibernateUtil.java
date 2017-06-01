package br.cnec.fcsl.util;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.hibernate.Session;

public class HibernateUtil {
	private static Session session;
	private static EntityManager em;

	public static Session getSession() {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("PU");
		em = emf.createEntityManager();
		session = (Session) em.getDelegate();
		return session;
	}

	public static void closeSession() {
		session.close();
	}
	
}
