package sevici;

public class Coordenadas {
	private Double latitud;
	private Double longitud;
	private UnidadMedida unidad;
	

	//Constructor 1: Un constructor sin parámetros 
	//que crea un objeto con latitud 0º y longitud 0º.
	public Coordenadas() {
		 Coordenadas objeto= new Coordenadas();
		 latitud= 0.0 ;
		 longitud= 0.0;
		 unidad= UnidadMedida.GRADOS;
		 
	}

	
//Constructor 2:toma como parámetros la latitud y la longitud. 
	//La coordenada creada por defecto se medirá en grados.
	
	
	public Coordenadas(Double latitud, Double longitud) {
		Coordenadas coordenada= new Coordenadas();
		this.latitud=latitud;
		this.longitud= longitud;
		unidad= UnidadMedida.GRADOS;
		
	}
	//Constructor 3:recibe un parámetro por cada propiedad básica 
	//del tipo, en el mismo orden en el que están definidas.
	
	
	public Coordenadas( Double latitud, Double longitud, UnidadMedida unidad) {
		this.latitud= latitud;
		this.longitud= longitud;
		this.unidad= unidad;
		
	}
	
	
	//Constructor 4: Un constructor a partir de String, que 
	//crea una coordenada en grados, Ejemplo; "-1.5,0.22"
	public Coordenadas(String cadena) {
		Coordenadas coordenada= new Coordenadas();
		String[] numeros  =cadena.split(",");
		coordenada.latitud= Double.parseDouble(numeros[0]);
		coordenada.longitud= Double.parseDouble(numeros[1]);
				}
	
	@Override
	public String toString() {
		return "Objeto= [latitud=" + latitud + unidad+", longitud=" + longitud +unidad+"]";
	}
	

}
