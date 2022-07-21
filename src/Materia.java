
public class Materia implements ViajesIntercambio {
	String nombre;
	String profesor;
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getProfesor() {
		return profesor;
	}
	public void setProfesor(String profesor) {
		this.profesor = profesor;
	}
	public Materia(String nombre, String profesor) {
		super();
		this.nombre = nombre;
		this.profesor = profesor;
	}
	@Override
	public void Viajes() {
		// TODO Auto-generated method stub
		System.out.println("Materia forma parte programa Intercambio");
	}
	

}
