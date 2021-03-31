package es.faculdade.vestibular.igts.provas;

import es.faculdade.vestibular.igts.provas.utils.ToStringBuilder;

public class LocalProva {

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
