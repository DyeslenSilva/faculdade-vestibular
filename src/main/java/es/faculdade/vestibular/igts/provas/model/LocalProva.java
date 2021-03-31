package es.faculdade.vestibular.igts.provas.model;

import es.faculdade.vestibular.igts.provas.utils.ToStringBuilder;
import lombok.Data;

@Data
public class LocalProva {

	
	private String cidade;
	private String estado;
	private String endereco;
	private String cep;
	
	public String toString() {
		try {
			return ToStringBuilder.build(this);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
	

}
