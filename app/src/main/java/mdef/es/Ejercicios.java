package mdef.es;

import java.util.concurrent.ThreadLocalRandom;

public class Ejercicios {

	public static void main(String[] args) {
		String[] ejercicio = { "Carrito", "Cartas", "Foro" };
		int indiceAleatorio = numeroAleatorio(0, ejercicio.length);
		String ejercicioAleatorio = ejercicio[indiceAleatorio];
		System.out.println(ejercicioAleatorio);
		
	}
	
	public static int numeroAleatorio(int minimo, int maximo) {
		return ThreadLocalRandom.current().nextInt(minimo, maximo + 1);
		
	}

}
