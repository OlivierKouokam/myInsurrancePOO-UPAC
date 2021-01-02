package info.upac.dao;

import org.hibernate.Session;

import info.upac.dao.utils.SingletonHibernateUtil;

public class TestDao {

	public static void main(String[] args) {
		
		try {
			ConsultationDaoImpl consultationDaoImpl = new ConsultationDaoImpl();
			IFeuilledeSoinsDao feuilledeSoinsDao = new FeuilleDeSoinsDaoImpl();
			IPersonneDao personneDao = new PersonneDaoImpl();
			
			System.out.println(consultationDaoImpl + "\n" + feuilledeSoinsDao + "\n" + personneDao + "\n");
			System.out.println("Bonjour tout le monde...");
			
			Session session = SingletonHibernateUtil.getSessionFactory().openSession();
			
			System.out.println("Hibernate Session successfully initialised !!!");
			
		} catch (Exception e) {
			e.printStackTrace();
		}

		
		

	}

}
