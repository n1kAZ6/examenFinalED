package entidades;

/**
 * Clase que representa a la entidad Usuario y que es la clase padre. Contiene atributos, constructor, métodos y los getter & setter 
 * para acceso a los atributos y métodos.
 * @author nico
 *
 */
public class Usuario {

	
	//Atributos
	private int codigoIdentificador;
	private String nombre;
	private String apellidos;
	private boolean esVeterinario;
	
	//Constructor
	public Usuario(int codigoIdentificador, String nombre, String apellidos, boolean esVeterinario) {
		this.codigoIdentificador = codigoIdentificador;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.esVeterinario = esVeterinario;
	}

	//Getter & setter
	public int getCodigoIdentificador() {
		return codigoIdentificador;
	}

	public String getNombre() {
		return nombre;
	}


	public String getApellidos() {
		return apellidos;
	}

	public boolean getEsVeterinario() {
		return esVeterinario;
	}

		
	
	
	
}
