package info.upac.entities;

import java.util.List;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
@DiscriminatorValue("PATIENT")
public class Patient extends Personne{
	private String numeroSecuriteSocial;
	
	private String antecedentsMedicaux;
	
	@ManyToOne
	private Generaliste medecinTraitant;
	
	@OneToMany(mappedBy = "patient")
	List<Consultation> consultations;

	public Patient() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Patient(String nom, String prenom, String adresse, String dateNaissance) {
		super(nom, prenom, adresse, dateNaissance);
		// TODO Auto-generated constructor stub
	}

	public Patient(String numeroSecuriteSocial, String antecedentsMedicaux, Generaliste medecinTraitant,
			List<Consultation> consultations) {
		super();
		this.numeroSecuriteSocial = numeroSecuriteSocial;
		this.antecedentsMedicaux = antecedentsMedicaux;
		this.medecinTraitant = medecinTraitant;
		this.consultations = consultations;
	}	
}
