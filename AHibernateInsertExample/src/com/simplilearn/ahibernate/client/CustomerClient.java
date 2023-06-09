package com.simplilearn.ahibernate.client;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;

import com.simplilearn.ahibernate.Customer;

public class CustomerClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("START-***************-CustomerClient");
		
		SessionFactory factory=null;
		Transaction tx= null;
		Session session= null;
		
		try {
			
			//1. Create the Configuration Object 
			AnnotationConfiguration acfg= new AnnotationConfiguration();
			System.out.println("1. Create the Configuration Object ");
			
			//2. Call the configure method
			acfg=(AnnotationConfiguration)acfg.configure();
			System.out.println("2. Call the configure method");
			
			//3. Through the Configuration object call the build session factory
			factory= acfg.buildSessionFactory();
			System.out.println("3. Through the Configuration object call the build session factory");
			
			//4. With the help of factory object open the session
			session=factory.openSession();
			System.out.println("4. With the help if factory object open the session");
			
			//5. With the help of session object begin the transaction
			tx=session.beginTransaction();
			System.out.println("5. With the help of session object begin the transaction");
			
			
			//6. Prepare the business object
			//Customer customer =new Customer("Athar Zafar", "athar.zafar@simplilearn.com", 9870652, "Delhi", 986712);
			//Customer customer =new Customer("Vaibhav singh", "vaibhav.singh@simplilearn.com", 9870999, "Varanasi", 213712);
			Customer customer =new Customer("Navin vannam", "navin24@simplilearn.com", 9824663, "Solapur", 213713);
			System.out.println("6. Prepare the business object");
			
			//7. Save the Data
			session.save(customer);
			System.out.println("7. Save the Data");

			//8. Commit in to DB
			tx.commit();
			System.out.println("8. Commit in to DB");
			
		} catch (Exception e) {
			e.printStackTrace();
			System.err.println("*** Error occured while inserting the data in to DB");
		}
				
		
		//9. Close the resource
		session.close();
		factory.close();
		System.out.println("9. Close the resource");
		
		System.out.println("END-***************-StudentClient");
		
	}

}
