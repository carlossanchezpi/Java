import java.util.HashMap;
public class Combustible{
  private HashMap<String,Double> impuestos;

  private String nombre;
  private Double precioBase;
  private Double impuesto;
  private Double litrosDisponibleS;

  private Double precioFinal;

  public Combustible(String nombre, Double precioBase, Double litros){
    impuestos = rellenarImpuestos();
    this.nombre = nombre;
    this.precioBase = precioBase;
    this.impuesto = impuestos.get(this.nombre);
    this.litrosDisponibleS = litros;
  }

  public String toString(){
    return this.nombre + " Precio base: " + this.precioBase + " Impuesto:" + this.impuesto;
  }
  private HashMap<String,Double> rellenarImpuestos(){
    HashMap<String,Double> impuestos = new HashMap<String,Double>();
    impuestos.put("SP95",0.472);
    impuestos.put("SP98",0.505);
    impuestos.put("GA",0.379);
    return impuestos;
  }
}
