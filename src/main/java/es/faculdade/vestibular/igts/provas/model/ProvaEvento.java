package es.faculdade.vestibular.igts.provas.model;

import java.util.Calendar;

import es.faculdade.vestibular.igts.model.Candidato;
import lombok.Data;

@Data
public class ProvaEvento {

	private String idProva;
			
	private String tituloDoEvento;
	private String link;
	//private String nomeDoGrupo;
	private Candidato candidato;
	private Calendar dataDaProva;
	private String nomeDoEvento;
	private String urlEvento;
	private String message;
	private String paginaInicial;
	private LocalProva localProva;
	
	
}
