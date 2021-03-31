package es.faculdade.vestibular.igts.provas.model;

import es.faculdade.vestibular.igts.model.Candidato;
import lombok.Data;

@Data
public class ProvaPorCurso {

	private String curso;
	private Candidato candidato;
}
