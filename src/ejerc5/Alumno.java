package ejerc5;

public class Alumno extends Persona{
	
//atributos
	private int nota;
	
	public Alumno() {
		super();
		
		nota=MetodosSueltos.generaNumeroAleatorio(0,10);
		//llamo a la clase padre
		super.setEdad(MetodosSueltos.generaNumeroAleatorio(12,15));
	}

	public int getNota() {
		return nota;
	}

	public void setNota(int nota) {
		this.nota = nota;
	}
	
	@Override
	public void disponibilidad() {
		
		int prob=MetodosSueltos.generaNumeroAleatorio(0, 100);
		if(prob<20) {
			super.setAsistencia(false);
		}else {
			super.setAsistencia(true);
		}
	}
	
	public String toString() {
		return "Nombre : "+super.getNombre()+" ,sexo: "+super.getSexo()+" ,nota: "+nota ;
	}

}
