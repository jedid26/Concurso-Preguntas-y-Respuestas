package dao;

import java.util.List;

import models.Pregunta;

public interface PreguntaDao {
	
	public Pregunta preguntaDealer(Integer nivel);
	
	public List<String> randomizeOpciones(Pregunta pregunta);
	
	public boolean esCorrecto(Pregunta pregunta, String opcion);
	
}
