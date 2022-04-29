package models;

import java.util.ArrayList;

public class Categorias {
	
	public String nombre;
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public static Categorias categoriaDealer() {
		
		Categorias randomCategoria = new Categorias();
		
		ArrayList<String> categoriasDisponibles = new ArrayList<String>();
		categoriasDisponibles.add("matematicas");
		categoriasDisponibles.add("historia");
		categoriasDisponibles.add("biologia");
		categoriasDisponibles.add("linguistica");
		categoriasDisponibles.add("geografia");
		
		randomCategoria.setNombre(categoriasDisponibles.get((int)(Math.random()*categoriasDisponibles.size()))); 

		return randomCategoria;
	}
}
