package dao;

import models.Jugador;

public interface JugadorDao {
	
	public Jugador getUserByUsername(String username);
	
	public void guardarJugador(Jugador usuario);
	
	public void actualizarPuntuacion(Jugador jugador);
	
}
