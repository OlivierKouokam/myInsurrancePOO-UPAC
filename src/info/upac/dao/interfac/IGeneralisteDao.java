package info.upac.dao.interfac;

import java.util.List;

import info.upac.entities.Generaliste;

public interface IGeneralisteDao {
	public void saveGeneraliste(Generaliste g);
	
	public List<Generaliste> getGeneralistesParNoms(String motCle);
}
