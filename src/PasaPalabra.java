
import java.util.Scanner;

public class PasaPalabra {

	private static Scanner teclado = new Scanner(System.in);

	private static String PASA_PALABRA = "PasaPalabra";

	private static int ESTADO_SIN_CONTESTAR = 0;
	private static int ESTADO_ACERTADO = 1;
	private static int ESTADO_FALLADA = 2;

	private static String PREGUNTA_A = "Fruto del olivo del que se obtiene aceite";
	private static String RESPUESTA_A = "Aceituna";

	private static String PREGUNTA_E = "Cuando llevas mucho tiempo corriendo te quedas sin...";
	private static String RESPUESTA_E = "Energía";

	private static String PREGUNTA_I = "Persona que sabe mucho";
	private static String RESPUESTA_I = "Inteligente";

	private static String PREGUNTA_O = "Parte del cuerpo que se encuentra en el abdomen";
	private static String RESPUESTA_O = "Ombligo";

	private static String PREGUNTA_U = "Lugar en el que se estudia";
	private static String RESPUESTA_U = "Universidad";

	public static void main(String[] args) {

		int estadoPreguntaA = ESTADO_SIN_CONTESTAR;
		int estadoPreguntaE = ESTADO_SIN_CONTESTAR;
		int estadoPreguntaI = ESTADO_SIN_CONTESTAR;
		int estadoPreguntaO = ESTADO_SIN_CONTESTAR;
		int estadoPreguntaU = ESTADO_SIN_CONTESTAR;

		String respuesta;
		int aciertos = 0;
		int fallos = 0;

		System.out.println("Bienvenido a PasaPalabra, cuanto quieres ganar hoy?");

		do {

			// PREGUNTA A
			if (estadoPreguntaA == ESTADO_SIN_CONTESTAR) {
				System.out.println(PREGUNTA_A);
				respuesta = teclado.nextLine();
				if (respuesta.equalsIgnoreCase(PASA_PALABRA)) {
					System.out.println("Siguiente pregunta");
				} else {
					if (respuesta.equalsIgnoreCase(RESPUESTA_A)) {
						System.out.println("Acierto");
						estadoPreguntaA = ESTADO_ACERTADO;
						aciertos++;
					} else {
						System.out.println("Fallo");
						estadoPreguntaA = ESTADO_FALLADA;
						fallos++;
					}
				}
			}

			// PREGUNTA E
			if (estadoPreguntaE == ESTADO_SIN_CONTESTAR) {
				System.out.println(PREGUNTA_E);
				respuesta = teclado.nextLine();
				if (respuesta.equalsIgnoreCase(PASA_PALABRA)) {
					System.out.println("Siguiente pregunta");
				} else {
					if (respuesta.equalsIgnoreCase(RESPUESTA_E)) {
						System.out.println("Acierto");
						estadoPreguntaE = ESTADO_ACERTADO;
						aciertos++;
					} else {
						System.out.println("Fallo");
						estadoPreguntaE = ESTADO_FALLADA;
						fallos++;
					}
				}
			}

			// PREGUNTA I
			if (estadoPreguntaI == ESTADO_SIN_CONTESTAR) {
				System.out.println(PREGUNTA_I);
				respuesta = teclado.nextLine();
				if (respuesta.equalsIgnoreCase(PASA_PALABRA)) {
					System.out.println("Siguiente pregunta");
				} else {
					if (respuesta.equalsIgnoreCase(RESPUESTA_I)) {
						System.out.println("Acierto");
						estadoPreguntaI = ESTADO_ACERTADO;
						aciertos++;
					} else {
						System.out.println("Fallo");
						estadoPreguntaI = ESTADO_FALLADA;
						fallos++;
					}
				}
			}

			// PREGUNTA O
			if (estadoPreguntaO == ESTADO_SIN_CONTESTAR) {
				System.out.println(PREGUNTA_O);
				respuesta = teclado.nextLine();
				if (respuesta.equalsIgnoreCase(PASA_PALABRA)) {
					System.out.println("Siguiente pregunta");
				} else {
					if (respuesta.equalsIgnoreCase(RESPUESTA_O)) {
						System.out.println("Acierto");
						estadoPreguntaO = ESTADO_ACERTADO;
						aciertos++;
					} else {
						System.out.println("Fallo");
						estadoPreguntaO = ESTADO_FALLADA;
						fallos++;
					}
				}
			}

			// PREGUNTA U
			if (estadoPreguntaU == ESTADO_SIN_CONTESTAR) {
				System.out.println(PREGUNTA_U);
				respuesta = teclado.nextLine();
				if (respuesta.equalsIgnoreCase(PASA_PALABRA)) {
					System.out.println("Siguiente pregunta");
				} else {
					if (respuesta.equalsIgnoreCase(RESPUESTA_U)) {
						System.out.println("Acierto");
						estadoPreguntaU = ESTADO_ACERTADO;
						aciertos++;
					} else {
						System.out.println("Fallo");
						estadoPreguntaU = ESTADO_FALLADA;
						fallos++;
					}
				}
			}
		} while (estadoPreguntaA == ESTADO_SIN_CONTESTAR 
				|| estadoPreguntaE == ESTADO_SIN_CONTESTAR
				|| estadoPreguntaI == ESTADO_SIN_CONTESTAR 
				|| estadoPreguntaO == ESTADO_SIN_CONTESTAR
				|| estadoPreguntaU == ESTADO_SIN_CONTESTAR); //

		System.out.println("Has fallado " + fallos + " veces");
		System.out.println("Has acertado " + aciertos + " veces");

		
	}
}