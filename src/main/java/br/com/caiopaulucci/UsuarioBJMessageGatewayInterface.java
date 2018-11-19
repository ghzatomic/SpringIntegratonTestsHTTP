package br.com.caiopaulucci;

import java.util.concurrent.Future;

import org.springframework.integration.annotation.Gateway;
import org.springframework.integration.annotation.MessagingGateway;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.messaging.handler.annotation.Payload;    

@MessagingGateway
public interface UsuarioBJMessageGatewayInterface {
	
	@Gateway(requestChannel = "employeeSearchRequest" , replyChannel="employeeSearchResponse")
	CaioDTO pegaUsuario(@Payload CaioDTO in);
	
}
