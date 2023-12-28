package mypack;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main {

	public static void main(String[] args) {
		Configuration c=new Configuration();
		c.configure("hibernate.cfg.xml");
		SessionFactory factory = c.buildSessionFactory();
		Session session=factory.openSession();
		Transaction t=session.beginTransaction();
		
		Employee e1= new Employee();
		e1.setName("Ashu");
		Regular_Emp e2=new Regular_Emp();
		e2.setName("Swami");
		e2.setSalary(66000);
		e2.setBonus(1200);
		Contract_Emp e3=new Contract_Emp();
		e3.setName("Aakash");
		e3.setPay_per_hour(1000);
		e3.setContract_period("12 months");
		
		session.persist(e1);
		session.persist(e2);
		session.persist(e3);
		
		t.commit();
		session.close();

	}

}
