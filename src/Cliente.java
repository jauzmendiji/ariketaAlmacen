public class Cliente {
	//propiedades

	private String nombre;
	private String apellidos;
	private String DNI;
	private Direccion direccion;
	private int num_socio;
	private Double dto;

	//métodos getter y setter
	public void setNombre (String nom){
		nombre = nom;
	}
	public String getNombre(){
		return nombre;
	}
	public void setApellidos (String ape){
		apellidos = ape;
	}
	public String getApellidos(){
		return apellidos;
	}
	public void setDNI (String dn){
		DNI = dn;
	}
	public String getDNI(){
		return DNI;
	}
	public void setDireccion (Direccion dir){
		direccion = dir;
	}
	public Direccion getDireccion(){
		return direccion;
	}
	public void setNum_Socio (int ns){
		num_socio = ns;
	}
	public int getNum_Socio(){
		return num_socio;
	}
	public void setDto (Double dt){
		dto = dt;
	}
	public Double getDto(){
		return dto;
	}
}