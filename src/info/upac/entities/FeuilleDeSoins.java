package info.upac.entities;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class FeuilleDeSoins {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String medicamentsPrescrits;
	private float tarif;
	
	@OneToOne
	private Remboursement remboursement;
	
	@OneToOne
	private Consultation consultation;

	public FeuilleDeSoins() {
		super();
		// TODO Auto-generated constructor stub
	}

	public FeuilleDeSoins(String medicamentsPrescrits, float tarif, Remboursement remboursement,
			Consultation consultation) {
		super();
		this.medicamentsPrescrits = medicamentsPrescrits;
		this.tarif = tarif;
		this.remboursement = remboursement;
		this.consultation = consultation;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getMedicamentsPrescrits() {
		return medicamentsPrescrits;
	}

	public void setMedicamentsPrescrits(String medicamentsPrescrits) {
		this.medicamentsPrescrits = medicamentsPrescrits;
	}

	public float getTarif() {
		return tarif;
	}

	public void setTarif(float tarif) {
		this.tarif = tarif;
	}

	public Remboursement getRemboursement() {
		return remboursement;
	}

	public void setRemboursement(Remboursement remboursement) {
		this.remboursement = remboursement;
	}

	public Consultation getConsultation() {
		return consultation;
	}

	public void setConsultation(Consultation consultation) {
		this.consultation = consultation;
	}
}
