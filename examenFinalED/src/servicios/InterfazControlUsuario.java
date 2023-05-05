package servicios;

import java.util.List;

import entidades.Propietario;
import entidades.Veterinario;

/**
 * Interfaz que define la cabecera de los métodos que se tendrán que implementar para dar servicio para la clínica veterinaria.
 * @author nico
 *
 */
public interface InterfazControlUsuario {

	/**
	 * Método que da de alta un tipo concreto de usuario y segun dicho tipo, se almacena en su correspondiente lista.
	 * @param baseDatosVeterinario
	 * @param baseDatosPropietario
	 */
	void altaUsuario(List<Veterinario>baseDatosVeterinario, List<Propietario>baseDatosPropietario);

	/**
	 * Da la opción de elegir el tipo de usuario con el que se quiere trabajar
	 * @return un número entero que hace referencia al tipo de usuario
	 */
	public int elegirTipoUsuario();
}
