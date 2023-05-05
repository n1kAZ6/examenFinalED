package servicios;

import java.util.List;

import entidades.Propietario;
import entidades.Veterinario;

/**
 * Interfaz que tiene la cabecera de los métodos que dan servicio a la gestión de ficheros.
 * @author nico
 *
 */
public interface InterfazGestionFicheros {
	/**
	 * Este método realiza la escritura de la base de datos de usuario en el fichero de la ruta que recibe por argumento
	 * @param rutaFichero (ruta absoluta donde se encuentra el fichero)
	 */
	void escrituraFichero(String rutaFichero, List<Veterinario> baseDatosVeterinario, List<Propietario> baseDatosPropietario);
	/**
	 * Método encargado de leer el fichero del registro de usuarios en el sistema
	 * @param rutaFichero
	 */
	void lecturaFichero(String rutaFichero);

	/**
	 * Escribe la cabecera en los ficheros de los usuarios en caso de que el fichero sea nuevo o estuviera en blanco
	 * @param rutaFichero
	 * @param cabecera
	 */
	public void crearCabecera(String rutaFichero, String cabecera);
}
