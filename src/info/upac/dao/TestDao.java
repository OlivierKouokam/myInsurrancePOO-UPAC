package info.upac.dao;

import java.util.List;

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
import info.upac.entities.Personne;

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
			
			Personne p1 = new Personne();
			p1.setUsername("admin");
			p1.setPassword("1234");
			p1.setRole("admin");
			Generaliste g1 = new Generaliste("MBOUTCHUIN", "ISABELLE", "MBOUDA", "12-04-1994", "BATCHAM", "694045103");
			g1.setCategorie(Generaliste.class.getSimpleName().toLowerCase()); g1.setRole("medecin");
			Generaliste g2 = new Generaliste("DONGMO", "Merci", "BAMENDA", null, "MAMFE", "699887755");
			g2.setCategorie(Generaliste.class.getSimpleName().toLowerCase()); g2.setRole("medecin");
			Generaliste g3 = new Generaliste("GAINGNE", "Murielle", "BAMENDA", null, "MAMFE", "699887755"); 
			g3.setCategorie(Generaliste.class.getSimpleName().toLowerCase()); g3.setRole("medecin");
			Generaliste g4 = new Generaliste("NEWYORK", "Dior", "TEXAS", null, "BATCHAM", "694045103");
			g4.setCategorie(Generaliste.class.getSimpleName().toLowerCase()); g4.setRole("medecin");
//			Generaliste g5 = new Generaliste(nom, prenom, adresse, dateNaissance, adresseCabinet, phoneCabinet)
			
			personneDao.savePersonne(p1);
			generalisteDao.saveGeneraliste(g1);
			generalisteDao.saveGeneraliste(g2);
			generalisteDao.saveGeneraliste(g3);
			generalisteDao.saveGeneraliste(g4);
			
			System.out.println("--------------");
			List<Generaliste> gnrlts = generalisteDao.getGeneralistesParNoms("");
			for (Generaliste g : gnrlts) {
				System.out.println(g.getAdresseCabinet());
				System.out.println(g.getPhoneCabinet());
			}
			System.out.println("--------------");
			
			System.exit(0);
			
		} catch (Exception e) {
			e.printStackTrace();
		}

		
		

	}

}
