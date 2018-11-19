package br.com.caiopaulucci;
import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector;

@SuppressWarnings("serial")
public class JaxbJacksonObjectMapper extends ObjectMapper {

	public JaxbJacksonObjectMapper() {
		  final AnnotationIntrospector introspector
		      = new JacksonAnnotationIntrospector();
		  super.getDeserializationConfig()
		       .with(introspector);
		  super.getSerializationConfig()
		       .with(introspector);

	}
}