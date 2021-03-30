package es.faculdade.vestibular.igts.model;

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
public class Candidato {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idCandidato;
	
	private String candidatoSecret;
	
	@Column
	private String nomeDoCandidato;
	
	@Column
	private String rg;
	
	@Column
	private String cpf;
	
	@Column
	private String endereco;
	
	@Column
	private String telefoneCelular;
	
	@Column
	private String cursoEscolhido;
}
