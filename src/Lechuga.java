public class Lechuga {

//propiedades
private String tipo, procedencia, color;
private Double eurosUnidad;
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

		public Double getEurosUniad()
		{
			return eurosUnidad;
		}
		
		public void  setEurosUnidad(Double euroUni)
		{
			eurosUnidad = euroUni;
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