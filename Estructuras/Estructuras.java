import java.util.ArrayList;
import java.util.LinkedList;
import java.util.HashMap;

class Estructuras{
  public static void pruebaArrayList(){
    System.out.println("-----------ArrayList de colores---------------");
    ArrayList<String> colores = new ArrayList<String>();
    System.out.println("Imprimimos colores antes de aniadir datos");
    System.out.println(colores);
    colores.add("azul");
    colores.add("amarillo");
    colores.add("rojo");
    System.out.println("Volvemos a imprimir colores despues de aniadirle datos");
    System.out.println(colores);
    System.out.println("Imprimimos el valor de la posicion 2");
    System.out.println(colores.get(2));
    System.out.println("Cambiamos el color rojo por magenta");
    colores.set(2,"magenta");
    System.out.println(colores);
    System.out.println("Aniadimos el color negro al principio");
    colores.add(0,"negro");
    System.out.println(colores);
    System.out.println("El arraylist colores tiene tamanio " + colores.size());
    System.out.println("Eliminamos el color negro");
    colores.remove(0);
    System.out.println(colores);
    System.out.println("El arraylist colores despues de borrar el puto negro tiene tamanio " + colores.size());
    System.out.println("Recorrer el arraylist elemento a elemento");
    for (String c : colores){
      System.out.println(c);
    }
  }
  public static void pruebaLinkedList(){
    //LinkedList misma sintaxis y estructura que los ArrayList
    System.out.println("-----------LinkedList de colores---------------");
    LinkedList<String> colores = new LinkedList<String>();
    System.out.println("Imprimimos colores antes de aniadir datos");
    System.out.println(colores);
    colores.add("azul");
    colores.add("amarillo");
    colores.add("rojo");
    System.out.println("Volvemos a imprimir colores despues de aniadirle datos");
    System.out.println(colores);
    System.out.println("Imprimimos el valor de la posicion 2");
    System.out.println(colores.get(2));
    System.out.println("Cambiamos el color rojo por magenta");
    colores.set(2,"magenta");
    System.out.println(colores);
    System.out.println("Aniadimos el color negro al principio");
    colores.addFirst("negro");
    System.out.println(colores);
    System.out.println("Aniadimos el color blanco al final");
    colores.addLast("blanco");
    System.out.println(colores);
    System.out.println("El LinkedList colores tiene tamanio " + colores.size());
    System.out.println("Eliminamos el color negro");
    colores.remove(0);
    System.out.println(colores);
    System.out.println("El LinkedList colores despues de borrar el puto negro tiene tamanio " + colores.size());
    System.out.println("Recorrer el LinkedList elemento a elemento");
    for (String c : colores){
      System.out.println(c);
    }

  }
  public static void pruebaHashMap(){
    HashMap<String,Integer> edades = new HashMap<String,Integer>();
    System.out.println("-----------Diccionarios--------------");
    edades.put("Celia",26);
    edades.put("Vicky",20);
    edades.put("Juanmi",30);
    edades.put("Emilio",22);
    System.out.println("Imprimimos el map");
    System.out.println(edades);
    System.out.println("¿Cuantos anios tiene Vicky?");
    System.out.println(edades.get("Vicky"));
    System.out.println("Eliminamos a Vicky");
    edades.remove("Vicky");
    System.out.println(edades);
    System.out.println("Imprimimos todos los valores resultado");
    System.out.println(edades.values());
    System.out.println("Imprimimos todas las claves");
    System.out.println(edades.keySet());
  }
  public static void main(String[] args) {
    //pruebaArrayList();
    //pruebaLinkedList();
    pruebaHashMap();
  }
}
