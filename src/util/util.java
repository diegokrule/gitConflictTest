package util;

import dto.Cliente;

public class util {
	
	public static Cliente createCliente(){
		Cliente c=new Cliente();
		c.setNombre_a("Juan");
		c.setApellido("Perez");
		return c;
	}

}
