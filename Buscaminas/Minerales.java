public enum Minerales{
  DIAMANTE(5), ORO(3), PLATA(2), NADA(0), CACA(-3);
  private int valor;

  Minerales(int valor){
    this.valor = valor;
  }
  public int getValor(){
    return this.valor;
  }
  public void setValor(int valor){
    this.valor = valor;
  }
}
