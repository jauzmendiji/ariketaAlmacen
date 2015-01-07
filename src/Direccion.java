public class Direccion {

	//añadid las propiedades convenientes
	private String poblacion;
	private String localidad;
	private String calle;
	private int numero;

	//métodos getter y setter
	public void setPoblacion (String pob){
		poblacion = pob;
	}
	public String getPoblacion(){
		return poblacion;
	}
	public void setLocalidad (String pueblo){
		localidad = pueblo;
	}
	public String getLocalidad(){
		return localidad;
	}
	public void setCalle (String cal){
		calle = cal;
	}
	public String getCalle(){
		return calle;
	}
	public void setNumero (int num){
		numero = num;
	}
	public int getNumero(){
		return numero;
	}
}