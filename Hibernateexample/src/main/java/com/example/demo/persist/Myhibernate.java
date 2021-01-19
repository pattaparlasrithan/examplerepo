package com.example.demo.persist;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Myhibernate {
	public void persistconfig() {
		Configuration cfg = new Configuration().configure();
		SessionFactory sf = cfg.buildSessionFactory();
		Session ses = sf.openSession();
		Transaction trx = ses.beginTransaction();
		ses.persist(trx);
		ses.save(trx);
		ses.getTransaction().commit();
		
	}

}
