package edu.tsinghua.entity;





import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;


public class Test {

	public static void main(String[] args) {
		//加载配置文件
		Configuration configuration=new Configuration().configure("/hibernate.cfg.xml");
		ServiceRegistry serviceRegistry=new ServiceRegistryBuilder().applySettings(configuration.getProperties()).buildServiceRegistry();
		//创建sessionfactory
		SessionFactory sf=configuration.buildSessionFactory(serviceRegistry);
	
		//创建session
		Session session=sf.openSession();
		//hql
		String hql="from Street s inner join s.dis";
		//创建查询对象
		Query query=session.createQuery(hql);
	
		List list=query.list();
		System.out.println(list.size());
	System.out.println(list.get(0).getClass());
		Object [] o= (Object[]) list.get(0);	
		System.out.println("ffff="+o.length);
		for (int i = 0; i < o.length; i++) {
			if(o[i] instanceof Street){
				Street s=(Street) o[i];
				System.out.println("fffffff="+s.getStreetName());
			}
			if (o[i] instanceof District) {
				District s=(District) o[i];
				System.out.println(s.getDistrictName());
			}
			
			
		}
		
		
		
		
		
		
		
		
		
		
		session.close();
		sf.close();

	}

}
