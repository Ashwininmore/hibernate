package mypack;
import org.hibernate.*;
import org.hibernate.cfg.*;

public class StudentMain {
public static void main(String[] args) {

	Configuration c=new Configuration();
	c.configure("hibernate.cfg.xml");
	SessionFactory factory = c.buildSessionFactory();
	Session session=factory.openSession();
	Transaction t=session.beginTransaction();
	Student s1=new Student();
	s1.setRollno(101);
	s1.setStdname("Ram");
	s1.setMarks(85);
	session.save(s1);
	t.commit();
	session.close();
	}
}