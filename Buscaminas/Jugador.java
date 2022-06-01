public class Jugador{
  private int turno;
  private int puntuacion;


  public Jugador(){
    this.turno = turno;
    this.puntuacion = puntuacion;
  }
  public int getTurno(){
    return this.turno;
  }
  public void setTurno(int turno){
    this.turno = turno;
  }

  public int getPuntuacion(){
    return this.puntuacion;
  }
  public void setPuntuacion(int puntuacion){
    this.puntuacion = puntuacion;
  }
  public int tirarDado(){
    return dado;
  }
}
