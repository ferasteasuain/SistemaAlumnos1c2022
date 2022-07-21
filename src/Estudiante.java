
public class Estudiante extends Persona implements ViajesIntercambio {
	String nombre;
	String apellido;
	int legajo;
	
	public Estudiante(String nombre, String apellido, int legajo, int edad) {
		super(edad);
		this.nombre = nombre;
		this.apellido = apellido;
		this.legajo = legajo;
	}

	public String getNombre() {
		return nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public int getLegajo() {
		return legajo;
	}

	@Override
	public void Viajes() {
		// TODO Auto-generated method stub
		System.out.println("EStudiante Viajando");
	}

	@Override
	public int darEdad() {
		// TODO Auto-generated method stub
		return this.edad;
	}
	
	

}
