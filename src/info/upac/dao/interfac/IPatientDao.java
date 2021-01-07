package info.upac.dao.interfac;

import java.util.List;

import info.upac.entities.Patient;

public interface IPatientDao {
	public void savePatient(Patient p);

	public void updatePatient(Patient p);

	public void deletePatient(Long id);

	public Patient getPatient(Long id);

	public List<Patient> getAllPatient();
}
