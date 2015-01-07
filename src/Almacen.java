
/* Hau nire programa da, Cesta gabe ina

public class Main {

public static void main (String args[]) throws IOException{		
		Scanner sc = new Scanner(System.in);

		
		ArrayList<Distribuidor> distribuidores = new ArrayList<Distribuidor>();
		try{
			String ruta = "./distribuidores.txt";
 			File archivo2 = new File(ruta);
			FileReader leer2 = new FileReader (archivo2);
			BufferedReader bf2 = new BufferedReader(leer2);
			String salida2 = bf2.readLine();
	        
	        
	        String [] cortarString = null;
	        String [] cortarString1 = null;	
	        String [] cortarString2 = null;	
	        String [] cortarString3 = null;	
	       
	        while(salida2!=null){
	        	//separa el string de la  linea usara el ; como referencia de la separacion
	        	cortarString = salida2.split("#");
	        
	        	
	       		Distribuidor distribuidor = new Distribuidor();
	       		cortarString1 = cortarString[0].split(",");
	       		distribuidor.setNombre (cortarString1[0]);
	       		distribuidor.setCif (cortarString1[1]);
	       		Direccion direccion = new Direccion();
	       		cortarString2 = cortarString[1].split(",");
	       		direccion.setCiudad  (cortarString2[0]);
	       		direccion.setCalle  (cortarString2[1]);
	       		direccion.setNumero  (Integer.parseInt(cortarString2[2]));
	       		direccion.setCP  (Integer.parseInt(cortarString2[3]));
	       		distribuidor.setDireccion(direccion);
	       		Contacto contacto = new Contacto();
	       		cortarString3 = cortarString[2].split(",");
	       		contacto.setNombre (cortarString3[0]);
	       		contacto.setApellido1 (cortarString3[1]);
	       		contacto.setApellido2 (cortarString3[2]);
	       		contacto.setDni (cortarString3[3]);
	       		contacto.setMail (cortarString3[4]);
	       		contacto.setTelefono (Integer.parseInt(cortarString3[5]));
	       		distribuidor.setPersonaContacto(contacto);
	       		
	       	
	       		
	       		
	       		distribuidores.add(distribuidor);
	       		
	       		
	       		
	       		salida2 = bf2.readLine();
	        }
	        //-----------------Introducccion de datos de las manzanas------------------
	        ArrayList<Manzana> manzanas = new ArrayList<Manzana>();	        
	        ArrayList<String> distribuman = new ArrayList<String>();
	        ArrayList<String> distribuleche = new ArrayList<String>();
	        ArrayList<String> distribulechu = new ArrayList<String>();
	        System.out.println("----> Datos de la manzana ----------- ");
			for (int m=0 ; m<2 ; m++){
				Manzana manzana = new Manzana();
				System.out.println("Tipo de manzana: ");
				manzana.setTipo(sc.next());
				System.out.println("Procedencia de la manzana: ");
				manzana.setProcedencia(sc.next());
				System.out.println("Color de la manzana: ");
				manzana.setColor(sc.next());
				System.out.println("Cantidad de kilos de manzanas: ");
				manzana.setEurosKilo(sc.nextDouble());
				System.out.println("Nombre del distribuidor de la manzana: ");
				String di = sc.next();
				System.out.println("Numero de codigo de barras: ");
				manzana.setCod_Barras(sc.nextInt());
				distribuman.add(di);
				manzanas.add(manzana);
			
			}
			//-----------------Introducccion de datos de la leche------------------
			ArrayList<Leche> leches = new ArrayList<Leche>();
				System.out.println("----> Datos de la leche ------------ ");
			for (int l=0 ; l<2 ; l++){
				Leche leche = new Leche();
				System.out.println("Introduce el tipo de leche: ");
				leche.setTipo(sc.next());
				System.out.println("Introduce la procedencia de la leche: ");
				leche.setProcedencia(sc.next());
				System.out.println("Introduce la cantidad de litros de leche: ");
				leche.setEurosLitro(sc.nextDouble());
				System.out.println("Introduce el nombre del distribuidor de la leche: ");
				String dl = sc.next();
				System.out.println("Numero de codigo de barras: ");
				leche.setCod_Barras(sc.nextInt());
				distribuleche.add(dl);
				leches.add(leche);
			
			}
			//-----------------Introducccion de datos de las lechugas ------------------
				ArrayList<Lechuga> lechugas = new ArrayList<Lechuga>();
				System.out.println("----> Datos de la lechuga ----------- ");
			for (int g=0 ; g<=0 ; g++){
				Lechuga lechuga = new Lechuga();
				System.out.println("Introduce el tipo de lechuga: ");
				lechuga.setTipo(sc.next());
				System.out.println("Introduce la procedencia de la lechuga: ");
				lechuga.setProcedencia(sc.next());
				System.out.println("Introduce el color de la lechuga: ");
				lechuga.setColor(sc.next());
				System.out.println("Introduce las unidades de lechuga: ");
				lechuga.setEurosUnidad(sc.nextDouble());
				System.out.println("Introduce el nombre del distribuidor de la lechuga: ");
				String dle = sc.next();
				System.out.println("Numero de codigo de barras: ");
				lechuga.setCod_Barras(sc.nextInt());
				distribulechu.add(dle);
				lechugas.add(lechuga);
			
			}
			//---------impresion de las manzanas con sus respectivos distribuidores-------------
			System.out.println(" \n\n----------- MANZANA --------------" );
			for (int m=0 ; m < manzanas.size(); m++){
				System.out.println(" \n\nTipo de manzana: "+manzanas.get(m).getTipo() );
	            System.out.println(" \nProcedencia: "+manzanas.get(m).getProcedencia());
	            System.out.println(" \nColor : "+manzanas.get(m).getColor() );
	            System.out.println(" \nEuros Kilo: "+manzanas.get(m).getEurosKilo());
	           
		        for(int d=0; d<distribuidores.size(); d++)
	        	{
	        		if (distribuman.get(m).equalsIgnoreCase(distribuidores.get(d).getNombre())){
	            	System.out.println("  ------------ Distribuidor ------------");
	            	
	            		System.out.println(" 	Nombre: "+distribuidores.get(d).getNombre() );
	            		System.out.println(" \n 	CIF: "+distribuidores.get(d).getCif());
	            		//---
	            		System.out.println(" \n 	Direccion:" );
	            		System.out.println(" \n     	- Ciudad: "+ distribuidores.get(d).getDireccion().getCiudad());
	            		System.out.println(" \n     	- Calle: "+ distribuidores.get(d).getDireccion().getCalle());
	            		System.out.println(" \n     	- Portal: "+ distribuidores.get(d).getDireccion().getNumero());
	            		System.out.println(" \n     	- Codigo Postal: "+ distribuidores.get(d).getDireccion().getCP());
	            		//---
	            		System.out.println(" \n 	Contacto: " );
	            		System.out.println(" \n    		- Nombre: "+ distribuidores.get(d).getPersonaContacto().getNombre());
	            		System.out.println(" \n     	- Primer apellido: "+ distribuidores.get(d).getPersonaContacto().getApellido1());
	            		System.out.println(" \n     	- Segundo apellido: "+ distribuidores.get(d).getPersonaContacto().getApellido1());
	            		System.out.println(" \n    		- DNI: "+ distribuidores.get(d).getPersonaContacto().getDni());
	            		System.out.println(" \n     	- Mail: "+ distribuidores.get(d).getPersonaContacto().getMail());
	            		System.out.println(" \n     	- Telefono: "+ distribuidores.get(d).getPersonaContacto().getTelefono());
	            		}
	        	}
	        }
	        	//---------impresion de la leche con sus respectivos distribuidores-------------
	        System.out.println(" \n\n----------- LECHE --------------" );
			for (int m=0 ; m < leches.size(); m++){
				System.out.println(" \n\nTipo de leche: "+leches.get(m).getTipo() );
	            System.out.println(" \nProcedencia: "+leches.get(m).getProcedencia());
	            System.out.println(" \nEuros Litro: "+leches.get(m).getEurosLitro());
	           
		        for(int d=0; d<distribuidores.size(); d++)
	        	{
	        		if (distribuleche.get(m).equalsIgnoreCase(distribuidores.get(d).getNombre())){
	            	System.out.println("  ------------- Distribuidor -----------");
	            	
	            		System.out.println(" 	Nombre: "+distribuidores.get(d).getNombre() );
	            		System.out.println(" \n 	CIF: "+distribuidores.get(d).getCif());
	            		//---
	            		System.out.println(" \n 	Direccion:" );
	            		System.out.println(" \n     	- Ciudad: "+ distribuidores.get(d).getDireccion().getCiudad());
	            		System.out.println(" \n     	- Calle: "+ distribuidores.get(d).getDireccion().getCalle());
	            		System.out.println(" \n     	- Portal: "+ distribuidores.get(d).getDireccion().getNumero());
	            		System.out.println(" \n     	- Codigo Postal: "+ distribuidores.get(d).getDireccion().getCP());
	            		//---
	            		System.out.println(" \n 	Contacto: " );
	            		System.out.println(" \n    		- Nombre: "+ distribuidores.get(d).getPersonaContacto().getNombre());
	            		System.out.println(" \n     	- Primer apellido: "+ distribuidores.get(d).getPersonaContacto().getApellido1());
	            		System.out.println(" \n     	- Segundo apellido: "+ distribuidores.get(d).getPersonaContacto().getApellido2());
	            		System.out.println(" \n     	- DNI: "+ distribuidores.get(d).getPersonaContacto().getDni());
	            		System.out.println(" \n     	- Email: "+ distribuidores.get(d).getPersonaContacto().getMail());
	            		System.out.println(" \n     	- Telefono: "+ distribuidores.get(d).getPersonaContacto().getTelefono());
	            		}
	        	}	
		    }
			//---------impresion de las lechugas con sus respectivos distribuidores-------------
		    System.out.println(" \n\n----------- LECHUGA --------------" );
			for (int lechu=0 ; lechu < lechugas.size(); lechu++){
				System.out.println(" \n\nTipo de lechuga: "+lechugas.get(lechu).getTipo() );
	            System.out.println(" \nProcedencia: "+lechugas.get(lechu).getProcedencia());
	            System.out.println(" \nColor : "+lechugas.get(lechu).getColor() );
	            System.out.println(" \nEuros Unidad: "+lechugas.get(lechu).getEurosUniad());
	           
		        for(int d=0; d<distribuidores.size(); d++)
	        	{
	        		if (distribulechu.get(lechu).equalsIgnoreCase(distribuidores.get(d).getNombre())){
	            	System.out.println("  --------------Distribuidor-----------");
	            	
	            		System.out.println(" 	Nombre: "+distribuidores.get(d).getNombre() );
	            		System.out.println(" \n 	CIF: "+distribuidores.get(d).getCif());
	            		//---
	            		System.out.println(" \n 	Direccion:" );
	            		System.out.println(" \n    		- Ciudad: "+ distribuidores.get(d).getDireccion().getCiudad());
	            		System.out.println(" \n     	- Calle: "+ distribuidores.get(d).getDireccion().getCalle());
	            		System.out.println(" \n     	- Portal: "+ distribuidores.get(d).getDireccion().getNumero());
	            		System.out.println(" \n     	- Codigo Postal: "+ distribuidores.get(d).getDireccion().getCP());
	            		//---
	            		System.out.println(" \n 	Contacto: " );
	            		System.out.println(" \n     	- Nombre: "+ distribuidores.get(d).getPersonaContacto().getNombre());
	            		System.out.println(" \n     	- Primer apellido: "+ distribuidores.get(d).getPersonaContacto().getApellido1());
	            		System.out.println(" \n     	- Segundo apellido: "+ distribuidores.get(d).getPersonaContacto().getApellido1());
	            		System.out.println(" \n     	- DNI: "+ distribuidores.get(d).getPersonaContacto().getDni());
	            		System.out.println(" \n     	- Mail: "+ distribuidores.get(d).getPersonaContacto().getMail());
	            		System.out.println(" \n     	- Telefono: "+ distribuidores.get(d).getPersonaContacto().getTelefono());
	            		}
	        	}
	        }
	    }catch(Exception ioe){
	    	System.out.println("Error: "+ioe);
	    }

	    //-----------------clientes-------------------------------------------------------------------------------

	    //--lectura de fichero de clientes
	    ArrayList<Cliente> clientes = new ArrayList<Cliente>();

	    try{
			String ruta2 = "./clientes.txt";
 			File archivo3 = new File(ruta2);
			FileReader leer3 = new FileReader (archivo3);
			BufferedReader bf3 = new BufferedReader(leer3);
			String salida3 = bf3.readLine();

			

	       
	        while(salida3!=null){
	        	//separa el string de la  linea usara el ; como referencia de la separacion
	        	String [] cortarString4 = salida3.split("#");
	         	

	       		Cliente cliente = new Cliente();
	       		String [] cortarString5 = cortarString4[0].split(",");
	       		cliente.setNombre (cortarString5[0]);
	       		cliente.setApellidos (cortarString5[1]);
	       		cliente.setDNI (cortarString5[2]);
	       		cliente.setNum_socio (Double.parseDouble(cortarString5[3]));
	       		cliente.setDto (Double.parseDouble(cortarString5[4]));
	       		
	       		
	       		Direccion direccionc = new Direccion();
	       		String [] cortarString6 = cortarString4[1].split(",");
	       		direccionc.setCiudad  (cortarString6[0]);
	       		direccionc.setCalle  (cortarString6[1]);
	       		direccionc.setNumero  (Integer.parseInt(cortarString6[2]));
	       		direccionc.setCP  (Integer.parseInt(cortarString6[3]));
	       		cliente.setDireccion(direccionc);
	       		
	       		
	       		clientes.add(cliente);
	       		

	       		
	       		
	       		salida3 = bf3.readLine();
	        }
	    }catch(Exception ioe){
	    	System.out.println("Error: "+ioe);
	    }
	    
	    //---------------Impresion de la lista de clientes-----------------
	    System.out.println("  -------------- CLIENTES -----------");
	    for (int cli=0 ; cli < clientes.size(); cli++){

				System.out.println(" \n\n- Nombre: "+clientes.get(cli).getNombre() );
	            System.out.println(" \n- Apellidos: "+clientes.get(cli).getApellidos());
	            System.out.println(" \n- DNI : "+clientes.get(cli).getDNI() );
	            System.out.println(" \n- Numero de socio: "+clientes.get(cli).getNum_socio());
	            System.out.println(" \n- Descuento "+clientes.get(cli).getDto());
	    }
}
*/

import java.util.*;
import java.io.*;

public class Almacen {
	public static void main(String[] args) throws IOException {
		try {
			
			File archivo = new File("./distribuidores.txt");
			FileReader fr = new FileReader(archivo);
			BufferedReader br = new BufferedReader(fr);
			String linea = br.readLine();

			ArrayList<Distribuidor> distribuidores = new ArrayList<Distribuidor>();
			String [] parte = null;
			String [] parte1 = null;
			String [] parte2 = null;
			String [] parte3 = null;
			while ((linea != null) || (linea == "")) {
				parte = linea.split(";");
				Distribuidor distribuidor = new Distribuidor();
				parte1 = parte[0].split(",");
				distribuidor.setNombre(parte1[0]);
				distribuidor.setCif(parte1[1]);

				parte2 = parte[1].split(",");
				Direccion direccion = new Direccion();
				direccion.setPoblacion(parte2[0]);
				direccion.setLocalidad(parte2[1]);
				direccion.setCalle(parte2[2]);
				direccion.setNumero(Integer.parseInt(parte2[3]));
				distribuidor.setDireccion(direccion);

				parte3 = parte[2].split(",");
				Contacto contacto = new Contacto();
				contacto.setNombre(parte3[0]);
				contacto.setApellido(parte3[1]);
				contacto.setEmail(parte3[2]);
				contacto.setTelefono(Integer.parseInt(parte3[3]));
				distribuidor.setPersonaContacto(contacto);

				distribuidores.add(distribuidor);
				linea = br.readLine();
			}
			
			
			
			File archivo2 = new File("./clientes.txt");
			FileReader fr2 = new FileReader(archivo2);
			BufferedReader br2 = new BufferedReader(fr2);
			String linea2 = br2.readLine();

			ArrayList<Cliente> clientes = new ArrayList<Cliente>();
			String [] partec = null;
			String [] partec1 = null;
			String [] partec2 = null;
			while ((linea2 != null) || (linea2 == "")) {
				partec = linea2.split(";");
				Cliente cliente = new Cliente();
				partec1 = partec[0].split(",");
				cliente.setNombre(partec1[0]);
				cliente.setApellidos(partec1[1]);
				cliente.setDNI(partec1[2]);
				cliente.setNum_Socio(Integer.parseInt(partec1[3]));
				cliente.setDto(Double.parseDouble(partec1[4]));

				partec2 = partec[1].split(",");
				Direccion direccion = new Direccion();
				direccion.setPoblacion(partec2[0]);
				direccion.setLocalidad(partec2[1]);
				direccion.setCalle(partec2[2]);
				direccion.setNumero(Integer.parseInt(partec2[3]));
				cliente.setDireccion(direccion);

				clientes.add(cliente);
				linea2 = br2.readLine();
			}
			
			//ArrayList<Producto> aproducto = new ArrayList<Producto>();
			ArrayList<Manzana> amanzana = new ArrayList<Manzana>();
			String nombred;
			Manzana manzana = new Manzana();
			//tipo de manzana
			manzana.setTipoManzana("Golden");
			//procedencia
			manzana.setProcedencia("EEUU");
			//color
			manzana.setColor("Verde");
			//precio
			manzana.setEurosKilo(3.0);
			//codigo de barras
			manzana.setCod_Barras(1001);
			//distribuidor
			nombred = "odei";
			for (int i = 0; i < distribuidores.size(); i++) {
				if (nombred.equalsIgnoreCase(distribuidores.get(i).getNombre())) {
					manzana.setDistribuidor(distribuidores.get(i));
				}
			}
			amanzana.add(manzana);
			//System.out.println(manzana);

			Manzana manzana2 = new Manzana();
			//tipo de manzana
			manzana2.setTipoManzana("Red");
			//procedencia
			manzana2.setProcedencia("España");
			//color
			manzana2.setColor("Rojo");
			//precio
			manzana2.setEurosKilo(2.0);
			//codigo de barras
			manzana2.setCod_Barras(1002);
			//distribuidor
			nombred = "odei";
			for (int i = 0; i < distribuidores.size(); i++) {
				if (nombred.equalsIgnoreCase(distribuidores.get(i).getNombre())) {
					manzana2.setDistribuidor(distribuidores.get(i));
				}
			}
			amanzana.add(manzana2);
			//System.out.println(manzana);

			ArrayList<Lechuga> alechuga = new ArrayList<Lechuga>();
			Lechuga lechuga = new Lechuga();
			//Tipo de lechuga
			lechuga.setTipoLechuga("Normal");
			//procedencia
			lechuga.setProcedencia("francia");
			//color
			lechuga.setColor("verde");
			//precio
			lechuga.setEurosUnidad(1.0);
			//codigo de barras
			lechuga.setCod_Barras(2001);
			//distribuidor
			nombred = "telmo";
			for (int i = 0; i < distribuidores.size(); i++) {
				if (nombred.equalsIgnoreCase(distribuidores.get(i).getNombre())) {
					lechuga.setDistribuidor(distribuidores.get(i));
				}
			}
			alechuga.add(lechuga);


			ArrayList<Leche> aleche = new ArrayList<Leche>();
			Leche leche = new Leche();
			//Tipo de leche
			leche.setTipo("vaca");
			//Procedencia
			leche.setProcedencia("Asturias");
			//precio
			leche.setEurosLitro(1.0);
			//codigo de barras
			leche.setCod_Barras(3001);
			//distribuidor
			nombred = "jon";
			for (int i = 0; i < distribuidores.size(); i++) {
				if (nombred.equalsIgnoreCase(distribuidores.get(i).getNombre())) {
					leche.setDistribuidor(distribuidores.get(i));
				}
			}
			aleche.add(leche);

			Scanner sc = new Scanner(System.in);
			int socio;
			int cant_prod;
			int cod_barras;
			Double ptotal = 0.0;
			Double mtotal = 0.0;
			Double lutotal = 0.0;
			Double letotal = 0.0;
			Double desc;
			Cesta cesta = new Cesta();
			System.out.println("Introduce tu número de socio: ");
			socio = sc.nextInt();
			System.out.println("¿Cuantos productos quieres añadir?");
			cant_prod = sc.nextInt();
			for (int c = 0; c < cant_prod; c++) {
				System.out.println("Introduce el código de barras del producto: ");
				cod_barras = sc.nextInt();
				ArrayList<Cesta> acesta = new ArrayList<Cesta>();
				for (int m = 0; m < amanzana.size(); m++) {
					if(cod_barras == amanzana.get(m).getCod_Barras()){
						cesta.setAmanzana(amanzana);
						acesta.add(cesta);
						mtotal = mtotal + amanzana.get(m).getEurosKilo();
						//System.out.println(mtotal);
					}
					//System.out.println(ptotal);
				}
				for (int le = 0; le < alechuga.size(); le++) {
					if(cod_barras == alechuga.get(le).getCod_Barras()){
						cesta.setAlechuga(alechuga);
						acesta.add(cesta);
						lutotal = lutotal + alechuga.get(le).getEurosUnidad();
						//System.out.println(lutotal);
					}
					//System.out.println(ptotal);
				}
				for (int lee = 0; lee < aleche.size(); lee++) {
					if(cod_barras == aleche.get(lee).getCod_Barras()){
						cesta.setAleche(aleche);
						acesta.add(cesta);
						letotal = letotal + aleche.get(lee).getEurosLitro();
						//System.out.println(letotal);
					}
				}	
				ptotal = mtotal + lutotal + letotal;
				//System.out.println(ptotal);			
			}
			System.out.println("El precio total sin el descuento es: " + ptotal);

			for (int so = 0; so < clientes.size(); so++){
				if(socio == clientes.get(so).getNum_Socio()){
					desc = clientes.get(so).getDto();
					ptotal = ptotal - ((ptotal*desc)/100);
					System.out.println("Tu descuento es del " + desc + "%");
				}
			}
		
			System.out.println("El precio total con el descuento es: " + ptotal);


			//EZ BORRATU EZER!!!! Odeiena da, Cesta biok egin genuen eta bere aldagaik dozte.

			/*
			//13 Ariketararte
			File archivo2 = new File("./clientes.txt");
			FileReader fr2 = new FileReader(archivo2);
			BufferedReader br2 = new BufferedReader(fr2);
			String linea2 = br2.readLine();
			ArrayList<Cliente> clientes = new ArrayList<Cliente>();
			String [] partec = null;
			String [] partec1 = null;
			String [] partec2 = null;
			while ((linea2 != null) || (linea2 == "")) {
				partec = linea2.split(";");
				Cliente cliente = new Cliente();
				partec1 = partec[0].split(",");
				cliente.setNombre(partec1[0]);
				cliente.setApellidos(partec1[1]);
				cliente.setDNI(partec1[2]);
				cliente.setNum_Socio(Integer.parseInt(partec1[3]));
				cliente.setDto(Double.parseDouble(partec1[4]));
				partec2 = partec[1].split(",");
				Direccion direccion = new Direccion();
				direccion.setPoblacion(partec2[0]);
				direccion.setLocalidad(partec2[1]);
				direccion.setCalle(partec2[2]);
				direccion.setNumero(Integer.parseInt(partec2[3]));
				cliente.setDireccion(direccion);
				clientes.add(cliente);
				linea2 = br2.readLine();
			}
			Iterator<Cliente> itrCliente = clientes.iterator();
			while(itrCliente.hasNext()){
				Cliente clien = itrCliente.next();
				
				System.out.println("********Cliente********");
				System.out.println("--Datos--");
				System.out.println("Nombre: " + clien.getNombre());
				System.out.println("Apellidos: " + clien.getApellidos());
				System.out.println("DNI: " + clien.getDNI());
				System.out.println("Número de socio: " + clien.getNum_Socio());
				System.out.println("Descuento: " + clien.getDto());
				System.out.println("--Direccion--");
				System.out.println("Población: " + clien.getDireccion().getPoblacion());
				System.out.println("Localidad: " + clien.getDireccion().getLocalidad());
				System.out.println("Calle: " + clien.getDireccion().getCalle());
				System.out.println("Número: " + clien.getDireccion().getNumero());
				System.out.println();
				
			}*/




			/*
			//12 ariketararte
			File archivo = new File("./distribuidores.txt");
			FileReader fr = new FileReader(archivo);
			BufferedReader br = new BufferedReader(fr);
			String linea = br.readLine();
			ArrayList<Distribuidor> distribuidores = new ArrayList<Distribuidor>();
			String [] parte = null;
			String [] parte1 = null;
			String [] parte2 = null;
			String [] parte3 = null;
			while ((linea != null) || (linea == "")) {
				parte = linea.split(";");
				Distribuidor distribuidor = new Distribuidor();
				parte1 = parte[0].split(",");
				distribuidor.setNombre(parte1[0]);
				distribuidor.setCif(parte1[1]);
				parte2 = parte[1].split(",");
				Direccion direccion = new Direccion();
				direccion.setPoblacion(parte2[0]);
				direccion.setLocalidad(parte2[1]);
				direccion.setCalle(parte2[2]);
				direccion.setNumero(Integer.parseInt(parte2[3]));
				distribuidor.setDireccion(direccion);
				parte3 = parte[2].split(",");
				Contacto contacto = new Contacto();
				contacto.setNombre(parte3[0]);
				contacto.setApellido(parte3[1]);
				contacto.setEmail(parte3[2]);
				contacto.setTelefono(Integer.parseInt(parte3[3]));
				distribuidor.setPersonaContacto(contacto);
				distribuidores.add(distribuidor);
				linea = br.readLine();
			}
			*/

			/*
			//12 ariketa
			ArrayList<Manzana> amanzana = new ArrayList<Manzana>();
			Scanner scm = new Scanner(System.in);
			String nombred;
			for (int m = 0; m < 2; m++) {
				Manzana manzana = new Manzana();
				System.out.println("Tipo de manzana:");
				manzana.setTipoManzana(scm.next());
				System.out.println("Procedencia: ");
				manzana.setProcedencia(scm.next());
				System.out.println("Color: ");
				manzana.setColor(scm.next());
				System.out.println("Precio (€ por Kg): ");
				manzana.setEurosKilo(scm.nextDouble());
				System.out.println("Nombre del distribuidor: ");
				nombred = scm.next();
				for (int i = 0; i < distribuidores.size(); i++) {
					if (nombred.equalsIgnoreCase(distribuidores.get(i).getNombre())) {
						manzana.setDistribuidor(distribuidores.get(i));
					}
				}
				amanzana.add(manzana);
			}
			ArrayList<Lechuga> alechuga = new ArrayList<Lechuga>();
			Scanner sclu = new Scanner(System.in);
			for (int m = 0; m < 1; m++) {
				Lechuga lechuga = new Lechuga();
				System.out.println("Tipo de lechuga:");
				lechuga.setTipoLechuga(sclu.next());
				System.out.println("Procedencia: ");
				lechuga.setProcedencia(sclu.next());
				System.out.println("Color: ");
				lechuga.setColor(sclu.next());
				System.out.println("Precio (€ por unidad): ");
				lechuga.setEurosUnidad(sclu.nextDouble());
				System.out.println("Nombre del distribuidor: ");
				nombred = sclu.next();
				for (int i = 0; i < distribuidores.size(); i++) {
					if (nombred.equalsIgnoreCase(distribuidores.get(i).getNombre())) {
						lechuga.setDistribuidor(distribuidores.get(i));
					}
				}
				alechuga.add(lechuga);
			}
			ArrayList<Leche> aleche = new ArrayList<Leche>();
			Scanner scle = new Scanner(System.in);
			for (int m = 0; m < 2; m++) {
				Leche leche = new Leche();
				System.out.println("Tipo de leche:");
				leche.setTipo(scle.next());
				System.out.println("Procedencia: ");
				leche.setProcedencia(scle.next());
				System.out.println("Precio (€ por L): ");
				leche.setEurosLitro(scle.nextDouble());
				System.out.println("Nombre del distribuidor: ");
				nombred = scle.next();
				for (int i = 0; i < distribuidores.size(); i++) {
					if (nombred.equalsIgnoreCase(distribuidores.get(i).getNombre())) {
						leche.setDistribuidor(distribuidores.get(i));
					}
				}
				aleche.add(leche);
			}
			Iterator<Manzana> itrManzana = amanzana.iterator();
			while(itrManzana.hasNext()){
				Manzana manza = itrManzana.next();
				System.out.println("#@#@#@#@#@#@#@#@#@#@#@#@#@#@#@#@#@#@#@#@#@#@#@#@#");
				System.out.println("Tipo de manzana: " + manza.getTipoManzana());
				System.out.println("Procedencia: " + manza.getProcedencia());
				System.out.println("Color: " + manza.getColor());
				System.out.println("Precio (€ por Kg): " + manza.getEurosKilo());
				System.out.println("********Distribuidor********");
				System.out.println("--Datos--");
				System.out.println("Nombre: " + manza.getDistribuidor().getNombre());
				System.out.println("CIF: " + manza.getDistribuidor().getCif());
				System.out.println("--Direccion--");
				System.out.println("Población: " + manza.getDistribuidor().getDireccion().getPoblacion());
				System.out.println("Localidad: " + manza.getDistribuidor().getDireccion().getLocalidad());
				System.out.println("Calle: " + manza.getDistribuidor().getDireccion().getCalle());
				System.out.println("Número: " + manza.getDistribuidor().getDireccion().getNumero());
				System.out.println("--Contacto--");
				System.out.println("Nombre: " + manza.getDistribuidor().getPersonaContacto().getNombre());
				System.out.println("Apellido: " + manza.getDistribuidor().getPersonaContacto().getApellido());
				System.out.println("E-mail: " + manza.getDistribuidor().getPersonaContacto().getEmail());
				System.out.println("Teléfono: " + manza.getDistribuidor().getPersonaContacto().getTelefono());
				System.out.println();
				
			}
			Iterator<Lechuga> itrLechuga = alechuga.iterator();
			while(itrLechuga.hasNext()){
				Lechuga lechu = itrLechuga.next();
				System.out.println("#@#@#@#@#@#@#@#@#@#@#@#@#@#@#@#@#@#@#@#@#@#@#@#@#");
				System.out.println("Tipo de lechuga: " + lechu.getTipoLechuga());
				System.out.println("Procedencia: " + lechu.getProcedencia());
				System.out.println("Color: " + lechu.getColor());
				System.out.println("Precio (€ por unidad): " + lechu.getEurosUnidad());
				System.out.println("********Distribuidor********");
				System.out.println("--Datos--");
				System.out.println("Nombre: " + lechu.getDistribuidor().getNombre());
				System.out.println("CIF: " + lechu.getDistribuidor().getCif());
				System.out.println("--Direccion--");
				System.out.println("Población: " + lechu.getDistribuidor().getDireccion().getPoblacion());
				System.out.println("Localidad: " + lechu.getDistribuidor().getDireccion().getLocalidad());
				System.out.println("Calle: " + lechu.getDistribuidor().getDireccion().getCalle());
				System.out.println("Número: " + lechu.getDistribuidor().getDireccion().getNumero());
				System.out.println("--Contacto--");
				System.out.println("Nombre: " + lechu.getDistribuidor().getPersonaContacto().getNombre());
				System.out.println("Apellido: " + lechu.getDistribuidor().getPersonaContacto().getApellido());
				System.out.println("E-mail: " + lechu.getDistribuidor().getPersonaContacto().getEmail());
				System.out.println("Teléfono: " + lechu.getDistribuidor().getPersonaContacto().getTelefono());
				System.out.println();
				
			}
			Iterator<Leche> itrLeche = aleche.iterator();
			while(itrLeche.hasNext()){
				Leche leche = itrLeche.next();
				System.out.println("#@#@#@#@#@#@#@#@#@#@#@#@#@#@#@#@#@#@#@#@#@#@#@#@#");
				System.out.println("Tipo de leche: " + leche.getTipo());
				System.out.println("Procedencia: " + leche.getProcedencia());
				System.out.println("Precio (€ por L): " + leche.getEurosLitro());
				System.out.println("********Distribuidor********");
				System.out.println("--Datos--");
				System.out.println("Nombre: " + leche.getDistribuidor().getNombre());
				System.out.println("CIF: " + leche.getDistribuidor().getCif());
				System.out.println("--Direccion--");
				System.out.println("Población: " + leche.getDistribuidor().getDireccion().getPoblacion());
				System.out.println("Localidad: " + leche.getDistribuidor().getDireccion().getLocalidad());
				System.out.println("Calle: " + leche.getDistribuidor().getDireccion().getCalle());
				System.out.println("Número: " + leche.getDistribuidor().getDireccion().getNumero());
				System.out.println("--Contacto--");
				System.out.println("Nombre: " + leche.getDistribuidor().getPersonaContacto().getNombre());
				System.out.println("Apellido: " + leche.getDistribuidor().getPersonaContacto().getApellido());
				System.out.println("E-mail: " + leche.getDistribuidor().getPersonaContacto().getEmail());
				System.out.println("Teléfono: " + leche.getDistribuidor().getPersonaContacto().getTelefono());
				System.out.println();
				
			}*/


			/*
			//11 arriketa
			Iterator<Distribuidor> itrDistribuidor = distribuidores.iterator();
			while(itrDistribuidor.hasNext()){
				Distribuidor distri = itrDistribuidor.next();
				
				System.out.println("********Distribuidor********");
				System.out.println("--Datos--");
				System.out.println("Nombre: " + distri.getNombre());
				System.out.println("CIF: " + distri.getCif());
				System.out.println("--Direccion--");
				System.out.println("Población: " + distri.getDireccion().getPoblacion());
				System.out.println("Localidad: " + distri.getDireccion().getLocalidad());
				System.out.println("Calle: " + distri.getDireccion().getCalle());
				System.out.println("Número: " + distri.getDireccion().getNumero());
				System.out.println("--Contacto--");
				System.out.println("Nombre: " + distri.getPersonaContacto().getNombre());
				System.out.println("Apellido: " + distri.getPersonaContacto().getApellido());
				System.out.println("E-mail: " + distri.getPersonaContacto().getEmail());
				System.out.println("Teléfono: " + distri.getPersonaContacto().getTelefono());
				System.out.println();
				
			}
			//Honek ez du balio
			//for (int i = 0; i < distribuidores.size(); i++) {
				//System.out.println(distribuidores.get(i).getNombre());
				//System.out.println(distribuidores.get(i).getCif());
				//System.out.println(distribuidores.get(i).getDireccion().getPoblacion());
            	//System.out.println(distribuidores.get(i).getDireccion().getLocalidad());
            	//System.out.println(distribuidores.get(i).getDireccion().getCalle());
            	//System.out.println(distribuidores.get(i).getDireccion().getNumero());
  
            	//System.out.println(distribuidores.get(i).getPersonaContacto().getNombre());
            	//System.out.println(distribuidores.get(i).getPersonaContacto().getApellido());
            	//System.out.println(distribuidores.get(i).getPersonaContacto().getEmail());
            	//System.out.println(distribuidores.get(i).getPersonaContacto().getTelefono());
				
			//}
			*/


			 } catch (IOException ioe) {
			System.out.println("Error: " + ioe);
		}
	}
}
