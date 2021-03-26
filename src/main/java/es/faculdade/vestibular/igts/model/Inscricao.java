package es.faculdade.vestibular.igts.model;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table
public class Inscricao {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idInscricao;
	
	@Column
	private Candidato candidato;
	
	@Column
	private BigDecimal valorInscricao;
	
	@Column
	private Date dataDaInscricao;
	
	
		
}
