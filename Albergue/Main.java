import java.util.Scanner;

public class Main{
  public static void main(String[] args) {
    Scanner sc = new Scanner (System.in);

    String tipoHabitacion;
    Albergue habitacion = Albergue.SIMPLE;
    int numPersonas = 0, numNoches;
    double precioTotal, precioPorPersona; // No hace falta declararlos
    boolean numPersonasValido = false;

    System.out.println("Carlos Sánchez Piña");

    while(!numPersonasValido){
      System.out.print("¿Qué tipo de habitación quieres? ");
      tipoHabitacion = sc.nextLine();
      habitacion = Albergue.valueOf(tipoHabitacion);
      System.out.print("Indica para cuantas personas es la habitación: ");
      numPersonas = Integer.parseInt(sc.nextLine()); //Se puede hacer con nextInt
      // numPersonas = sc.nextInt();
      //sc.nextLine(); //Limpiamos el buffer
      System.out.println("COMPROBAR QUE EL NUM DE PERSONAS ES VALIDO");
      numPersonasValido = habitacion.numPersonasValido(numPersonas);
    }
    System.out.print("Indica el numero de noches:");
    numNoches = sc.nextInt();
    //System.out.println(" -- Cuanto vale la habitacion -- ");
    precioTotal = habitacion.precioTotal(numNoches);
    System.out.println("El precio total es de: " + precioTotal + " euros.");
    precioPorPersona = habitacion.precioPorPersona(numPersonas, precioTotal);
    System.out.println("El precio por persona es de: " + precioPorPersona + " euros.");
  }
}
