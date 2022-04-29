package dao.impl;

import java.util.List;
import java.util.Scanner;

import dao.RondaDao;
import models.Jugador;
import models.Pregunta;
import models.Ronda;
import service.JugadorService;
import service.PreguntaService;
import service.impl.JugadorServiceImpl;
import service.impl.PreguntaServiceImpl;

public class RondaDaoImpl implements RondaDao {
	
	Scanner sc = new Scanner(System.in);
	
	@Override
	public void cargarRonda(Jugador jugador, int nivel) {
		
		PreguntaService preguntaService = new PreguntaServiceImpl();	
		Pregunta preguntaRonda = preguntaService.preguntaDealer(nivel);
		
		Ronda rondaJuego = new Ronda(jugador, preguntaRonda, nivel, 20l);
		
		List<String> opciones = preguntaService.randomizeOpciones(preguntaRonda);
		
		System.out.println("Ronda " + String.valueOf(nivel));
		System.out.println("Ingresa la letra de la respuesta correcta");
		System.out.println(preguntaRonda.getEnunciado());
		System.out.println(	"A. " + opciones.get(0) +
							"\nB. " + opciones.get(1) +
							"\nC. " + opciones.get(2) +
							"\nD. " + opciones.get(3));	
		Boolean opcionValida = false;
		String respuesta = null;
		do {
			String input;
			input = sc.nextLine();
			if (!(input == null) && !(input.length()>1)) {
				if (input.matches("[a-dA-D]")) {
					opcionValida = true;
					switch (input.toUpperCase()) {
					case "A":
						respuesta = opciones.get(0);
						break;
					case "B":
						respuesta = opciones.get(1);
						break;
					case "C":
						respuesta = opciones.get(2);
						break;
					default:
						respuesta = opciones.get(3);
						break;
					}
				}else {
					System.out.println("Ingrese A, B, C o D");
				}
			}else {
				System.out.println("Opcion no valida");
			}
		} while (!opcionValida);
		
		if (preguntaService.esCorrecto(preguntaRonda, respuesta)) {
			System.out.println("Respuesta correcta");
			jugador.setMaxScore(jugador.getMaxScore() + rondaJuego.getPremio());
			aumentarNivel(rondaJuego);
		} else {
			System.out.println("Respuesta incorrecta");
			jugador.setMaxScore(0l);
			finalizarRonda(jugador);
		}
	}

	@Override
	public void aumentarNivel(Ronda rondaPrevia) {
		
		if (rondaPrevia.getNivel() == 5) {
			finalizarRonda(rondaPrevia.getPlayer());
		} else {
			Boolean continuar = null;
			Jugador jugador = rondaPrevia.getPlayer();
			int nivelAnterior = rondaPrevia.getNivel();
			
			System.out.println("Desea continuar | Acumulado: "+String.valueOf(jugador.getMaxScore()));
			System.out.println("1. SI"
							+ "\n2. NO");
			
			do {
				String input = sc.nextLine();
				if (!(input == null) && !(input.length()>1)) {
					if (input.equals("1")) {
						continuar = true;
					} else {
						continuar = false;
					}
				} else {
					System.out.println("Opcion no valida");
				}
			} while (continuar == null);
			
			if (continuar) {
				cargarRonda(jugador, nivelAnterior+1);
			} else {
				finalizarRonda(jugador);
			}
		}				
	}

	@Override
	public void finalizarRonda(Jugador jugador) {
		
		JugadorService jugadorService = new JugadorServiceImpl();
		
		System.out.println("Fin del juego");
		System.out.println("Gracias por jugar "+jugador.getUsername() +", tu acumulado fue de "+ String.valueOf(jugador.getMaxScore()));
		jugadorService.actualizarPuntuacion(jugador);
		sc.close();
	}

}
