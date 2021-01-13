package info.upac.web;

import java.util.ArrayList;
import java.util.List;

import info.upac.entities.Generaliste;
import info.upac.entities.Medecin;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data @NoArgsConstructor
public class GeneralisteModel {
	private String motCle;
	private List<Generaliste> generalistes = new ArrayList<Generaliste>();
	
}
