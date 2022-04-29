package service.impl;

import dao.RondaDao;
import dao.impl.RondaDaoImpl;
import models.Jugador;
import models.Ronda;
import service.RondaService;

public class RondaServiceImpl implements RondaService {
	
	RondaDao dao = new RondaDaoImpl();
	
	@Override
	public void cargarRonda(Jugador jugador, int nivel) {
		dao.cargarRonda(jugador, nivel);

	}

	@Override
	public void aumentarNivel(Ronda rondaPrevia) {
		dao.aumentarNivel(rondaPrevia);

	}

	@Override
	public void finalizarRonda(Jugador jugador) {
		dao.finalizarRonda(jugador);
	}

}
