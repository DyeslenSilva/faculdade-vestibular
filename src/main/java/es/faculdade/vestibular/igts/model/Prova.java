package es.faculdade.vestibular.igts.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Data
public class Prova {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idProva;
	
	
	private Candidato candidato;
	
	private Inscricao inscricao;
	
	@Column
	private String localProva;
	
	@Column
	private Date dataProva;
	
	@Column
	private Date horaProva;
}
