package info.upac.dao.interfac;

import java.util.List;

import info.upac.entities.Medecin;

public interface IMedecinDao {
	public void saveMedecin(Medecin m);

	public void updateMedecin(Medecin m);

	public void deleteMedecin(Long id);

	public Medecin getMedecin(Long id);

	public List<Medecin> getAllMedecin();
	
	
}
