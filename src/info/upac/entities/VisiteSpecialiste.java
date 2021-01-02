package info.upac.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class VisiteSpecialiste {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@ManyToOne
	private Consultation consultation;
	@ManyToOne
	private Specialiste specialiste;
	public VisiteSpecialiste() {
		super();
		// TODO Auto-generated constructor stub
	}
	public VisiteSpecialiste(Consultation consultation, Specialiste specialiste) {
		super();
		this.consultation = consultation;
		this.specialiste = specialiste;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Consultation getConsultation() {
		return consultation;
	}
	public void setConsultation(Consultation consultation) {
		this.consultation = consultation;
	}
	public Specialiste getSpecialiste() {
		return specialiste;
	}
	public void setSpecialiste(Specialiste specialiste) {
		this.specialiste = specialiste;
	}
}
