package ejerc5;

public abstract class Persona {
//atributos
	private String nombre;
	private char sexo;
	private int edad;
	private boolean asistencia;
	
	//atributos que hacen de constantes
	private final String[] nombres_chicos={"Gabriel","Marcos","Edgar","Jose","Nacho"};
	private final String[] nombres_chicas={"Ana","Alicia","Emma","Valeria","Laura"};
	
//constructor	
	public Persona () {
		
		int determinar_sexo=MetodosSueltos.generaNumeroAleatorio(0,1);
		
		//si es 0 es un chico sino una chica
		if(determinar_sexo==0) {
			nombre=nombres_chicos[MetodosSueltos.generaNumeroAleatorio(0,4)];
			sexo='H';
		}else {
			nombre=nombres_chicas[MetodosSueltos.generaNumeroAleatorio(0,4)];
			sexo='M';
		}
		disponibilidad();
	}
//obtengo los valores y los devulvo
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public char getSexo() {
		return sexo;
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}
	public boolean isAsistencia() {
		return asistencia;
	}
	public void setAsistencia(boolean asistencia) {
		this.asistencia = asistencia;
	}
	public String[] getNombres_chicos() {
		return nombres_chicos;
	}
	public String[] getNombres_chicas() {
		return nombres_chicas;
	}
	public abstract void disponibilidad();
		// TODO Auto-generated method stub
		
	

	
	}

	
	

