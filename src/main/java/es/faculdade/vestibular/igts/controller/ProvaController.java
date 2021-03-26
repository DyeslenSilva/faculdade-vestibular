package es.faculdade.vestibular.igts.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import es.faculdade.vestibular.igts.model.Prova;
import es.faculdade.vestibular.igts.repo.ProvaRepo;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/provaAPI")
public class ProvaController {

	@Autowired
	private ProvaRepo provaRepo;

	@PostMapping("/cadastroProva")
	public Mono<Prova> cadastraProva(@PathVariable Prova prova){
		return provaRepo.save(prova);
	}

	@GetMapping("/provas")
	public Flux<Prova> getProvas(){
		return provaRepo.findAll();
	}
	
	@GetMapping("/prova/{idProva}")
	public Mono<Prova> getProva(@PathVariable Integer idProva){
		return provaRepo.findById(idProva);
	}
	
	@PutMapping("/atualizaProva/{idProva}")
	public Mono<Void> updateProva(@PathVariable Integer idProva){
		return provaRepo.updateProva(idProva);
	}
	
	@DeleteMapping("/apagarProva/{idProva}")
	public Mono<Void> deleteProva(@PathVariable Integer idProva){
		return provaRepo.deleteById(idProva);
	}
	
	
}
