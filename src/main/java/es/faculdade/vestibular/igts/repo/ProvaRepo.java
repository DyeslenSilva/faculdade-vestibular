package es.faculdade.vestibular.igts.repo;

import org.springframework.data.r2dbc.repository.R2dbcRepository;

import es.faculdade.vestibular.igts.model.Prova;

public interface ProvaRepo extends R2dbcRepository<Prova, Integer> {

}
