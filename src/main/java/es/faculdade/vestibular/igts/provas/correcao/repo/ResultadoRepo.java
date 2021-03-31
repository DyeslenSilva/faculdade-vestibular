package es.faculdade.vestibular.igts.provas.correcao.repo;

import org.springframework.data.r2dbc.repository.R2dbcRepository;

import es.faculdade.vestibular.igts.provas.correcao.model.ProvaVestibular;

public interface ResultadoRepo extends R2dbcRepository<ProvaVestibular, Integer> {

}
