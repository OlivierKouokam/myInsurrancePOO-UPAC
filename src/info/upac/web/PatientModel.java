package info.upac.web;

import java.util.ArrayList;
import java.util.List;

import info.upac.entities.Patient;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data @NoArgsConstructor
public class PatientModel {
	private String motCle;
	private List<Patient> patients = new ArrayList<Patient>();
	
}
