package service;

import models.Jugador;

public interface JugadorService {
	
	public Jugador getUserByUsername(String username);
	
	public void guardarJugador(Jugador usuario);
	
	public void actualizarPuntuacion(Jugador jugador);
	
}
