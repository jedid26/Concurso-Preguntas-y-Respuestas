package app;

import java.util.Scanner;

import models.Jugador;
import service.JugadorService;
import service.RondaService;
import service.impl.JugadorServiceImpl;
import service.impl.RondaServiceImpl;

public class App {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		JugadorService jugadorService = new JugadorServiceImpl();
		RondaService rondaService = new RondaServiceImpl();
		
		System.out.println("Ingrese nombre de usuario: ");
		
		String input = null;
		do {
			input = sc.nextLine();
			if (input == null || input.isBlank()) {
				System.out.println("Ingresa tu usuario");
			}
		} while (input.isBlank());
		
		Jugador nuevoJugador = jugadorService.getUserByUsername(input);
		if (nuevoJugador == null) {
			nuevoJugador = new Jugador(input, 0l);
			jugadorService.guardarJugador(nuevoJugador);
			rondaService.cargarRonda(nuevoJugador, 1);		
		} else {
			rondaService.cargarRonda(nuevoJugador, 1);
		}
		sc.close();
	}
}
