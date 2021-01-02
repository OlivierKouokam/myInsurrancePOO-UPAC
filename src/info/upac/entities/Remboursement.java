package info.upac.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Remboursement {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private float taux;	//en pourcentage
	private int montant;	//en monnaie
	private String destinataire;	//certainement celle du système bancaire concerné
	
	public Remboursement() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Remboursement(float taux, int montant, String destinataire) {
		super();
		this.taux = taux;
		this.montant = montant;
		this.destinataire = destinataire;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public float getTaux() {
		return taux;
	}
	public void setTaux(float taux) {
		this.taux = taux;
	}
	public int getMontant() {
		return montant;
	}
	public void setMontant(int montant) {
		this.montant = montant;
	}
	public String getDestinataire() {
		return destinataire;
	}
	public void setDestinataire(String destinataire) {
		this.destinataire = destinataire;
	}
	
}
