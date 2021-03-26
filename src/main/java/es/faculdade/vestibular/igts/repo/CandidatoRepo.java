package es.faculdade.vestibular.igts.repo;

import org.springframework.data.r2dbc.repository.R2dbcRepository;

import es.faculdade.vestibular.igts.model.Candidato;
import reactor.core.publisher.Mono;

public interface CandidatoRepo extends R2dbcRepository<Candidato, Integer> {
		
	public Mono<Void> updateCandidato(Candidato candidato);
}
