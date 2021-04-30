package info.upac.dao.impl;

import java.util.List;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.Transaction;

import info.upac.dao.interfac.IGeneralisteDao;
import info.upac.dao.interfac.ISpecialisteDao;
import info.upac.dao.utils.SingletonHibernateUtil;
import info.upac.entities.Generaliste;
import info.upac.entities.Specialiste;

public class SpecialisteDaoImpl implements ISpecialisteDao{

	@Override
	public void saveSpecialiste(Specialiste s) {
		Transaction transaction = null;
		try (Session session = SingletonHibernateUtil.getSessionFactory().openSession()) {
			transaction = session.beginTransaction();
			
			session.save(s);
			
			transaction.commit();
		} catch (Exception e) {
			if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
		}
	}
}
