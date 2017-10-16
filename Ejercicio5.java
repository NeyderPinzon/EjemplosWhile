package ejercicio5;

import java.util.Scanner;

/**
 *
 * @author Nicolas
 */
public class Ejercicio5 {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    //String nombre= "nicolas";
    //System.out.println(nombre.length());
    Scanner entrada = new Scanner(System.in);
    
    
    String dato;
    
    System.out.println("Ingrese un numero: ");
    dato = entrada.next();
    
    System.out.println("el numero interducido tiene: "+ dato.length() + " digitos "); 
    
    
    
  }
  
}
