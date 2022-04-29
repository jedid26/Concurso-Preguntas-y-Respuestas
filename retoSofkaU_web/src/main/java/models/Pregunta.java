package models;

import java.util.Map;

public class Pregunta extends PreguntaGeneric {
	
	private Categorias categoria;
	private Integer nivel;
	
	//Constructor todo String
	public Pregunta(String enunciado, String wrong1, String wrong2, String wrong3, String correct, Categorias categoria,
			Integer nivel) {
		super(enunciado, wrong1, wrong2, wrong3, correct);
		this.categoria = categoria;
		this.nivel = nivel;
	}
	
	//Constructor con map
	public Pregunta(String enunciado, Map<String, String> opciones, Categorias categoria, int nivel) {
		super(enunciado, opciones);
		this.categoria = categoria;
		this.nivel = nivel;
	}

	public Pregunta() {
	}

	//Getters & Setters
	public Categorias getCategoria() {
		return categoria;
	}

	public void setCategoria(Categorias categoria) {
		this.categoria = categoria;
	}

	public Integer getNivel() {
		return nivel;
	}

	public void setNivel(Integer nivel) {
		this.nivel = nivel;
	}
	
}
