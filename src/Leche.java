public class Leche {

	//propiedades
	private String tipo;
	private String procedencia;
	private Double eurosLitro;
	private Distribuidor distribuidor;
	private int cod_barras;

	//métodos getter y setter
	public void setTipo (String tip){
		tipo = tip;
	}
	public String getTipo(){
		return tipo;
	}
	public void setProcedencia (String pro){
		procedencia = pro;
	}
	public String getProcedencia(){
		return procedencia;
	}
	public void setEurosLitro (Double el){
		eurosLitro = el;
	}
	public Double getEurosLitro(){
		return eurosLitro;
	}
	public void setDistribuidor (Distribuidor dis){
		distribuidor = dis;
	}
	public Distribuidor getDistribuidor(){
		return distribuidor;
	}
	public void setCod_Barras (Integer cb){
		cod_barras = cb;
	}
	public Integer getCod_Barras(){
		return cod_barras;
	}
}