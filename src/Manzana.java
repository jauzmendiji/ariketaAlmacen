public class Manzana {
//propiedades
	private String tipo, procedencia, color;
	private Double eurosKilo;
	private Distribuidor distribuidor;

//métodos getter y setter

	public String getTipo()
		{
			return tipo;
		}
		
	public void  setTipo(String mota)
		{
			tipo = mota;
		}

	public String getProcedencia()
		{
			return procedencia;
		}
		
	public void  setProcedencia(String proce)
		{
			procedencia = proce;
		}

	public String getColor()
		{
			return color;
		}
		
	public void  setColor(String kolorea)
		{
			color = kolorea;
		}

	public Double getEurosKilo()
		{
			return eurosKilo;
		}
		
	public void  setEurosKilo(Double euroKilo)
		{
			eurosKilo = euroKilo;
		}

	public Distribuidor getDistribuidor()
		{
			return distribuidor;
		}
		
	public void  setDistribuidor(Distribuidor distri)
		{
			distribuidor = distri;
		}
}