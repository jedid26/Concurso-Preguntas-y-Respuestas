package service;

import models.Jugador;
import models.Ronda;

public interface RondaService {
	
	public void cargarRonda(Jugador jugador, int nivel);
	
	public void aumentarNivel(Ronda rondaPrevia);
	
	public void finalizarRonda(Jugador jugador);
	
}
