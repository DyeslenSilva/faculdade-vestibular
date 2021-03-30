package es.faculdade.vestibular.igts.payments.controller;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.paypal.base.rest.PayPalRESTException;

import es.faculdade.vestibular.igts.payments.PagamentoInscricao;
import lombok.AllArgsConstructor;
//import lombok.NoArgsConstructor;

@RestController
@RequestMapping("/apiPag")
@AllArgsConstructor
public class PagamentosController {

	private final PagamentoInscricao pagamentoInscricao;
	
	@PostMapping(value="/payment")
	public Map<String, Object> makePayment(@RequestParam("sum")
			String sum) throws PayPalRESTException{
		return pagamentoInscricao.pagamento(sum);
		
	}
	
	@PostMapping(value = "/complete/payment")
	public Map<String, Object> completePayment(HttpServletRequest req) throws PayPalRESTException{
		return pagamentoInscricao.confirmarPagamento(req);
	}
	
	
	
}
