package es.faculdade.vestibular.igts.provas.settings;

import java.io.Serializable;

import lombok.Data;

@SuppressWarnings("serial")
@Data
public class CandidatoProvaSet implements Serializable{

	private Token consumerToken;
	private Token userAccessToken;
	private String oAuthCallbackUrl;
	private String meetKey;
}
