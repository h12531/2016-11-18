package edu.tsinghua.entity;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

public class Test2 {

	public static void main(String[] args) {
		
		Configuration cfg=new Configuration().configure();
		
		ServiceRegistry serviceRegistry=new ServiceRegistryBuilder().applySettings(cfg.getProperties()).buildServiceRegistry();
		SessionFactory sf=cfg.buildSessionFactory(serviceRegistry);
		
		Session session=sf.openSession();
		
		Transaction tx=session.beginTransaction();
		
		District dis=new District(1,"海淀区");
		District dis1=new District(2,"朝阳区");
	
	//	District dis =(District) session.get(District.class, 1);
	//	District dis1 =(District) session.get(District.class, 2);
		
		Street s1=new Street(1, "成府路", dis);
		Street s2=new Street(2, "双清路", dis);
		Street s3=new Street(3, "朝阳路", dis1);
		
		session.save(dis);
		session.save(dis1);
		
		session.save(s1);
		session.save(s2);
		session.save(s3);
		
//		
	
		tx.commit();
		
		session.close();
		sf.close();
		
	}

}
