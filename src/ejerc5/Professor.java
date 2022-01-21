package ejerc5;

public class Professor extends Persona {
//atributos
	private String materia;
	public Professor() {
		super();
		
		super.setEdad(MetodosSueltos.generaNumeroAleatorio(30,50));
	//constantes
		
		materia=constantes.materias[MetodosSueltos.generaNumeroAleatorio(0,2)];
	}
	public String getMateria() {
		return materia;
	}
	public void setMateria(String materia) {
		this.materia = materia;
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
}
