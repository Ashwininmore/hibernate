package mypack;

import org.hibernate.*;

import org.hibernate.cfg.Configuration;

public class Main {

	public static void main(String[] args) {
		Configuration c=new Configuration();
		c.configure("hibernate.cfg.xml");
		SessionFactory factory = c.buildSessionFactory();
		Session session=factory.openSession();
		Transaction t=session.beginTransaction();
		
		Address a1=new Address();
		a1.setCity("Jalgaon");
		a1.setState("Maharashtra");
		a1.setCountry("India");
		Employee e1=new Employee();
		e1.setEmpnm("Ashu");
		e1.setSalary(89000);
		e1.setAddr(a1);
		session.persist(e1);
		t.commit();
		session.close();

	}

}
