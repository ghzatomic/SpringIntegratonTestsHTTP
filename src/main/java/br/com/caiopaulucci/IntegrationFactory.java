package br.com.caiopaulucci;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.integration.annotation.ServiceActivator;
import org.springframework.integration.annotation.Transformer;
import org.springframework.messaging.MessageHandler;

@Configuration
public class IntegrationFactory {

	@Bean(name="handlerMessageTest")
	public HandlerMessage getHandlerMessageTest(){
		return new HandlerMessage();
	}
	
	
	@Bean(name="transformerExample")
	public TransformerExample getTransformerExample() {
		return new TransformerExample();
	}
	
	@Transformer(inputChannel="input1", outputChannel="input2")
    public String processMessage(String in) {
        return in+" CAIO ";
    }
	
}
