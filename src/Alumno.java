
public class Alumno {
private String matricula;
private String nombre;
private String apellido;
private int edad;

public Alumno(String matricula, String nombre, String apellido, int edad) {
	super();
	this.matricula = matricula; 
	this.nombre = nombre;
	this.apellido = apellido;
	this.edad = edad;
}

public String getMatricula() {
	return matricula;
}

public void setMatricula(String matricula) {
	this.matricula = matricula;
}

public String getNombre() {
	return nombre;
}

public void setNombre(String nombre) {
	this.nombre = nombre;
}

public String getApellido() {
	return apellido;
}

public void setApellido(String apellido) {
	this.apellido = apellido;
}

public int getEdad() {
	return edad;
}

public void setEdad(int edad) {
	this.edad = edad;
}

}
