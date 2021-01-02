package info.upac.entities;

import java.util.List;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.OneToMany;

@Entity
@DiscriminatorValue("GENERALISTE")
public class Generaliste extends Medecin{
	@OneToMany(mappedBy = "medecinTraitant")
	private List<Patient> patients;

	public Generaliste() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Generaliste(String adresseCabinet, String phoneCabinet, List<Consultation> consultations) {
		super(adresseCabinet, phoneCabinet, consultations);
		// TODO Auto-generated constructor stub
	}

	public Generaliste(String nom, String prenom, String adresse, String dateNaissance, String adresseCabinet,
			String phoneCabinet) {
		super(nom, prenom, adresse, dateNaissance, adresseCabinet, phoneCabinet);
		// TODO Auto-generated constructor stub
	}

	public Generaliste(List<Patient> patients) {
		super();
		this.patients = patients;
	}

	public List<Patient> getPatients() {
		return patients;
	}

	public void setPatients(List<Patient> patients) {
		this.patients = patients;
	}
	
}
