public class Distribuidor {
	//propiedades
	private String nombre;
	private String cif;
	private Direccion direccion;
	private Contacto personaContacto;

	//metodos getter y setter
	public void setNombre (String nom){
		nombre = nom;
	}
	public String getNombre(){
		return nombre;
	}
	public void setCif (String cf){
		cif = cf;
	}
	public String getCif(){
		return cif;
	}
	public void setDireccion (Direccion dir){
		direccion = dir;
	}
	public Direccion getDireccion(){
		return direccion;
	}
	public void setPersonaContacto (Contacto pc){
		personaContacto = pc;
	}
	public Contacto getPersonaContacto(){
		return personaContacto;
	}
}