package Implementacion;

import java.util.ArrayList;
import java.util.List;

import Interface.Metodos;
import Modelo.Usuarios;

public class logicaMetodos implements Metodos{
	// Todo lo que se pone con Override es polimorfismo de sobrescritura 
	
	// Lista general
	private List<Usuarios> lista = new ArrayList<Usuarios>();
	
	
	@Override
	public void guardar(Usuarios usuario) {
		// TODO Auto-generated method stub
		lista.add(usuario);
	}

	@Override
	public List<Usuarios> mostrar() {
		// TODO Auto-generated method stub
		return lista;
	}

	@Override
	public Usuarios buscar(int indice) {
		// TODO Auto-generated method stub
		return lista.get(indice);
	}

	@Override
	public void editar(int indice, Usuarios usuario) {
		// TODO Auto-generated method stub
		lista.set(indice, usuario);
	}

	@Override
	public void eliminar(int indice) {
		// TODO Auto-generated method stub
		lista.remove(indice);
		
	}

}
