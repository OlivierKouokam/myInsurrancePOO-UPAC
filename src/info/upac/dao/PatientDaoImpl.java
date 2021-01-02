package info.upac.dao;

import org.hibernate.Session;
import org.hibernate.Transaction;

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
	
}
