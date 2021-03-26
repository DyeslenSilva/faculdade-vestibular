package es.faculdade.vestibular.igts.repo;

import org.springframework.data.r2dbc.repository.R2dbcRepository;

import es.faculdade.vestibular.igts.model.Prova;
import reactor.core.publisher.Mono;

public interface ProvaRepo extends R2dbcRepository<Prova, Integer> {

	public Mono<Void> updateProva(Integer idProva);
}
