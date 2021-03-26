package es.faculdade.vestibular.igts.repo;

import org.springframework.data.r2dbc.repository.R2dbcRepository;

import es.faculdade.vestibular.igts.model.Inscricao;

public interface InscricaoRepo extends R2dbcRepository<Inscricao, Inscricao> {

}
