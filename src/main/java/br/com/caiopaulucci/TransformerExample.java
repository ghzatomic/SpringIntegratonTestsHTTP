package br.com.caiopaulucci;

import org.springframework.messaging.Message;
import org.springframework.messaging.support.GenericMessage;

public class TransformerExample {

	Message<String> transform(Message<String> in) {
	    return new GenericMessage<String>(in+" CAIO ");
	}
	
}
