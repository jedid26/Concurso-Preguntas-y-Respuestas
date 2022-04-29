package dao.impl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import dao.PreguntaDao;
import models.PoolPreguntas;
import models.Pregunta;

public class PreguntaDaoImpl implements PreguntaDao {

	@Override
	public Pregunta preguntaDealer(Integer nivel) {
		
		Pregunta preguntaElegida = new Pregunta();
		
		List<Pregunta> poolTotal = PoolPreguntas.cargarPoolPreguntas();
		
		List<Pregunta> listaUtilitaria = poolTotal.stream()
							.filter(pregunta -> pregunta.getNivel() == nivel)
							.collect(Collectors.toList());
		
		preguntaElegida = listaUtilitaria.get((int) (Math.random()*listaUtilitaria.size()));
		
		return preguntaElegida;
	}

	@Override
	public List<String> randomizeOpciones(Pregunta pregunta) {
		
		List<String> opciones = new ArrayList<String>();
		
		opciones.add(pregunta.getWrong1());
		opciones.add(pregunta.getWrong2());
		opciones.add(pregunta.getWrong3());
		opciones.add(pregunta.getCorrect());
		
		Collections.shuffle(opciones);
		
		return opciones;
	}

	@Override
	public boolean esCorrecto(Pregunta pregunta, String opcion) {
		
		if (pregunta.getCorrect().equalsIgnoreCase(opcion)) {
			return true;
		}
		
		return false;
	}

}
