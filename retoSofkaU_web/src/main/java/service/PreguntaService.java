package service;

import java.util.List;

import models.Pregunta;

public interface PreguntaService {
	
	public Pregunta preguntaDealer(Integer nivel);
	
	public List<String> randomizeOpciones(Pregunta pregunta);
	
	public boolean esCorrecto(Pregunta pregunta, String opcion);
	
}
