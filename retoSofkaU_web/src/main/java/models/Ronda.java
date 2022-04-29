package models;

public class Ronda {
	
	private Jugador jugador;
	private Pregunta pregunta;
	private Integer nivel;
	private Long premio;
	
	public Ronda() {
	}

	public Ronda(Jugador jugador, Pregunta pregunta, Integer nivel, Long premio) {
		this.jugador = jugador;
		this.pregunta = pregunta;
		this.nivel = nivel;
		this.premio = premio;
	}

	public Jugador getPlayer() {
		return jugador;
	}

	public void setPlayer(Jugador player) {
		this.jugador = player;
	}

	public Pregunta getPregunta() {
		return pregunta;
	}

	public void setPregunta(Pregunta pregunta) {
		this.pregunta = pregunta;
	}

	public Integer getNivel() {
		return nivel;
	}

	public void setNivel(Integer nivel) {
		this.nivel = nivel;
	}

	public Long getPremio() {
		return premio;
	}

	public void setPremio(Long premio) {
		this.premio = premio;
	}	
}
