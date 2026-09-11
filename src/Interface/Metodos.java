package Interface;

import java.util.List;

import Modelo.Usuarios;

// Una interfaz es una plantilla para declarar metodos vacios (abstractos)
// Su programacion se realiza en las clases

public interface Metodos {

	// Se definen procedimientos (sin valor de retorno) y funciones (valor de retorno)
	//Sintaxis procedimientos --> modificadorAcceso void nombreProcedimiento (parametros o argumentos)
	// Sintaxis funciones --> modificador de acceso tipoRetorno nombreFuncion (parametros o argumentos)
	
	public void guardar(Usuarios usuario);
	
	public List<Usuarios> mostrar();
	
	public Usuarios buscar (int indice);
	
	public void editar (int indice, Usuarios usuario);
	
	public void eliminar (int indice);
	
}
