import java.util.Scanner;

public class Main{
  public static void main(String[] args) {
    Scanner sc = new Scanner (System.in);

    String nombreHab;
    int numPersonas;
    double numNoches;
    double precioFinal;
    //Habitaciones numPersonasMax = Habitaciones.valueOf();
    // Habitaciones.misHabitaciones =

    System.out.println("Carlos Sánchez Piña");
    //Habitaciones.miHabitacion = Habitaciones.valueOf();
    System.out.print("¿Qué tipo de habitación quieres? ");
    nombreHab = sc.nextLine();
    System.out.print("Indica para cuantas personas es la habitación: ");
    numPersonas = Integer.parseInt(sc.nextLine());
    /*
    if (numPersonas > numPersonasMax){
      System.out.println("Selecciona otra hab. esta no tiene camas suficientes ");
    }
    */
    System.out.print("Indica cuantas noches vas/váis a estar: ");
    numNoches = Integer.parseInt(sc.nextLine());
    
  }
}
