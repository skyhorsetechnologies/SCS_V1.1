package com.scs.dao.master;

import java.util.ArrayList;
import java.util.List;





import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;
import org.springframework.stereotype.Repository;

import com.scs.model.master.MasterClientsBean;

@Repository
public class MasterDaoImpl implements MasterDaoInterface{

	@SuppressWarnings("unused")
	private static SessionFactory factory;	

	@SuppressWarnings({ "unchecked", "finally" })
	@Override
	public List<MasterClientsBean> getMasterDetails(long clId) {
		// TODO Auto-generated method stub
		System.out.println("entering hibernate..");
		 List<MasterClientsBean> adminVar=new ArrayList<MasterClientsBean>();
		SessionFactory factory=new MasterDaoImpl(){
			 SessionFactory getFactory(){
				 SessionFactory factory=new AnnotationConfiguration().configure().buildSessionFactory();
				 return factory;
			 }
		 }.getFactory();
		 
			Session session = factory.openSession();
		      Transaction tx = null;
		      try{
		    	  System.out.println("From Dao Impl :"+clId);
		         tx = session.beginTransaction();
		         System.out.println("Testing");
		         String queryS="from MasterClientsBean where clientId='"+clId+"'";
		         System.out.println("**********HIBERNATE QUERY FOR LOGIN PROCESS********"+queryS);
		         
		         adminVar=(List<MasterClientsBean>)session.createQuery(queryS).list();
		         
		        
		         tx.commit();
		      }catch (HibernateException e) {
		    	 e.printStackTrace();
		         if (tx!=null) tx.rollback();
		      }finally {
		         session.close(); 
		         return adminVar;
		      }		  
		
		
	}


}
