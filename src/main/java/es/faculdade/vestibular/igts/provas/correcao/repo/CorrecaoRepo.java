package es.faculdade.vestibular.igts.provas.correcao.repo;

import org.springframework.data.r2dbc.repository.R2dbcRepository;

import es.faculdade.vestibular.igts.provas.correcao.controller.CorrigirProvaController;
import es.faculdade.vestibular.igts.provas.correcao.model.ProvaVestibular;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface CorrecaoRepo extends R2dbcRepository<CorrigirProvaController, Integer> {

	Mono<ProvaVestibular> save(ProvaVestibular correcao);

	//Mono<ProvaVestibular> save(ProvaVestibular correcao);

}
