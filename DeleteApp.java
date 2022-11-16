package com.cls.hibernatecls;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class DeleteApp {
	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory sf = cfg.buildSessionFactory();
		Session ss = sf.openSession();
		Student st = (Student)ss.load(Student.class, 2);
		Transaction tr =ss.beginTransaction();
		ss.delete(st);
		tr.commit();
		ss.close();
		sf.close();
		System.out.println("data deleted successfully");
	}

}
