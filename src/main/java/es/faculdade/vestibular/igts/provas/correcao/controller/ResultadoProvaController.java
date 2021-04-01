package es.faculdade.vestibular.igts.provas.correcao.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import es.faculdade.vestibular.igts.provas.correcao.model.ProvaVestibular;
import es.faculdade.vestibular.igts.provas.correcao.repo.ResultadoRepo;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/resultadoApi")
public class ResultadoProvaController {

	@Autowired
	private ProvaVestibular resultado;
	
	private ResultadoRepo resultadoRepo;
	
	@GetMapping("/resultados")
	public Flux<ProvaVestibular> getResultadosAprovado(){
		resultado.listaDeCandiatosAprovados();
		return resultadoRepo.findAll();
	}
	
	@GetMapping("/resultado/{cpf}")
	public Mono<ProvaVestibular> getCandidatoAprovado(@PathVariable String cpf){
		resultado.candidatoAprovado(cpf);
		return resultadoRepo.findById(Integer.parseInt(cpf));
	}
	
	@GetMapping("/candidatos")
	public Flux<ProvaVestibular> getCandidatos(){
		resultado.getTodosOsCandidatos();
		return resultadoRepo.findAll();
	}
}
