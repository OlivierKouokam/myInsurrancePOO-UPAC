package info.upac.dao;

import org.hibernate.Session;

import info.upac.dao.impl.ConsultationDaoImpl;
import info.upac.dao.impl.FeuilleDeSoinsDaoImpl;
import info.upac.dao.impl.GeneralisteDaoImpl;
import info.upac.dao.impl.PersonneDaoImpl;
import info.upac.dao.interfac.IFeuilledeSoinsDao;
import info.upac.dao.interfac.IGeneralisteDao;
import info.upac.dao.interfac.IPersonneDao;
import info.upac.dao.utils.SingletonHibernateUtil;
import info.upac.entities.Generaliste;

public class TestDao {

	public static void main(String[] args) {
		
		try {
			ConsultationDaoImpl consultationDaoImpl = new ConsultationDaoImpl();
			IFeuilledeSoinsDao feuilledeSoinsDao = new FeuilleDeSoinsDaoImpl();
			IPersonneDao personneDao = new PersonneDaoImpl();
			IGeneralisteDao generalisteDao = new GeneralisteDaoImpl();
			
			System.out.println(consultationDaoImpl + "\n" + feuilledeSoinsDao + "\n" + personneDao + "\n");
			System.out.println("Bonjour tout le monde...");
			
			Session session = SingletonHibernateUtil.getSessionFactory().openSession();
			
			System.out.println("Hibernate Session successfully initialised !!!");
			
			Generaliste g1 = new Generaliste("MBOUTCHUIN", "ISABELLE", "MBOUDA", "12-04-1994", "BATCHAM", "694045103");
			Generaliste g2 = new Generaliste("BATCHAM", "694045103", null);
			generalisteDao.saveGeneraliste(g1);
			generalisteDao.saveGeneraliste(g2);
			System.exit(0);
			
		} catch (Exception e) {
			e.printStackTrace();
		}

		
		

	}

}
