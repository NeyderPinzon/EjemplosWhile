package ejercicio4;

import java.util.Scanner;

/**
 *
 * @author Nicolas
 */
public class Ejercicio4 {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    
    int num1;
    int total;
    
    System.out.println("Que numero desea multipicar: ");
    num1 = entrada.nextInt();
    
   for (int i=0; i<=12; i++){
     total= i*num1;
     System.out.println("el resultado es: "+total);  
   }
  }
  
}
