package util;

import dto.Cliente;

public class util {
	
	public static Cliente createCliente(){
		Cliente c=new Cliente();
		c.setNombre("Juan");
		c.setApellido("Perez");
		return c;
	}

}
