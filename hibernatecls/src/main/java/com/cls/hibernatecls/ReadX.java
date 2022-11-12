package com.cls.hibernatecls;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class ReadX {
	
	public static void main(String[] args) {
		
		
		Configuration cfg =new Configuration();
		cfg.configure("hibernate.cfg.xml");
		 SessionFactory sf=cfg.buildSessionFactory();
	        Session ss = sf.openSession();
	        Student std = (Student)ss.get(Student.class,new Integer(2));
	        System.out.println("id :"+std.getId());
	        System.out.println("name :"+std.getName());
	        System.out.println("percentage:"+std.getPer());
		
		//life cycle of hibernate object
	}

}
