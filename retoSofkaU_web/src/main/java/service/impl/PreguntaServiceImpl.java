package service.impl;

import java.util.List;

import dao.PreguntaDao;
import dao.impl.PreguntaDaoImpl;
import models.Pregunta;
import service.PreguntaService;

public class PreguntaServiceImpl implements PreguntaService {

	PreguntaDao dao = new PreguntaDaoImpl();
	
	@Override
	public Pregunta preguntaDealer(Integer nivel) {
		return dao.preguntaDealer(nivel);
	}

	@Override
	public List<String> randomizeOpciones(Pregunta pregunta) {
		return dao.randomizeOpciones(pregunta);
	}

	@Override
	public boolean esCorrecto(Pregunta pregunta, String opcion) {
		return dao.esCorrecto(pregunta, opcion);
	}


}
