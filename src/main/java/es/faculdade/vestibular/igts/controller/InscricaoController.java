package es.faculdade.vestibular.igts.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import es.faculdade.vestibular.igts.model.Inscricao;
import es.faculdade.vestibular.igts.repo.InscricaoRepo;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/inscricaoAPI")
public class InscricaoController {

	@Autowired
	private InscricaoRepo inscricaoRepo;
	
	@PostMapping("/realizaInscircao")
	public Mono<Inscricao> realizaInscricao(@PathVariable Inscricao incricao){
		return inscricaoRepo.save(incricao);
	}
	
	@GetMapping("/inscricao")
	public Flux<Inscricao> getInscricoes(){
		return inscricaoRepo.findAll();
	}
	
	@GetMapping("/inscricao/{idInscricao}")
	public Mono<Inscricao> getInscricao(@PathVariable Integer idInscricao){
		return inscricaoRepo.findById(idInscricao);
	}
	
	@PutMapping("/updateInscricao/{idInscricao}")
	public Mono<Void> updateInscricao(@PathVariable Integer idInscricao){
		return inscricaoRepo.updateInscricao(idInscricao);
	}
	
	@DeleteMapping("/deleteInscricao/{idInscricao}")
	public Mono<Void> deleteInscricao(@PathVariable Inscricao idInscricao){
		return inscricaoRepo.delete(idInscricao);
	}
	
	
}
