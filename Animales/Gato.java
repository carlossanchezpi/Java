// Gato hereda de animal
/*public class Gato extends Animal{
  //Constructores

  //Metodos
  public String onomatopeya(){
    return "Miau";
  }
  public String durmiendo(){
    return "Zzz...fhghfghrftyhft";
  }
  public String comiendo(){
    this.alimentacion = "Peces";
    return "Yo como " + this.alimentacion;
  }
}
*/
// Gato implemente la interfaz de Animalesinterfaz
  public class Gato implements Animalesinterfaz{
    //Constructores

    //Metodos
    public String onomatopeya(){
      return "Miau";
    }
    public String durmiendo(){
      return "Zzz...fhghfghrftyhft";
    }
    public String comiendo(){
      String alimentacion = "Peces";
      return "Yo como " + alimentacion;
    }
  }
