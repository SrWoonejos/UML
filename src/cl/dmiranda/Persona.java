//M2 UML Ejercicio Compra pasaje en diagramas de clase PERSONA
//se estructuran las clases en lase al diagrama de clase y de cliente
package cl.dmiranda;

public class Persona {
//atributos propios de la clase
private int id;  //rut
private String nombre;    // privado y se usa gett y sett
private String apellido;
private String rut;
private int fechNac; 
private String pasaporte; 
 
//constructores
public Persona (String pasaporte)  {
		this.pasaporte=pasaporte;
}
//getters y setters
public int getId() {    //al estar en otra clase y se necesita entrar al ID y devuelve el valor
	return id;
}

public void setId(int id) {  //void no devuelve nada y lleva el parametro y lo asocie al atributo ID
	if (id>0) {
	    this.id = id;
      } else {
    	   System.out.println("¡Error! Debe ser mayor a 0");
      }
}

public String getNombre() {        //
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

public String getRut() {
	return rut;
}

public void setRut(String rut) {
	this.rut = rut;
}

public int getFechNac() {
	return fechNac;
}

public void setFechNac(int fechNac) {
	this.fechNac = fechNac;
}

public String getPasaporte() {
	return pasaporte;
}

public void setPasaporte(String pasaporte) {
	this.pasaporte = pasaporte;
}
public static void Registrarse () {
	
}
public static void Login () {  //static el metodo existe dentro de esta clase
  }
public String saludo() {
	String misaludo="Saludos";
	return misaludo;
  }

}
