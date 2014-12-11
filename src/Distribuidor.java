public class Distribuidor {
//propiedades
	private String nombre, cif;
	private Direccion direccion;
	private Contacto personaContacto;

//metodos getter y setter

	public String getNombre()
			{
				return nombre;
			}
			
			public void  setNombre(String nomd)
			{
				nombre = nomd;
			}

	public String getCif()
			{
				return cif;
			}
			
			public void  setCif(String cifd)
			{
				cif = cifd;
			}


	public Direccion getDireccion()
			{
				return direccion;
			}
			
			public void  setDireccion(Direccion helbidea)
			{
				direccion = helbidea;
			}


	public Contacto getPersonaContacto()
			{
				return personaContacto;
			}
			
			public void  setPersonaContacto(Contacto pContacto)
			{
				personaContacto=pContacto;
			}
}