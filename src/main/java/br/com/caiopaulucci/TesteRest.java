package br.com.caiopaulucci;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TesteRest {

	
	@Autowired
	OutGatewayInterface testeI;
	
	@RequestMapping("/testeOut")
	public CaioDTO teste() {
		
		String uudi = UUID.randomUUID().toString();
		
		CaioDTO dto = new CaioDTO();
		
		dto.setNome(uudi);
		
		CaioDTO ret = testeI.teste(dto);
		ret.setNome("Gerou : "+uudi+" Recebeu : "+ret.getNome());
		return ret;
	}
	
}
