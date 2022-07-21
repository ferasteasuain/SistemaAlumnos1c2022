import java.util.ArrayList;
import java.util.List;
import java.util.HashSet;
import java.util.Set;

public class TestEstudiante {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	 Estudiante e1= new Estudiante("Natalia", "Perez",1234,29);
	 List<Estudiante> alumnado = new ArrayList<Estudiante>();
	 alumnado.add(e1);
	 HashSet<String> deportes = new HashSet<String>();
	 SecretariaAlumnos SAundav = new SecretariaAlumnos(alumnado,deportes);
	 
	 Estudiante e2 = new Estudiante("Charles","Leclerc",16,24);
	 SAundav.darDeAltaAlumno(e2);
	 
	// Persona p = new Persona(24);
	 
	 System.out.println(SAundav.EsAlumno(1234));
	 System.out.println(SAundav.EsAlumno(16));
	 System.out.println(SAundav.EsAlumno(168));
	 
	 SAundav.agregarDeporte("Futbol");
	 SAundav.agregarDeporte("Ajedrez");
	 SAundav.ListarDeportes();
	 SAundav.agregarDeporte("Ajedrez");
	 SAundav.ListarDeportes();
	 int cuantos = SecretariaAlumnos.cuantosDeportesHay();
	 System.out.println(cuantos);
	 
	 MateriaOptativa ia = new MateriaOptativa("Inteligencia Artificial","DSR",5);
	 
	 System.out.println(ia.getClass());
	 System.out.println(ia.getNombre());
	 System.out.println(ia.getCreditos());
	 System.out.println(ia.getProfesor());
	 
	 e1.Viajes();
	 ia.Viajes();
	 SAundav.ejemploInterface(e1);
	 SAundav.ejemploInterface(ia);
	}

}
