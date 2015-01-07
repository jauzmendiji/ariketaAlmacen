public class Contacto {

	//añadid las propiedades convenientes
	private String nombre;
	private String apellido;
	private String email;
	private int telefono;
	//métodos getter y setter
	public void setNombre (String nom){
		nombre = nom;
	}
	public String getNombre(){
		return nombre;
	}
	public void setApellido (String ape){
		apellido = ape;
	}
	public String getApellido(){
		return apellido;
	}
	public void setEmail (String em){
		email = em;
	}
	public String getEmail(){
		return email;
	}
	public void setTelefono (int tlf){
		telefono = tlf;
	}
	public int getTelefono(){
		return telefono;
	}
}