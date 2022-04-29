package dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import dao.JugadorDao;
import jdbc.AdministradorDeConexiones;
import models.Jugador;

public class JugadorDaoImpl implements JugadorDao {

	@Override
	public Jugador getUserByUsername(String username) {
		
		String sql = "SELECT username, maxscore FROM public.jugadores WHERE username = '"+username+"'";		
		
		Jugador nuevoJugador = null;
		
		try(Connection con = AdministradorDeConexiones.obtenerConexion();) {
			
			try (Statement st = con.createStatement()){	
				
				try(ResultSet rs = st.executeQuery(sql);){
					
					while (rs.next()) {
						String nombreJugador = rs.getString("username");
						String puntajeMax = rs.getString("maxScore");
						
						nuevoJugador = new Jugador(nombreJugador, Long.valueOf(puntajeMax));
					}
				}				
			}		
		} catch (Exception e) {
			System.out.println("No se encontro tu nombre de usuario "+ username +" en la base de datos, se guardara al final de la sesion ");
		}
		
		return nuevoJugador;
	}

	@Override
	public void guardarJugador(Jugador usuario) {
		String sql = "INSERT INTO public.jugadores (username, maxscore) VALUES (?, ?)";
		try(Connection con = AdministradorDeConexiones.obtenerConexion();){
			
			try(PreparedStatement st = con.prepareStatement(sql);){
				st.setString(1, usuario.getUsername());
				st.setInt(2, usuario.getMaxScore().intValue());
				st.execute();
			}
		} catch (SQLException e) {
			System.out.println("Error al guardar en base de datos "+ e.getMessage());
		}
	}

	@Override
	public void actualizarPuntuacion(Jugador jugador) {
		String sql = "UPDATE public.jugadores SET maxscore = '"+String.valueOf(jugador.getMaxScore())+"' WHERE username = '"+jugador.getUsername()+"'";
		try (Connection con = AdministradorDeConexiones.obtenerConexion();){
			try (Statement st = con.createStatement()){
				st.execute(sql);
			}
		} catch (SQLException e) {
			System.out.println("Error al actualizar puntaje "+ e.getMessage());
		}
		
	}
}
