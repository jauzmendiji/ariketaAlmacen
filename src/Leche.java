public class Leche {

//propiedades
private String tipo, procedencia;
private Double eurosLitro;
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

		

		public Double getEurosLitro()
		{
			return eurosLitro;
		}
		
		public void  setEurosLitro(Double eurolitro)
		{
			eurosLitro = eurolitro;
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