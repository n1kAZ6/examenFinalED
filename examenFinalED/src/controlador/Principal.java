package controlador;

import java.awt.HeadlessException;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;

import javax.swing.JOptionPane;

import entidades.Propietario;
import entidades.Veterinario;
import servicios.ImplControlUsuario;
import servicios.ImplGestionFicheros;
import servicios.ImplMenu;
import servicios.InterfazControlUsuario;
import servicios.InterfazGestionFicheros;
import servicios.InterfazMenu;

/**
 * Clase principal la cual es la entrada a la app, solo estan definidos los pasos y el procedimiento de ejecución que sigue la aplicación.
 * @author nico
 *
 */
public class Principal {

	//Constantes con la ruta del fichero donde se guardará los usuarios registrados, 
	//se debe asegurar su existencia en dicha ruta y cambiar el usuario (en este caso nico) por el donde se ejecute la app.
	public static final String ARCHIVO_USUARIOS = "C:\\Users\\nico\\Desktop\\usuarios.txt";
	
	public static void main(String[] args) {
	
		List<Veterinario>baseDatosVeterinario = new ArrayList<>();
		List<Propietario>baseDatosPropietario = new ArrayList<>();
		

		InterfazMenu intM = new ImplMenu();
		InterfazControlUsuario controlRegistroUsuario = new ImplControlUsuario();
		InterfazGestionFicheros gestionFichero = new ImplGestionFicheros();
		
		//Crea la cabecera en el fichero
		gestionFichero.crearCabecera(ARCHIVO_USUARIOS, "id;nombre;apellidos;esVeterinario;numeroColegiado;numeroMascotas");
			
		boolean cerrarMenu=false;
		int opcion;
			
		do {
			try {						
				opcion=intM.mostrarMenu();
				System.out.println("\n[INFO] - Has seleccionado la opcion " + opcion);
				switch(opcion) {
					case 1:
						 controlRegistroUsuario.altaUsuario(baseDatosVeterinario, baseDatosPropietario);
						break;
					case 2:
						gestionFichero.escrituraFichero(ARCHIVO_USUARIOS,baseDatosVeterinario, baseDatosPropietario);
						break;
					case 3:
						gestionFichero.lecturaFichero(ARCHIVO_USUARIOS);
						break;
					case 4:
						cerrarMenu=true;
						break;
					default:
						JOptionPane.showMessageDialog(null,"\n**[ERROR] opción elegida no disponible **");
						break;
				}
			} catch(InputMismatchException e) {
				JOptionPane.showMessageDialog(null,"\n**[ERROR] entrada inválida: por favor ingrese un número entero **");
			} catch(NullPointerException npe) {
				JOptionPane.showMessageDialog(null,"\n**[ERROR] el elemento requerido para trabajar es null: " + npe.getMessage() + " **");
			} catch(HeadlessException e) {
				JOptionPane.showMessageDialog(null,"\n**[ERROR] el sistema sin interfaz gráfica: " + e.getMessage() + " **");
			} catch (NumberFormatException e){
				JOptionPane.showMessageDialog(null,"\n**[ERROR] no es un número entero, no ha introducido nada o el formato no es correcto: " + e.getMessage() + " **");
			} catch(Exception e) {
				JOptionPane.showMessageDialog(null,"\n**[ERROR] ocurrió una excepción no esperada:: " + e.getMessage() + " **");
			}
		}while(!cerrarMenu);
			
		JOptionPane.showMessageDialog(null,"\nDesconectando, Gracias por su confianza en nuestra clínica!");
	}
}
