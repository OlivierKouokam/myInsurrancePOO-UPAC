package info.upac.dao.impl;

import org.hibernate.Session;
import org.hibernate.Transaction;

import info.upac.dao.interfac.IGeneralisteDao;
import info.upac.dao.utils.SingletonHibernateUtil;
import info.upac.entities.Generaliste;

public class GeneralisteDaoImpl implements IGeneralisteDao{

	@Override
	public void saveGeneraliste(Generaliste g) {
		Transaction transaction = null;
		try (Session session = SingletonHibernateUtil.getSessionFactory().openSession()) {
			transaction = session.beginTransaction();
			
			session.save(g);
			
			transaction.commit();
		} catch (Exception e) {
			if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
		}
	}
}
