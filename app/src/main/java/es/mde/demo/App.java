/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package es.mde.demo;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import mdef.es.Coche;

public class App {
	
    public static void main(String[] args) throws JsonProcessingException {
        ObjectMapper mapper = new ObjectMapper();
//        mapper.setSerializationInclusion(Include.NON_NULL);
        Coche coche = new Coche("Seat Panda", "Blanco");
        coche.setMatricula("0000-ABC");
//        coche.setId(1L);
        
        String cocheSerializado = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(coche);
        System.out.println(cocheSerializado);
        
        Coche cocheDeserializado = mapper.readValue(cocheSerializado, Coche.class);
//      cocheDeserializado.setColor("Rojo");
//    	System.out.println(coche);
        System.out.println(cocheDeserializado);
        
    }
}
