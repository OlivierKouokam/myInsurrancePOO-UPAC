package info.upac.dao.impl;

import org.hibernate.Session;
import org.hibernate.Transaction;

import info.upac.dao.interfac.IPersonneDao;
import info.upac.dao.utils.SingletonHibernateUtil;
import info.upac.entities.Personne;

public class PersonneDaoImpl implements IPersonneDao {

	@Override
	public void savePersonne(Personne p) {
		Transaction transaction = null;
		try (Session session = SingletonHibernateUtil.getSessionFactory().openSession()) {
			transaction = session.beginTransaction();
			
			session.save(p);
			
			transaction.commit();
		} catch (Exception e) {
			if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
		}
	}

}
