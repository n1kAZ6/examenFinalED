package servicios;

import javax.swing.JOptionPane;

/**
 * Clase que implementa la interfaz menú y es donde se describe la funcionalidad concreta de 
 * los métodos de dicha interfaz.
 * @author nico
 *
 */
public class ImplMenu implements InterfazMenu{

	@Override
	public int mostrarMenu() {
		return Integer.parseInt(JOptionPane.showInputDialog("\nMenú Veterinaria\n"
				+ "\n1. Alta usuario\n2. Guardar base de datos en fichero\n3. Lectura fichero de base de datos"
				+ "\n4. Salir\n\nIntroduce la opción deseada: "));	
	}

}
