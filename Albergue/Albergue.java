public enum Albergue{
  SIMPLE(1,50,4), DOBLE(2,80,4), TRIPLE(3,100,4), MULTIPLE(6,150,4);
  private int personas;
  private double precio;
  private int disponibles;


  Albergue(int personas, double precio, int disponibles){
    this.personas = personas;
    this.precio = precio;
    this.disponibles = disponibles;
  }
  public int getPersonas(){
    return this.personas;
  }
  // setPersona y setPrecio no son necesarios porque no los vamos a modificar.
  /*public void setPersonas(int personas){
    this.personas = personas;
  }*/
  public double getPrecio(){
    return this.precio;
  }
  /*public void setPrecio(double precio){
    this.precio = precio;
  }*/
  public int getDisponibles(){
    return this.disponibles;
  }
  public void setDisponibles(int disponibles){
    this.disponibles = disponibles;
  }

  public boolean numPersonasValido(int numPersonas){
    return numPersonas <= this.personas;
  }
  public double precioTotal(double numNoches){
    return this.precio*numNoches;
  }
  public double precioPorPersona(int numPersonas, double precioTotal){
    return precioTotal/numPersonas;
  }
  public double precioPorPersona(int numPersonas, int numNoches){
    double precioTotal = this.precioTotal(numNoches);
    return precioTotal/numPersonas;
  }
}
