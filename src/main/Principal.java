package main;

import Implementacion.logicaMetodos;
import Modelo.Usuarios;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Crear coleccion de objetos
		Usuarios usuario1 = new Usuarios(1, "admin", "admin2", true);
		Usuarios usuario2 = new Usuarios(2, "Isabel", "isaBien", true);
		Usuarios usuario3 = new Usuarios(3, "saul", "pedro", true);
		Usuarios usuario4 = new Usuarios(4, "jovani", "administrador", true);
		
		// Realizar la instancia de metodos 

		logicaMetodos imp = new logicaMetodos();
		
		// Metodo de guardar
		imp.guardar(usuario1);
		imp.guardar(usuario2);
		imp.guardar(usuario3);
		imp.guardar(usuario4);
		// mostrar 
		System.out.println(imp.mostrar());
		
		//reserva de espacio en memoria
		Usuarios usuarioEn = null;
		
		// buscar 
		usuarioEn = imp.buscar(2);
		
		// Editar-- Primero hay que buscar 
		usuarioEn.setPassword("12345");
		usuarioEn.setStatus(false);
		
		imp.editar(2, usuarioEn);
		
		// Mostrar
		System.out.println(imp.mostrar());
		
		// Eliminar
		imp.eliminar(0);
		
		System.out.println(imp.mostrar());
		
		
	}

	
}
