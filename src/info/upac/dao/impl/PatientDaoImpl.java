package info.upac.dao.impl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import info.upac.dao.interfac.IPatientDao;
import info.upac.dao.utils.SingletonHibernateUtil;
import info.upac.entities.Patient;

public class PatientDaoImpl implements IPatientDao{

	@Override
	public void savePatient(Patient p) {
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
	
	@Override
	public void updatePatient(Patient p) {
		Transaction transaction = null;
		try (Session session = SingletonHibernateUtil.getSessionFactory().openSession()) {
			transaction = session.beginTransaction();
			
			session.update(p);
			
			transaction.commit();
		} catch (Exception e) {
			if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
		}
	}
	
	@Override
	public void deletePatient(Long id) {

		Transaction transaction = null;
		try (Session session = SingletonHibernateUtil.getSessionFactory().openSession()) {
			// start a transaction
			transaction = session.beginTransaction();

			// Delete a user object
			Patient p = session.get(Patient.class, id);
			if (p != null) {
				session.delete(p);
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
	public Patient getPatient(Long id) {

		Transaction transaction = null;
		Patient p = null;
		try (Session session = SingletonHibernateUtil.getSessionFactory().openSession()) {
			// start a transaction
			transaction = session.beginTransaction();
			// get an user object
			p = session.get(Patient.class, id);
			// commit transaction
			transaction.commit();
		} catch (Exception e) {
			if (transaction != null) {
				transaction.rollback();
			}
			e.printStackTrace();
		}
		return p;
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public List<Patient> getAllPatient() {

		Transaction transaction = null;
		List<Patient> listOfPatient = null;
		try (Session session = SingletonHibernateUtil.getSessionFactory().openSession()) {
			// start a transaction
			transaction = session.beginTransaction();
			// get an user object
			
			listOfPatient = session.createQuery("from User").getResultList();
			
			// commit transaction
			transaction.commit();
		} catch (Exception e) {
			if (transaction != null) {
				transaction.rollback();
			}
			e.printStackTrace();
		}
		return listOfPatient;
	}
}
