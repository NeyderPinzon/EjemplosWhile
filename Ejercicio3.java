package ejercicio3;

import java.util.Scanner;

/**
 *
 * @author Nicolas
 */
public class Ejercicio3 {

  /**
   * @param args the command line arguments
   * 
   */
  public static void main(String[] args) {
  
    Scanner entrada = new Scanner(System.in);
    int userPassword, correctPassword = 1234, contador = 0;
    
    do {
      System.out.println("Ingrese el Password: ");
      userPassword = entrada.nextInt();
      //Evaluar
      if (userPassword == correctPassword) {
        System.out.println("Password Correcta");
      } else {
        contador++;
        System.out.println("Password Incorrecta!");
        System.out.printf("Intentos restantes: %d\n",
          (4 - contador));
      }
    } while ((contador < 4) & (userPassword != correctPassword)); 
  }
    
}