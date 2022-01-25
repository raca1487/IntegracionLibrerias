package mdef.es;

public class Vehiculo implements Comparable<Vehiculo> {

	private String modelo;
	private String color;

	public String getModelo() {
		return modelo;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public Vehiculo(String modelo, String color) {
		this.modelo = modelo;
		setColor(color);
	}

	@Override
	public String toString() {
		return getModelo() + " (" + getColor() + ")";
	}

	@Override
	public int compareTo(Vehiculo otro) {
		return getModelo().compareTo(otro.getModelo());
	}

}
