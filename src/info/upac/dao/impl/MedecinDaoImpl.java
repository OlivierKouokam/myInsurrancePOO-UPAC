package info.upac.dao.impl;

import java.util.List;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.Transaction;

import info.upac.dao.interfac.IMedecinDao;
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
	
	@Override
	public void updateMedecin(Medecin m) {
		Transaction transaction = null;
		try (Session session = SingletonHibernateUtil.getSessionFactory().openSession()) {
			transaction = session.beginTransaction();
			
			session.update(m);
			
			transaction.commit();
		} catch (Exception e) {
			if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
		}
	}
	
	@Override
	public void deleteMedecin(Long id) {

		Transaction transaction = null;
		try (Session session = SingletonHibernateUtil.getSessionFactory().openSession()) {
			// start a transaction
			transaction = session.beginTransaction();

			// Delete a user object
			Medecin m = session.get(Medecin.class, id);
			if (m != null) {
				session.delete(m);
				System.out.println("Medecin is deleted");
			}

			// commit transaction
			transaction.commit();
		} catch (Exception e) {
			if (transaction != null) {
				transaction.rollback();
			}
			e.printStackTrace();
		}
	}
	
	@Override 
	public Medecin getMedecin(Long id) {

		Transaction transaction = null;
		Medecin m = null;
		try (Session session = SingletonHibernateUtil.getSessionFactory().openSession()) {
			// start a transaction
			transaction = session.beginTransaction();
			// get an user object
			m = session.get(Medecin.class, id);
			// commit transaction
			transaction.commit();
		} catch (Exception e) {
			if (transaction != null) {
				transaction.rollback();
			}
			e.printStackTrace();
		}
		return m;
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public List<Medecin> getAllMedecin() {

		Transaction transaction = null;
		List<Medecin> listOfMedecin = null;
		try (Session session = SingletonHibernateUtil.getSessionFactory().openSession()) {
			// start a transaction
			transaction = session.beginTransaction();
			// get an user object
			
			listOfMedecin = session.createQuery("from User").getResultList();
			
			// commit transaction
			transaction.commit();
		} catch (Exception e) {
			if (transaction != null) {
				transaction.rollback();
			}
			e.printStackTrace();
		}
		return listOfMedecin;
	}
}
