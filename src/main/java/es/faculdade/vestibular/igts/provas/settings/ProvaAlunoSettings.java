package es.faculdade.vestibular.igts.provas.settings;

import org.apache.http.impl.client.DefaultHttpClient;

import com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Default;

import lombok.AllArgsConstructor;
import lombok.Data;
import net.oauth.OAuthServiceProvider;
import net.oauth.client.OAuthClient;

@Data
@AllArgsConstructor
public class ProvaAlunoSettings {
	
	static private final String MEETUP_ENDPOINT_URL = "http://api.meetup.com";
	static private final String OAUTH_REQUEST_TOKEN_URL = "http://www.meetup.com/oauth/request/";
	static private final String OAUTH_AUTHORIZE_URL = "http://www.meetup.com/authorize/";
	static private final String OAUTH_ACCESS_TOKEN_URL = "http://www.meetup.com/oauth/access/";
	
	static private final String FORMAT = "xml";

	@SuppressWarnings("deprecation")
	private DefaultHttpClient httpClient;
	private OAuthClient authClient;
	private OAuthServiceProvider serviceProvider;
	private Token token= new Token();
	private CandidatoProvaSet provaSet;
	private boolean compressionedEnabled = false;
	private boolean useOAuth = false;
	
	static {
		System.getProperties().put("org.apache.commons.logging.Log", "org.apache.commons.logging.impl.SimpleLog");
		System.getProperties().put("org.apache.commons.logging.simplelog.defaultlog", "trace");
	}
				
}
