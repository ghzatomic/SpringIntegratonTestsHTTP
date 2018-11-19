package br.com.caiopaulucci;

import org.springframework.stereotype.Service;

@Service("testeSA")
public class TesteServiceActivator {

	public CaioDTO teste(CaioDTO in){
		
		
		CaioDTO out = new CaioDTO();
		out.setNome("Oi COROI !! "+in.getNome());
		
		return out;
	}
	
	
}
