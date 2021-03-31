package es.faculdade.vestibular.igts.provas.correcao.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import es.faculdade.vestibular.igts.provas.correcao.model.ProvaVestibular;
import es.faculdade.vestibular.igts.provas.correcao.repo.CorrecaoRepo;
import lombok.Getter;
import lombok.Setter;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("correcaoAPI")
public class CorrigirProvaController {

	@Autowired
	private ProvaVestibular correção;
	
	@Autowired
	private CorrecaoRepo correcaoRepo;
	
	@GetMapping("/correcao")
	public Mono<ProvaVestibular> correcao(@PathVariable ProvaVestibular correcao){
		correção.getCorrecaoDaProva();
		return (Mono<ProvaVestibular>) correcaoRepo.save(correcao);
	}
	
}
