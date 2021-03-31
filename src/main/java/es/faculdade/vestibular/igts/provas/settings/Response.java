package es.faculdade.vestibular.igts.provas.settings;

import java.util.List;

import es.faculdade.vestibular.igts.provas.model.Grupo;
import es.faculdade.vestibular.igts.provas.model.ProvaEvento;
import es.faculdade.vestibular.igts.provas.model.ProvaPorCurso;
import es.faculdade.vestibular.igts.provas.utils.ToStringBuilder;
import lombok.Data;

@Data
public class Response {

	private Header Header;

	private transient String rsp;
	
	private List<Grupo> grupos;
	private List<ProvaEvento> provaEventos;
	private List<ProvaPorCurso> provaPorCursos;
	
	public String toString(String build) {
		try {
			return ToStringBuilder.build(this);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return build;
	}
}