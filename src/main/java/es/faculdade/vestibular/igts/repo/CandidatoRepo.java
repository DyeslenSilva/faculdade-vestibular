package es.faculdade.vestibular.igts.repo;

import org.springframework.data.r2dbc.repository.R2dbcRepository;

import es.faculdade.vestibular.igts.model.Candidato;

public interface CandidatoRepo extends R2dbcRepository<Candidato, Integer> {

}
