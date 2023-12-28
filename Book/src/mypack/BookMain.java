package mypack;
import java.util.Scanner;

import org.hibernate.*;
import org.hibernate.cfg.Configuration;

public class BookMain {

	public static void main(String[] args) {
		Configuration c=new Configuration();
		c.configure("hibernate.cfg.xml");
		SessionFactory factory = c.buildSessionFactory();
		Session session=factory.openSession();
		Transaction t=session.beginTransaction();
		
		Scanner sc=new Scanner(System.in);
		Book b1=new Book();
		System.out.println("Enter Book id,title,price");
		int bid=sc.nextInt();
		String title=sc.next();
		float price=sc.nextFloat();
		b1.setBid(bid);
		b1.setTitle(title);
		b1.setPrice(price);
		session.persist(b1);
		t.commit();
		session.close();
		
	}

}
