package es.faculdade.vestibular.igts.provas.correcao.model;

import java.util.List;

import es.faculdade.vestibular.igts.model.Candidato;
import lombok.Data;

@Data
public class ProvaVestibular {

	private Integer idProva;
	private Integer quantidadeDeAcertos;
	private Integer quantidadeDeQuestoes;
	private Float notaDaProva;
	private String resultado;
	private Float parcial;
	private List<Candidato> candidatosAprovados;
	private List<Candidato> candidatosReprovados;
	private List<Candidato> todosOsCandidatos;
	
	public Float getCorrecaoDaProva(){
		parcial = (float) (quantidadeDeAcertos/quantidadeDeQuestoes);
		notaDaProva = parcial*100;
		return notaDaProva;
	}
	
	
	public boolean situação(Candidato candidato) {
		parcial = (float) (quantidadeDeAcertos/quantidadeDeQuestoes);
		notaDaProva = parcial*100;
		if(notaDaProva >=65) {
			candidatosAprovados.add(candidato);
			return true;
		}else {
			candidatosReprovados.add(candidato);
			return false;
		}
	}
	
	
	public List<Candidato> listaDeCandidatos(){
		for(Candidato cand: todosOsCandidatos) {
			return todosOsCandidatos;
		}
		return null;
	}
	
	public List<Candidato> listaDeCandiatosAprovados(){
		for(Candidato c : candidatosAprovados) {
			return candidatosAprovados;
		}
		return null;
	}
	
	
	public List<Candidato> listaDeCandidatosReprovados(){
		for(Candidato c: candidatosReprovados) {
			return candidatosReprovados;
		}
		return null;
	}

	public Candidato candidatoAprovado(String cpf) {
		for (Candidato ca : todosOsCandidatos) {
			if(ca.getCpf() == cpf) {
				return todosOsCandidatos.get(Integer.parseInt(cpf));
			}else {
				return null;
			}
		}
		return null;
	}
}