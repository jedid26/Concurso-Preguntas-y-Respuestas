package dao;

import models.Jugador;
import models.Ronda;

public interface RondaDao {
	
	public void cargarRonda(Jugador jugador, int nivel);
	
	public void aumentarNivel(Ronda rondaPrevia);
	
	public void finalizarRonda(Jugador jugador);
	
}
