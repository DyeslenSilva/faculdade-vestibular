package es.faculdade.vestibular.igts.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import es.faculdade.vestibular.igts.model.Candidato;
import es.faculdade.vestibular.igts.repo.CandidatoRepo;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/candidatoAPI")
public class CandidatoController {

	@Autowired
	private CandidatoRepo candidatoRepo;
	
	@GetMapping("/cadastroCandidato")
	public Mono<Candidato> cadastroDeCandidato(@PathVariable Candidato candidato){
		return candidatoRepo.save(candidato);
	}
}
