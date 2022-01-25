package mdef.es;

public abstract class VehiculoConRuedas extends Vehiculo implements Arrancable {

	public abstract int getNumeroDeRuedas();

	public VehiculoConRuedas(String modelo, String color) {
		super(modelo, color);
	}

	@Override
	public void arrancar() {
		System.out.println("Vehiculo arrancado");
	}

	@Override
	public String toString() {
		return super.toString() + ", " + getNumeroDeRuedas() + " ruedas";
	}

}
