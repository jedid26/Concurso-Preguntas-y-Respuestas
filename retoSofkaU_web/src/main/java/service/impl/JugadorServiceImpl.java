package service.impl;

import dao.JugadorDao;
import dao.impl.JugadorDaoImpl;
import models.Jugador;
import service.JugadorService;

public class JugadorServiceImpl implements JugadorService {
	
	JugadorDao dao = new JugadorDaoImpl();
	
	@Override
	public Jugador getUserByUsername(String username) {
		return dao.getUserByUsername(username);
	}

	@Override
	public void guardarJugador(Jugador usuario) {
		dao.guardarJugador(usuario);
	}

	@Override
	public void actualizarPuntuacion(Jugador jugador) {
		dao.actualizarPuntuacion(jugador);
	}

}
