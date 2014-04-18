package com.hibernate.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.hibernate.dto.UserDetails;
import com.hibernate.dto.Address;
import com.hibernate.dto.Vehicle;
public class HibernateTest {
	
	public static void main(String args[])
	{
		UserDetails user = new UserDetails();
		//user.setUserId(3);
		user.setUsername("Harish");
		
		Vehicle vehicle = new Vehicle();
		vehicle.setVehicleName("car");
		
		user.getVehicle().add(vehicle);
		
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session= sessionFactory.openSession();
		
	/*	session.beginTransaction();
		session.save(user);
		session.getTransaction().commit();
		session.close();  */
		
	//	user=null;
		
	/*	session = sessionFactory.openSession();
		session.beginTransaction();
		user = (UserDetails) session.get(UserDetails.class, 1);  */
		
	//	System.out.println("UserName retrieved is :" + user.getUsername());
		
	/*	Address addr1 = new Address();
		addr1.setCity("London");
		addr1.setStreet("street1");
		addr1.setState("state1");
		addr1.setPinCode("1001");
		
		Address addr2 = new Address();
		addr2.setCity("Newyork");
		addr2.setStreet("street2");
		addr2.setState("state2");
		addr2.setPinCode("1002");
		
		user.getListOfAddresses().add(addr1);
		user.getListOfAddresses().add(addr2);*/
		
		session.beginTransaction();
		session.save(vehicle);
		session.save(user);
		session.getTransaction().commit();
		session.close();
		
	/*	session = sessionFactory.openSession();
		user = (UserDetails)session.get(UserDetails.class, 1);
		session.close();
		System.out.println("Size : "+ user.getListOfAddresses().size());;*/
		
	}

}
