
public class MateriaOptativa extends Materia {
 int creditos;
	public MateriaOptativa(String nombre, String profesor, int creditos) {
		super(nombre, profesor);
		this.creditos=creditos;
		// TODO Auto-generated constructor stub
	}
	public int getCreditos() {
		return creditos;
	}
	public void setCreditos(int creditos) {
		this.creditos = creditos;
	}

	public String getNombre() {
		return "Soy una optativa " + nombre;
	}
	
}
