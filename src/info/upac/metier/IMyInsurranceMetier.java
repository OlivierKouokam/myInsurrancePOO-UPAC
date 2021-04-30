package info.upac.metier;

import info.upac.entities.Consultation;
import info.upac.entities.Generaliste;
import info.upac.entities.Patient;
import info.upac.entities.Personne;

public interface IMyInsurranceMetier {
	public Personne enregistrerPersonne();
	public Consultation enregistrerConsultation();
	public void prescrireMedicaments();
	public void prescrireVisiteSpecialiste();
	public Patient inscrireAssure();
	public Generaliste enregistrerMedecinTraitant();
	public void effectuerRemboursement();
}
