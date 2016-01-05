package main;

import util.util;
import dto.Cliente;

public class Main {
	
	public static void main(String[] args) {
		Cliente c=util.createCliente();
		System.out.println(c.getNombre());
	}

}
