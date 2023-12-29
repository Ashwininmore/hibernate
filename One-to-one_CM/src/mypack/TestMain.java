package mypack;
import org.hibernate.*;
import org.hibernate.cfg.Configuration;
public class TestMain {
	public static void main(String[] args) {
		Configuration cfg=new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory=cfg.buildSessionFactory();
		Session session=factory.openSession();
		Transaction tr=session.beginTransaction();
		
		Employee e1=new Employee();
		e1.setEmpname("Raj");
		e1.setSalary(34567);
		Address a1=new Address();
		a1.setCity("pune");
		a1.setState("MH");
		a1.setCountry("India");
		a1.setEmp(e1);
		e1.setAddr(a1);
		session.persist(a1);
		session.persist(e1);
		tr.commit();
		session.close();
	}
}