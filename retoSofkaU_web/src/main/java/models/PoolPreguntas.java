package models;

import java.util.ArrayList;
import java.util.List;

public class PoolPreguntas {
	
	public static List<Pregunta> cargarPoolPreguntas(){
		
		Categorias categoriaPregunta = Categorias.categoriaDealer();
		List<Pregunta> poolPreguntas = new ArrayList<>();
		
		switch (categoriaPregunta.getNombre()) {
		
		case "matematicas":
			poolPreguntas = poolMatematica(categoriaPregunta);
			break;		
		case "historia":
			poolPreguntas = poolHistoria(categoriaPregunta);
			break;
		case "biologia":
			poolPreguntas = poolBiologia(categoriaPregunta);
			break;
		case "linguistica":
			poolPreguntas = poolLenguaje(categoriaPregunta);
			break; 		
		case "geografia":
			poolPreguntas = poolGeografia(categoriaPregunta);
			break;
		default:
			System.out.println("No se encontro la categoria " + categoriaPregunta.getNombre());
			break;
		}		
		return poolPreguntas;
	}
	
	private static List<Pregunta> poolMatematica(Categorias categoria) {
		
		List<Pregunta> listaPreguntas = new ArrayList<>();
		
		Pregunta p1 = new Pregunta("Cuanto es 2+2?", "5", "9", "3", "4",categoria , 1);		
		Pregunta p2 = new Pregunta("Cuanto es un cuarto, de un cuarto?", "un medio", "un sexto", "un octavo", "un dieciseisavos", categoria, 2);		
		Pregunta p3 = new Pregunta("Cual es la funcion inversa a la potenciacion?", "suma", "division", "integracion", "radicacion", categoria, 3);
		Pregunta p4 = new Pregunta("Si se pago por una impresora $2100 con un descuento del 30% ¿Cual es el precio sin descuento de la impresora?", "$5000", "$2230", "$5700", "$3000", categoria, 4);
		Pregunta p5 = new Pregunta("Cual es la interpretacion geometrica de una derivada?", "La pendiente de la secante", "La pendiente del arcotangente", "El area debajo de la curva", "La pendiente de la tangente", categoria, 5);
		
		listaPreguntas.add(p1);
		listaPreguntas.add(p2);
		listaPreguntas.add(p3);
		listaPreguntas.add(p4);
		listaPreguntas.add(p5);
		
		return listaPreguntas;	
	}
	
	private static List<Pregunta> poolHistoria(Categorias categoria) {
		
		List<Pregunta> listaPreguntas = new ArrayList<>();
		
		Pregunta p1 = new Pregunta("Nombre del imperio que construyo las piramides ubicadas actualmente en Egipto?", "Imperio Inca", "Imperio Seleucida", "Imperio Romano", "Imperio Egipcio",categoria , 1);		
		Pregunta p2 = new Pregunta("Quien pinto la capilla sixtina?", "Donatello", "Vincent Van Gogh", "Leonardo da Vinci", "Miguel Angel", categoria, 2);		
		Pregunta p3 = new Pregunta("Con que nombre se le conocía a la ciudad Turca de Estambul?", "Ankara", "Adrianopolis", "Esparta", "Constantinopla", categoria, 3);
		Pregunta p4 = new Pregunta("Quien fue el ultimo zar de Rusia?", "Pedro I el Grande", "Nicolas I", "Catalina II", "Nicolas II", categoria, 4);
		Pregunta p5 = new Pregunta("Nombre del diadoco que goberno Egipto tras la muerte de Alejandro Magno", "Lisimaco", "Seleuco", "Antigono", "Ptolomeo", categoria, 5);
		
		listaPreguntas.add(p1);
		listaPreguntas.add(p2);
		listaPreguntas.add(p3);
		listaPreguntas.add(p4);
		listaPreguntas.add(p5);
		
		return listaPreguntas;		
	}
	
	private static List<Pregunta> poolBiologia(Categorias categoria) {
		
		List<Pregunta> listaPreguntas = new ArrayList<>();
		
		Pregunta p1 = new Pregunta("Cual es la unidad de vida mas pequeña?", "Organo", "Sistema", "Bacteria", "Celula",categoria , 1);		
		Pregunta p2 = new Pregunta("Nombre del pigmento que le da el color verde a las plantas?", "Verdefila", "Carotenoide", "Xantofila", "Clorofila ", categoria, 2);		
		Pregunta p3 = new Pregunta("Como se le conoce a los animales que solo se alimentan de carne?", "Herviboros", "Omnivoros", "Insectivoros", "Carnivoros", categoria, 3);
		Pregunta p4 = new Pregunta("Nombre del padre de la herencia genetica", "Charles Darwin", "Sigmund Freud", "Von Humboldt", "Gregor Mendel", categoria, 4);
		Pregunta p5 = new Pregunta("Nombre de la rama de la biologia que estudia las algas", "Algalogia", "Protozoologia", "Criptogamia", "Ficologia", categoria, 5);
		
		listaPreguntas.add(p1);
		listaPreguntas.add(p2);
		listaPreguntas.add(p3);
		listaPreguntas.add(p4);
		listaPreguntas.add(p5);
		
		return listaPreguntas;	
	}
	
	private static List<Pregunta> poolLenguaje(Categorias categoria) {
		
		List<Pregunta> listaPreguntas = new ArrayList<>();
		
		Pregunta p1 = new Pregunta("Completar el refran: Mejor pajaro en mano...", "que ninguno volando", "que un diente de caballo", "que camaron dormido", "que ciento volando",categoria , 1);		
		Pregunta p2 = new Pregunta("Completar el refran: Mejor pajaro en mano...", "que ninguno volando", "que un diente de caballo", "que camaron dormido", "que ciento volando",categoria, 2);		
		Pregunta p3 = new Pregunta("Cual es la lengua romance con mas hablantes?", "Italiano", "Portugues", "Frances", "Castellano", categoria, 3);
		Pregunta p4 = new Pregunta("Segun la RAE, es la imitación del sonido de algo en el vocablo que imita o recrea el sonido de la cosa o la acción nombrada.", "Sinestesia", "Anafora", "Metonimia", "Onomatopeya", categoria, 4);
		Pregunta p5 = new Pregunta("Nombre del alfabeto mayormente utilizado por los pueblos eslavos y de Eurasia?", "Hiragana", "Glagolico", "Latino", "Cirilico", categoria, 5);
		
		listaPreguntas.add(p1);
		listaPreguntas.add(p2);
		listaPreguntas.add(p3);
		listaPreguntas.add(p4);
		listaPreguntas.add(p5);
		
		return listaPreguntas;
	}
	
	private static List<Pregunta> poolGeografia(Categorias categoria) {
			
			List<Pregunta> listaPreguntas = new ArrayList<>();
			
			Pregunta p1 = new Pregunta("En que continente se ubican las piramides de Egipto?", "America", "Europa", "Asia", "Africa",categoria , 1);		
			Pregunta p2 = new Pregunta("Nombre del rio mas extenso del mundo?", "Rio Amarillo", "Rio Magdalena", "Rio Nilo", "Rio Amazonas", categoria, 2);		
			Pregunta p3 = new Pregunta("Nombre de la cordillera mas extensa del mundo?", "Los Alpes", "El Himalaya", "Macizo de Altai", "Los Andes", categoria, 3);
			Pregunta p4 = new Pregunta("Nombre de la masa de tierra que formaba un unico continente en el origen del planeta?", "Panacea", "Panceta", "Pana", "Pangea", categoria, 4);
			Pregunta p5 = new Pregunta("Cual es la ubicacion geografica mas alejada del centro de la tierra?", "Monte Everest", "Mauna Kea", "Pico Cristobal Colon", "Pico del Chimborazo", categoria, 5);
			
			listaPreguntas.add(p1);
			listaPreguntas.add(p2);
			listaPreguntas.add(p3);
			listaPreguntas.add(p4);
			listaPreguntas.add(p5);
			
			return listaPreguntas;
		}
}
