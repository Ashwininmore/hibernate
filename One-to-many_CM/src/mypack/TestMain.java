package mypack;
import java.util.ArrayList;
import org.hibernate.*;
import org.hibernate.cfg.Configuration;
public class TestMain {
	public static void main(String[] args) {
		Configuration c=new Configuration();
		c.configure("hibernate.cfg.xml");
		SessionFactory factory=c.buildSessionFactory();
		Session session=factory.openSession();
		Transaction t=session.beginTransaction();
		
		Employee e1=new Employee();
		e1.setEmpname("Amit varma");
		e1.setSalary(45677);
		Employee e2=new Employee();
		e2.setEmpname("Mayur Patil");
		e2.setSalary(65677);
		Employee e3=new Employee();
		e3.setEmpname("Rohit patil");
		e3.setSalary(75677);
		Employee e4=new Employee();
		e4.setEmpname("Raj varma");
		e4.setSalary(35677);
		
		ArrayList<Employee> list1=new ArrayList<Employee>();
		list1.add(e1);
		list1.add(e2);
		list1.add(e3);
		
		ArrayList<Employee> list2=new ArrayList<Employee>();
		list2.add(e4);
		
		Department d1=new Department();
		d1.setDeptname("IT");
		d1.setEmp(list1);
		Department d2=new Department();
		d2.setDeptname("Marketing");
		d2.setEmp(list2);
		
		session.persist(d1);
		session.persist(d2);
		t.commit();
		session.close();
		System.out.println("success");
	}
}