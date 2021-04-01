package es.faculdade.vestibular.igts.provas.correcao.model;

import java.util.List;

import javax.persistence.Id;

import es.faculdade.vestibular.igts.model.Candidato;
import lombok.Data;

@Data
public class ResultadoVestibular {

	@Id
	private Integer idResultado;
	private ProvaVestibular provaVestibular;
	
	public List<Candidato> mostrandoResultadoAprovados(){
		return	provaVestibular.getCandidatosAprovados();
	}
}
