public class Cliente {
//propiedades

private String nombre, apellidos, DNI;
private Direccion direccion;
private Double num_socio, dto;

//métodos getter y setter

public String getNombre(){
			return nombre;
		}
		
		public void  setNombre(String nombre1){
			nombre=nombre1;
		}

		public String getApellidos(){
			return apellidos;
		}
		
		public void  setApellidos(String apellidos1){
			apellidos=apellidos1;
		}

		public String getDNI(){
			return DNI;
		}
		
		public void  setDNI(String dni1){
			DNI=dni1;
		}

		public Direccion getDireccion(){
			return direccion;
		}
		
		public void  setDireccion(Direccion direccion1){
			direccion=direccion1;
		}

		public Double getNum_socio(){
			return num_socio;
		}
		
		public void  setNum_socio(Double num_socio1){
			num_socio=num_socio1;
		}

		public Double getDto(){
			return dto;
		}
		
		public void  setDto(Double dto1){
			dto=dto1;
		}





}
