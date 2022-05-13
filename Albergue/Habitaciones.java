enum Habitaciones{
  SIMPLES(1,50), DOBLES(2,80), TRIPLES(3,100), MULTIPLES(6,150);
  private int espacio;
  private double precio;


  Habitaciones(int espacio, double precio){
    this.espacio = espacio;
    this.precio = precio;
  }
  public int getEspacio(){
    return this.espacio;
  }
  public void setEspacio(int espacio){
    this.espacio = espacio;
  }
  public double getPrecio(){
    return this.precio;
  }
  public void setPrecio(double precio){
    this.precio = precio;
  }
  /*
  private void comprobarCamas(int personas){
    boolean personas = false;

    this.camas = CAMAS;
    for (int i = 0 ; i < camases.length && !personas ; i++){
      if (camas[i].equals(camas)){
        personas = true;
        this.camas = camas;
      }
    }
  }
  */
  public double precioTotal(double noches){
    return this.precio*noches;
  }
}
