package es.faculdade.vestibular.igts.provas.settings;

import java.util.Calendar;

import lombok.Data;

@Data
public class Header {
	
	private String title;
	private String link;
	private String url;
	private String id;
	private String latitude;
	private String longitude;
	private String description;
	private Calendar updated;
	private String method;
	private Integer count;
	private Integer totalCount;
	private String next;
}
