package info.upac.dao.impl;

import java.util.List;

import javax.persistence.Query;

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

	@SuppressWarnings("unchecked")
	@Override
	public List<Generaliste> getGeneralistesParNoms(String motCle) {
		Transaction transaction = null;
		List<Generaliste> generalists = null;
		try (Session session = SingletonHibernateUtil.getSessionFactory().openSession()) {
			// start a transaction
			transaction = session.beginTransaction();
			// get an user object
			
			Query query = session.createQuery("SELECT g from Generaliste g WHERE g.nom LIKE CONCAT('%',?1,'%')");
			query.setParameter(1, motCle);
			generalists = query.getResultList();
			
			// commit transaction
			transaction.commit();
		} catch (Exception e) {
			if (transaction != null) {
				transaction.rollback();
			}
			e.printStackTrace();
		}
		return generalists;
	}
}
