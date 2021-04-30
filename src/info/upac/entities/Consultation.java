package info.upac.entities;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Data @NoArgsConstructor @AllArgsConstructor @ToString
public class Consultation {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private Date dateConsultation;
	private boolean status;
	private String medecinSpecialiste;
	
	@ManyToOne
	private Patient patient;
	
	@ManyToOne
	private Medecin medecin;
	
	@OneToMany(mappedBy = "consultation")
	private List<VisiteSpecialiste> visiteSpecialistes;

	public Consultation(Date dateConsultation, Patient patient, Medecin medecin,
			List<VisiteSpecialiste> visiteSpecialistes) {
		super();
		this.dateConsultation = dateConsultation;
		this.patient = patient;
		this.medecin = medecin;
		this.visiteSpecialistes = visiteSpecialistes;
	}
	
}
