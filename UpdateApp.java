package com.cls.hibernatecls;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class UpdateApp {
	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory sf = cfg.buildSessionFactory();
		Session ss = sf.openSession();
		
		Student std = (Student) ss.get(Student.class, (2));
		Transaction tr=ss.beginTransaction();
		std.setPer(66.32);
		tr.commit();
		ss.close();
		sf.isClosed();
		System.out.println("data updated successfully");
	}

}
