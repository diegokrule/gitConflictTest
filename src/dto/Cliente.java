package dto;

import java.util.List;

public class Cliente {
	
	private String nombre_a;
	private String apellido;
	
	private List<Factura>facturas;



	public String getNombre_a() {
		return nombre_a;
	}

	public void setNombre_a(String nombre_a) {
		this.nombre_a = nombre_a;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public List<Factura> getFacturas() {
		return facturas;
	}

	public void setFacturas(List<Factura> facturas) {
		this.facturas = facturas;
	}
	
	
	

}
