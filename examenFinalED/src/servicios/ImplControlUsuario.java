package servicios;

import java.util.InputMismatchException;
import java.util.List;

import javax.swing.JOptionPane;

import entidades.Propietario;
import entidades.Veterinario;

/**
 * Clase que implementa la interfazControlUsuario donde se definen al detalle la funcionalidad de los métodos
 * que dan servicio a la clínica veterinaria.
 * @author nico
 *
 */
public class ImplControlUsuario implements InterfazControlUsuario {
	
	@Override
	public 	void altaUsuario(List<Veterinario>baseDatosVeterinario, List<Propietario>baseDatosPropietario) {

		
		String nombre, apellidos;
		
		int tipoUsuario = elegirTipoUsuario();
		nombre=JOptionPane.showInputDialog("Introduce el nombre del usuario: ");
		apellidos=JOptionPane.showInputDialog("Introduce los apellidos del usuario: ");
				
		switch(tipoUsuario) {
		
			case 1:
				String numColegiado = JOptionPane.showInputDialog("Introduce el número de colegiado del veterinario: ");
				baseDatosVeterinario.add(
						new Veterinario(
								generarId(baseDatosVeterinario,baseDatosPropietario)
								,nombre,apellidos,true,numColegiado));
				JOptionPane.showMessageDialog(null, "Veterinario registrado correctamente en el sistema!");
				break;
			case 2:				
				int numMascotas =Integer.parseInt(JOptionPane.showInputDialog("Introduce el número de mascotas del propietario: "));
				baseDatosPropietario.add(
						new Propietario(
								generarId(baseDatosVeterinario,baseDatosPropietario)
								,nombre,apellidos,false,numMascotas));
				JOptionPane.showMessageDialog(null, "Propietario registrada correctamente en el sistema!");

				break;
		}
			
	}

	@Override
	public int elegirTipoUsuario() {
		
		int tipoUsuario;	
		
		do {
			try {
				tipoUsuario=Integer.parseInt(JOptionPane.showInputDialog("\nQue tipo de usuario es: \n1. Veterinario\n2. Propietario"));
				if(tipoUsuario<1||tipoUsuario>2) {
					JOptionPane.showMessageDialog(null,"\n**[ERROR] no se reconoce el usuario seleccionado **");
				}		
			
			} catch(InputMismatchException e) {
			throw new InputMismatchException("Valor no válido");
			}      
		}while(tipoUsuario<1||tipoUsuario>2);
		return tipoUsuario;	
	}
	
	/**
	 * Genera un identificador único por cada nuevo usuario que se va dar de alta en el concesionario.
	 * @param baseDatosPropietario
	 * @param baseDatosVeterinario
	 * @return un número entero que será el identificador del nuevo vehículo
	 */
	private int generarId(List<Veterinario> baseDatosVeterinario, List<Propietario> baseDatosPropietario) {
		
		int idMayor=0;
		if(baseDatosVeterinario.isEmpty() && baseDatosPropietario.isEmpty())
			return idMayor = 1;
		else {
			for (Veterinario veterinario : baseDatosVeterinario) {
				if (veterinario.getCodigoIdentificador() > idMayor) 
					idMayor=veterinario.getCodigoIdentificador() ;				        			    
				}
			for (Propietario propietario : baseDatosPropietario) {
			   if (propietario.getCodigoIdentificador() > idMayor) 
				   idMayor=propietario.getCodigoIdentificador() ;				        
			}			
			return idMayor+1;				
		}				
	}

}
