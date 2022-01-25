package mdef.es;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonPropertyOrder({ "id", "placa" })
//@JsonIgnoreProperties({ "numeroDeRuedas" })
//@JsonInclude(Include.NON_NULL)
public class Coche extends VehiculoConRuedas implements Arrancable {

	@JsonAlias({ "ruedas" })
	private int numeroDeRuedas;
	private String placa;
	private Long id;
	
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}

	@Override
	public int getNumeroDeRuedas() {
		return numeroDeRuedas;
	}
	
	public String getMatricula() {
		return placa;
	}

	@JsonProperty("placa")
	public void setMatricula(String matricula) {
		this.placa = matricula;
	}

	public Coche() {
		this(null, null);
	}

	public Coche(String modelo, String color) {
//        this(color);
		super(modelo, color);
//        this.modelo = modelo;
		numeroDeRuedas = 4;
	}

	@Override
	public void arrancar() {
		System.out.println("Coche arrancado");
	}

	@Override
	public String toString() {
		return "Placa " + getMatricula() + " - " + super.toString();
	}

	@Override
	public int hashCode() {
		return Objects.hash(getMatricula(), getModelo());
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Coche other = (Coche) obj;
		return Objects.equals(getMatricula(), other.getMatricula()) && Objects.equals(getModelo(), other.getModelo());
	}

}
