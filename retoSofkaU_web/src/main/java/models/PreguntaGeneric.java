package models;

import java.util.Map;

public class PreguntaGeneric {
	
	private String enunciado;
	private String wrong1;
	private String wrong2;
	private String wrong3;
	private String correct;
	
	//Constructor con todo string
	public PreguntaGeneric(String enunciado, String wrong1, String wrong2, String wrong3, String correct) {
		this.enunciado = enunciado;
		this.wrong1 = wrong1;
		this.wrong2 = wrong2;
		this.wrong3 = wrong3;
		this.correct = correct;
	}
	
	//Constructor con Map de opciones
	public PreguntaGeneric(String enunciado, Map<String, String> opciones) {
		this.enunciado = enunciado;
		this.wrong1 = opciones.get("wrong1");
		this.wrong2 = opciones.get("wrong2");
		this.wrong3 = opciones.get("wrong3");
		this.correct = opciones.get("correct");
	}

	public PreguntaGeneric() {
	}

	//Getters & Setters
	public String getEnunciado() {
		return enunciado;
	}

	public void setEnunciado(String enunciado) {
		this.enunciado = enunciado;
	}

	public String getWrong1() {
		return wrong1;
	}

	public void setWrong1(String wrong1) {
		this.wrong1 = wrong1;
	}

	public String getWrong2() {
		return wrong2;
	}

	public void setWrong2(String wrong2) {
		this.wrong2 = wrong2;
	}

	public String getWrong3() {
		return wrong3;
	}

	public void setWrong3(String wrong3) {
		this.wrong3 = wrong3;
	}

	public String getCorrect() {
		return correct;
	}

	public void setCorrect(String correct) {
		this.correct = correct;
	}

}
