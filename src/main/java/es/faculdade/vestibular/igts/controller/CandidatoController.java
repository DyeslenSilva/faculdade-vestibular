package es.faculdade.vestibular.igts.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
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
	
	@PostMapping("/cadastroCandidato")
	public Mono<Candidato> cadastroDeCandidato(@PathVariable Candidato candidato){
		return candidatoRepo.save(candidato);
	}
	
	@GetMapping("/candidatos")
	public Flux<Candidato> getCandidatos(){
		return candidatoRepo.findAll();
	}
	
	@GetMapping("/candidato/{idCandidato}")
	public Mono<Candidato> getCandidato(@PathVariable Integer idCandidato){
		return candidatoRepo.findById(idCandidato);
	}
	
	@PutMapping("/candidato")
	public Mono<Void> updateCandidato(@PathVariable Candidato candidato){
		return candidatoRepo.updateCandidato(candidato);
	}
	
	@DeleteMapping("/candidato/{idCandidato}")
	public Mono<Void> deleteCandidato(@PathVariable Integer idCandidato){
		return candidatoRepo.deleteById(idCandidato);
	}
}
