package entidades;

/**
 * Clase que representa a la entidad Propietario y que deriva de Usuario. Contiene atributos, constructor, métodos y los getter & setter 
 * para acceso a los atributos y métodos.
 * @author nico
 *
 */
public class Propietario extends Usuario {
	
	//Atributos
	private int numMascotas;

	//Constructor
	public Propietario(int codigoIdentificador, String nombre, String apellidos, boolean esVeterinario, int numMascotas) {
		super(codigoIdentificador, nombre, apellidos, esVeterinario);
		this.numMascotas=numMascotas;
	}

	//Getter & setter
	public int getNumMascotas() {
		return numMascotas;
	}

	public void setNumMascotas(int numMascotas) {
		this.numMascotas = numMascotas;
	}
	
	/**
	 * Método encargado de crear el registro con el formato correcto en el fichero, separado por ; los campos.
	 * @return un string con formato
	 */
	public String crearRegistro() {
		return  getCodigoIdentificador()+";"+getNombre()+";"+ getApellidos() +";"+ (getEsVeterinario() ? "Si" : "No") +";"+getNumMascotas();
	}
	

}
