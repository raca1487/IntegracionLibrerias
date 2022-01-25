package mdef.es;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class EjemploComparable {

	public static void main(String[] args) {
		List<Vehiculo> vehiculos = Arrays.asList(new Coche("Volvo", "Gris"), new Vehiculo("Triciclo", "Rosa"),
				new Moto("Volvo", "Azul"));

		vehiculos.forEach(System.out::println);
		vehiculos.sort(null);

		System.out.println("\nLista ordenada (por modelo):");
		vehiculos.forEach(System.out::println);

		System.out.println("\nLista ordenada (por modelo y color):");
		Comparator<Vehiculo> comparadorColor =

				new Comparator<Vehiculo>() {

					@Override
					public int compare(Vehiculo v1, Vehiculo v2) {
						return v1.getColor().compareTo(v2.getColor());
					}
				};
//
//				(v1, v2) -> {
//					int comparacion = v1.getModelo().compareTo(v2.getModelo());
//					if (comparacion == 0) {
//						comparacion = v1.getColor().compareTo(v2.getColor());
//					}
//					return comparacion;
//				};

		vehiculos.sort(comparadorColor);
		vehiculos.forEach(System.out::println);
	}

}
