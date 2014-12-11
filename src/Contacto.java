public class Contacto {
//Declaración de variables
	private String nombre, apellido1, apellido2, dni, mail;
	private int telefono;

//Métodos getter y setter
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nom1) {
		nombre = nom1;
	}

	public String getApellido1() {
		return apellido1;
	}
	public void setApellido1(String ape1) {
		apellido1 = ape1;
	}

	public String getApellido2() {
		return apellido2;
	}
	public void setApellido2(String ape2) {
		apellido2 = ape2;
	}

	public String getDni() {
		return dni;
	}
	public void setDni(String dnic) {
		dni = dnic;
	}

	public String getMail() {
		return mail;
	}
	public void setMail(String mailc) {
		mail = mailc;
	}

	public int getTelefono() {
		return telefono;
	}
	public void setTelefono(int tel) {
		telefono = tel;
	}
	
}