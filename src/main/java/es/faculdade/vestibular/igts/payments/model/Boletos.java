package es.faculdade.vestibular.igts.payments.model;

import lombok.Data;

@Data
public class Boletos {

	private String moeda;
	private String tipoDePagamento;
	private String objeto;
	private String boletoAprovado;
}
