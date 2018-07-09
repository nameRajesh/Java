package test;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class UserTest {
	
	public static void main(String[] args) {
		
		UserDetails user = new UserDetails();
		// user.setUserId(1);
		Address homeAddress = new Address();
		homeAddress.setCountry("Nepal");
		Address officeAddress = new Address();
		officeAddress.setCountry("USA");
		List<Address> list = new ArrayList<>();
		list.add(homeAddress);
		list.add(officeAddress);
		user.setUserName("user2");
		user.setAddress(list);
		
	
		SessionFactory sf= new Configuration().configure().buildSessionFactory();
		Session session = sf.openSession();
		session.beginTransaction();
		session.save(user);
		// List<UserDetails> list = session.createCriteria(UserDetails.class).list();
		 session.getTransaction().commit();
		session.close();
		
		/*for(UserDetails ud:list) {
			System.out.println(ud.getUserId());
			System.out.println(ud.getUserName());
		}*/
		
		
	}

}
