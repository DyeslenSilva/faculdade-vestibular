package es.faculdade.vestibular.igts.provas.settings;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Token {

	private String publicToken;
	private String secret;
	
	public boolean isValid() {

		if (this.getPublicToken() == null)
		{
			return false;
		}
		else if (this.getPublicToken().trim().length() == 0)
		{
			return false;
		}
		else if (this.getSecret() == null)
		{
			return false;
		}
		else if (this.getSecret().trim().length() == 0)
		{
			return false;
		}
		else
		{
			return true;
		}
	}
	
	
}
