package info.upac.dao.utils;

import java.util.Properties;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;
import org.hibernate.service.ServiceRegistry;

import info.upac.entities.Consultation;
import info.upac.entities.FeuilleDeSoins;
import info.upac.entities.Generaliste;
import info.upac.entities.Medecin;
import info.upac.entities.Patient;
import info.upac.entities.Personne;
import info.upac.entities.Remboursement;
import info.upac.entities.Specialiste;
import info.upac.entities.VisiteSpecialiste;

/**
 * Java based configuration
 * @author ramesh Fadatare
 *
 */
public class SingletonHibernateUtil {
	private static SessionFactory sessionFactory;

	public static SessionFactory getSessionFactory() {
		if (sessionFactory == null) {
			try {
				Configuration configuration = new Configuration();

				// Hibernate settings equivalent to hibernate.cfg.xml's properties
				Properties settings = new Properties();
				settings.put(Environment.DRIVER, "com.mysql.jdbc.Driver");
				settings.put(Environment.URL, "jdbc:mysql://localhost:3306/db_myinsurrance?useSSL=false&serverTimezone=UTC");
				settings.put(Environment.USER, "root");
				settings.put(Environment.PASS, "");
				settings.put(Environment.DIALECT, "org.hibernate.dialect.MySQL5Dialect");

				settings.put(Environment.SHOW_SQL, "true");

				settings.put(Environment.CURRENT_SESSION_CONTEXT_CLASS, "thread");

				settings.put(Environment.HBM2DDL_AUTO, "create-drop");

				configuration.setProperties(settings);
				configuration.addAnnotatedClass(Consultation.class);
				configuration.addAnnotatedClass(FeuilleDeSoins.class);
				configuration.addAnnotatedClass(Generaliste.class);
				configuration.addAnnotatedClass(Medecin.class);
				configuration.addAnnotatedClass(Patient.class);
				configuration.addAnnotatedClass(Remboursement.class);
				configuration.addAnnotatedClass(Specialiste.class);
				configuration.addAnnotatedClass(Personne.class);
				configuration.addAnnotatedClass(VisiteSpecialiste.class);

				ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder()
						.applySettings(configuration.getProperties()).build();
				System.out.println("Hibernate Java Config serviceRegistry created");
				sessionFactory = configuration.buildSessionFactory(serviceRegistry);
				return sessionFactory;

			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return sessionFactory;
	}
}
