package info.upac.dao;

import org.hibernate.Session;
import org.hibernate.Transaction;

import info.upac.dao.utils.SingletonHibernateUtil;
import info.upac.entities.Medecin;

public class MedecinDaoImpl implements IMedecinDao{

	@Override
	public void saveMedecin(Medecin m) {
		Transaction transaction = null;
		try (Session session = SingletonHibernateUtil.getSessionFactory().openSession()) {
			transaction = session.beginTransaction();
			
			session.save(m);
			
			transaction.commit();
		} catch (Exception e) {
			if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
		}
	}

}
