package dto;

import java.util.Date;

public class Factura {
	
	private Integer id;
	
	private Date fecha;
	
	private Long monto;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public Long getMonto() {
		return monto;
	}

	public void setMonto(Long monto) {
		this.monto = monto;
	}
	
	
	
	

}
