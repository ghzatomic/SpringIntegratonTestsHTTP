package br.com.caiopaulucci;


import org.springframework.integration.annotation.Gateway;
import org.springframework.integration.annotation.MessagingGateway;
import org.springframework.messaging.handler.annotation.Payload;    

@MessagingGateway
public interface OutGatewayInterface {
	
	@Gateway(requestChannel = "requests" )
	CaioDTO teste(@Payload CaioDTO in);
	
}
