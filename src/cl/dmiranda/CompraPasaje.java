//M2.3 UML-Ejercicio compra pasaje en diagramas de clase COMPRAPASAJE
package cl.dmiranda;

import java.util.ArrayList;

public class CompraPasaje {

	public static void main(String[] args) {
		ArrayList<Cliente> clientes = new ArrayList<Cliente>(); //varios clientes

        Cliente pedro = new Cliente("abc@c.com", "nombre123@c.cl"); //mail cliente
        Cliente juan = new Cliente("abc@c.com", "nombre123@c.cl"); //mail cliente
        Cliente roberto = new Cliente("abc@c.com", "nombre123@c.cl"); //mail cliente
        Cliente alealejandro = new Cliente("abc@c.com", "nombre123@c.cl"); //mail cliente

        pedro.setNombre("Pedro");   //set es definir (desde 0 o muchos)
        juan.setNombre("juan");
        roberto.setNombre("Roberto");
        alealejandro.setNombre("alealejandro");
       
        clientes.add(pedro);
        clientes.add(juan);
        clientes.add(roberto);
        clientes.add(alealejandro);
        
       for (int i=0; i<clientes.size(); i++) {  //size: entrega el largo del arreglo
        	System.out.println(clientes.get(i).getNombre());  //get es para obtener datos
        }
	}    
}
