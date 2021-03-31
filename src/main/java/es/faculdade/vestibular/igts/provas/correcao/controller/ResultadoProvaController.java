package es.faculdade.vestibular.igts.provas.correcao.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import es.faculdade.vestibular.igts.provas.correcao.model.ProvaVestibular;
import es.faculdade.vestibular.igts.provas.correcao.repo.ResultadoRepo;
import reactor.core.publisher.Flux;

@RestController
@RequestMapping("/resultadoApi")
public class ResultadoProvaController {

	@Autowired
	private ProvaVestibular resultado;
	
	private ResultadoRepo resultadoRepo;
	
	@GetMapping("/resultados")
	public Flux<ProvaVestibular> getResultados(ProvaVestibular correcao){
		resultado.getCandidatosAprovados();
		return resultadoRepo.findAll();
	}
	
}
