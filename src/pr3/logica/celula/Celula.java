package pr3.logica.celula;

import java.io.FileWriter;
import java.io.IOException;

import pr3.excepciones.FormatoNumericoIncorrecto;
import pr3.excepciones.IndicesFueraDeRango;
import pr3.logica.Casilla;
import pr3.logica.Superficie;

/**
 * Clase celula a modo de interfaz para dos de sus implementaciones, celula
 * compleja y celula simple. Posee aquellos metodos que son comunes para ambas
 * implementcaciones.
 */

public interface Celula {
	public abstract String toString();

	/**
	 * Se encarga de cargar del fichero la informacion relacionada con las
	 * celulas.
	 * 
	 * @param cadenaLinea
	 *            String obtenido del scanner.
	 * @throws FormatoNumericoIncorrecto
	 *             Lanza una excepcion en caso de que el numero escaneado este
	 *             en el formato correcto.
	 */

	public abstract void cargar(String[] cadenaLinea) throws FormatoNumericoIncorrecto;

	/**
	 * Se encarga de guardar en el fichero la informacion relacionada con las
	 * celulas.
	 * 
	 * @param fich
	 *            Parametro de escritura necesario para guardar el archivo.
	 * @throws IOException
	 */

	public abstract void guardar(FileWriter fich) throws IOException;

	/**
	 * * Mueve la celula por el tablero realizando en la tarea todo lo que ello
	 * conlleve, ya sea la muerte de la celula en cuestion, la muerte de otras
	 * celulas o bien el nacimiento de nuevas celulas.
	 * 
	 * @param casilla
	 *            Casilla actual de la celula.
	 * @param superficie
	 *            Superficie en la que se desarrolla el juego.
	 * @return Devuelve la casilla de destino.
	 */

	public abstract Casilla ejecutaMovimiento(Casilla casilla, Superficie superficie) throws IndicesFueraDeRango;

	/**
	 * @return Devuelve la "comestibilidad" de la celula.
	 */

	public abstract boolean esComestible();
}
