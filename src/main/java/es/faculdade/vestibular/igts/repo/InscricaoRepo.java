package es.faculdade.vestibular.igts.repo;

import org.springframework.data.r2dbc.repository.R2dbcRepository;

import es.faculdade.vestibular.igts.model.Inscricao;
import reactor.core.publisher.Mono;

public interface InscricaoRepo extends R2dbcRepository<Inscricao, Integer> {

	public Mono<Void> updateInscricao(Integer idInscricao);
}
