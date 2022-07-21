import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SecretariaAlumnos {
	
	List<Estudiante> Alumnado = new ArrayList<Estudiante>();
	static Set<String> Deportes = new HashSet<String>();
	
	public SecretariaAlumnos(List<Estudiante> alumnado, HashSet<String> deportes) {
		super();
		Alumnado = alumnado;
		Deportes = deportes;
	}

	
	public void agregarDeporte(String deporte){
		Deportes.add(deporte);
		
	}
	
	public void ejemploInterface(ViajesIntercambio vi){
		vi.Viajes();
	}
	
	public void ListarDeportes(){
		System.out.println(Deportes);
	}

 public static int cuantosDeportesHay(){
     System.out.println(Math.cosh(55.3));
	 return Deportes.size(); 
 
 }
	
	public void darDeAltaAlumno(Estudiante e){
		Alumnado.add(e);
	}
	
	public boolean EsAlumno(int legajo){
		Estudiante e;
		//Estudiante e = Alumnado.get(0);
		/*if (e.getLegajo()==legajo){
			return true;
					}
		else return false;
		*/
		
		int i=0;
		boolean encontre = false;
		while (i<Alumnado.size() & !encontre) {
			e=Alumnado.get(i);
			if (e.getLegajo()==legajo){
				encontre=true;
			}
			else {i++;}
		}
		return encontre;
	}

}
