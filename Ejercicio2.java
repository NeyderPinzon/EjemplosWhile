package ejercicio2;

import java.util.Scanner;

/**
 *
 * @author Nicolas
 */
public class Ejercicio2 {

  /**
   * @param args the command line arguments
   * multiplos de 5 utilizando while
   */
  public static void main(String[] args) {
    
    Scanner entrada = new Scanner(System.in);
    
    int contador = 0;
    
    while(contador<100){
      contador++;
      System.out.println("los multiplos de 5 son:  "+contador*5); 
    }
  }
  
}
