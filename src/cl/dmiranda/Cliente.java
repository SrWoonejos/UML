//M2.3 UML Ejercicio Compra pasaje en diagramas de clase PERSONA
//se estructuran las clases al diagrama de clase y cliente
package cl.dmiranda;

//atributos propios de la clase
public class Cliente extends Persona{  //clase cliente hereda de la clase persona
private int clienteId;
private String clientePass;
private String clienteEmail;
private String clienteDir;

//constructor para interactura con otras clases, se pueden sobrecargar pero no tanto
public Cliente (String clienteEmail, String pasaporte)  {
	super(pasaporte); //apunta a algun atributo de la clase principal 
	this.clienteEmail=clienteEmail;  //unica forma de llegar a esta info
	
}

public int getClienteId() {
	return clienteId;
}

public void setClienteId(int clienteId) {
	this.clienteId = clienteId;
}

public String getClientePass() {
	return clientePass;
}

public void setClientePass(String clientePass) {
	this.clientePass = clientePass;
}

public String getClienteEmail() {
	return clienteEmail;
}

public void setClienteEmail(String clienteEmail) {
	this.clienteEmail = clienteEmail;
}

public String getClienteDir() {
	return clienteDir;
}

public void setClienteDir(String clienteDir) {
	this.clienteDir = clienteDir;
}

//agregar el met propio de la clase cliente al final
public static void comprar ()  {
	
  }
public String mostrarSaludo() {
	return super.saludo();  //cliente hereda saludo desde clase persona
  }

}
