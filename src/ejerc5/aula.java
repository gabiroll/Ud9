package ejerc5;

public class aula {

//Atributos
	private int id;
	private Professor profesor;
	private Alumno [] alumnos;
	private String materia;
	
	private final int Max_Alumnos=20;
	
	public aula() {
		id=1;
		
		profesor=new Professor();
		
		alumnos= new Alumno[Max_Alumnos];
		creaAlumnos();
		materia=constantes.materias[MetodosSueltos.generaNumeroAleatorio(0,2)];
	}
	
	private void creaAlumnos() {
		
		for(int i=0;i<alumnos.length;i++) {
			alumnos[i]=new Alumno();
		}
	}
	private boolean asistenciaAlumnos() {
		
		int cuentaAsistencia=0;
		for(int i=0;i<alumnos.length;i++) {
			if(alumnos[i].isAsistencia()) {
				cuentaAsistencia++;
			}
		}
		System.out.println("Hay " +cuentaAsistencia+" alumnos");
		
		return cuentaAsistencia>=((int)(Max_Alumnos/2));
		
			
		}
	
	
	public boolean darClase() {
		if(!profesor.isAsistencia()) {
			System.out.println("EL profesor no esta y no se puede dar clase");
			return false;
		}else if(!profesor.getMateria().equals(materia)){
			System.out.println("La materia y el aula no es la misma, no se puede dar clase");
			return false;
		}else if(!asistenciaAlumnos()) {
			System.out.println("La sistencia no es suficiente, no se puede dar clase");
			return false;
	}
		System.out.println("Se puede dar clase");
		return true;
	}
	
	public void notas() {
		int chicosApro=0;
		int chicasApro=0;
	
		for(int i=0;i<alumnos.length;i++) {
			
			if(alumnos[i].getNota()>=5) {
			if(alumnos[i].getSexo()=='H') {
				chicosApro++;
			}else {
				chicasApro++;
					}
			System.out.println(alumnos[i].toString());
				}
			}
		System.out.println("Hay "+chicosApro+" chicos y "+chicasApro+"chicas aprobados/as");
		}
}