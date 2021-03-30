package es.faculdade.vestibular.igts.payments;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.paypal.api.payments.Amount;
import com.paypal.api.payments.Links;
import com.paypal.api.payments.Payer;
import com.paypal.api.payments.Payment;
import com.paypal.api.payments.RedirectUrls;
import com.paypal.api.payments.Transaction;
import com.paypal.base.rest.APIContext;
import com.paypal.base.rest.PayPalRESTException;

import es.faculdade.vestibular.igts.model.Candidato;
import es.faculdade.vestibular.igts.payments.model.Boletos;
import es.faculdade.vestibular.igts.payments.model.Pagamentos;
import es.faculdade.vestibular.igts.payments.model.URLs;

public class PagamentoInscricao {
	
	private Boletos boletos;
	private URLs urLs;
	private Candidato candidato;
	
	private String sandbox;
	private String keyStatus;
	private String keyRedirectURL;
	
	
	private Pagamentos pagamentos;
	
	public Map<String, Object> pagamento(String sum) throws PayPalRESTException{
		Map<String, Object> response = new HashMap<String, Object>();
		Amount amount = new Amount();
		amount.setCurrency(boletos.getMoeda());
		amount.setTotal(sum);
		
		Transaction transaction = new Transaction();
		transaction.setAmount(amount);
		List<Transaction> transactions = new ArrayList<Transaction>();
		transactions.add(transaction);
		
		Payer payer = new Payer();
		payer.setPaymentMethod(boletos.getTipoDePagamento());
		 
		Payment payment = new Payment();
		payment.setIntent(boletos.getObjeto());
		payment.setPayer(payer);
		payment.setTransactions(transactions);
		
		
		RedirectUrls redirectUrls = new RedirectUrls();
		redirectUrls.setCancelUrl(urLs.getCancelaUrl());
		redirectUrls.setReturnUrl(urLs.getUrl());
		
		payment.setRedirectUrls(redirectUrls);
		
		Payment createPayment;
		
		String redirectUrl ="";
		
		APIContext conntext = new APIContext(candidato.getCpf(), candidato.getCandidatoSecret(),sandbox);
		
		createPayment = payment.create(conntext);
		
		if(createPayment != null) {
			List<Links> links = createPayment.getLinks();
			for(Links link : links) {
				if(link.getRel().equals(boletos.getBoletoAprovado())) {
					redirectUrl = link.getHref();
					break;
				}
			}
			
			response.put(keyStatus, pagamentos.getStatus());
			response.put(keyRedirectURL, urLs.getRedirectUrl());
						
		}
		return response;
		
		
		
		
	}
}
