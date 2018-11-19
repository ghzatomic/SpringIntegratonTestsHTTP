package br.com.caiopaulucci;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.support.GenericMessage;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TesteService {
	
	@Autowired
	@Qualifier("input1")
	private MessageChannel channel;
	
    @RequestMapping(method = RequestMethod.GET, value = "/start", produces = MediaType.TEXT_PLAIN_VALUE)
    public ResponseEntity<String> start() {
    	channel.send(new GenericMessage<String>("Spring Integration eeeee"));
        return ResponseEntity.ok("YEAH BABY !!");
    }

}
