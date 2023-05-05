package entidades;

/**
 * Clase que representa a la entidad Veterinario y que deriva de Usuario. Contiene atributos, constructor, métodos y los getter & setter 
 * para acceso a los atributos y métodos.
 * @author nico
 *
 */
public class Veterinario extends Usuario{

	
	//Atributos
	private String numColegiado;
	
	//Constructor
	public Veterinario(int codigoIdentificador, String nombre, String apellidos, boolean esVeterinario, String numColegiado) {
		super(codigoIdentificador, nombre, apellidos, esVeterinario);
		this.numColegiado=numColegiado;
	}

	//Getter & setter
	public String getNumColegiado() {
		return numColegiado;
	}

	public void setNumColegiado(String numColegiado) {
		this.numColegiado = numColegiado;
	}
	
	//Métodos
	
	/**
	 * Método encargado de crear el registro con el formato correcto en el fichero, separado por ; los campos.
	 * @return un string con formato
	 */
	public String crearRegistro() {
		return  getCodigoIdentificador()+";"+getNombre()+";"+ getApellidos() +";"+ (getEsVeterinario() ? "Si" : "No") +";"+getNumColegiado();
	}
	
	

}
