package info.upac.entities;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class FeuilleDeSoins {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private List<String> medicamentsPrescrits;
	private float tarif;
}
