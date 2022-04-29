package models;

public class Jugador {
	
	private String username;
	private Long maxScore;
	
	public Jugador(String username, Long maxScore) {
		this.username = username;
		this.maxScore = maxScore;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public Long getMaxScore() {
		return maxScore;
	}

	public void setMaxScore(Long maxScore) {
		this.maxScore = maxScore;
	}
	
	
}
