package info.upac.entities;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.OneToMany;
import javax.persistence.PrimaryKeyJoinColumn;

@Entity

//@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
//@DiscriminatorColumn(name = "TYPE_MEDECIN",discriminatorType = DiscriminatorType.STRING, length = 11)
//@DiscriminatorValue("MEDECIN")
@PrimaryKeyJoinColumn(name = "id")
@Inheritance(strategy = InheritanceType.JOINED)
public class Medecin extends Personne{
	private String adresseCabinet;
	private String phoneCabinet;
	
	@OneToMany(mappedBy = "medecin")
	private List<Consultation> consultations;
	
	public Medecin() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Medecin(String nom, String prenom, String adresse, String dateNaissance, String adresseCabinet, String phoneCabinet) {
		super(nom, prenom, adresse, dateNaissance);
		this.adresseCabinet = adresseCabinet;
		this.phoneCabinet = phoneCabinet;
		// TODO Auto-generated constructor stub
	}
	public Medecin(String adresseCabinet, String phoneCabinet, List<Consultation> consultations) {
		super();
		this.adresseCabinet = adresseCabinet;
		this.phoneCabinet = phoneCabinet;
		this.consultations = consultations;
	}
	public String getAdresseCabinet() {
		return adresseCabinet;
	}
	public void setAdresseCabinet(String adresseCabinet) {
		this.adresseCabinet = adresseCabinet;
	}
	public String getPhoneCabinet() {
		return phoneCabinet;
	}
	public void setPhoneCabinet(String phoneCabinet) {
		this.phoneCabinet = phoneCabinet;
	}
	public List<Consultation> getConsultations() {
		return consultations;
	}
	public void setConsultations(List<Consultation> consultations) {
		this.consultations = consultations;
	}
	
	
}
