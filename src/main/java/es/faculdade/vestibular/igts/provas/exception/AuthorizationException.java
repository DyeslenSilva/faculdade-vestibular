package es.faculdade.vestibular.igts.provas.exception;

import lombok.Getter;

public class AuthorizationException {
		
	public AuthorizationException(String url) {
		super();
	}
	
	@Getter
	private String url;
}
