package patrondecorador;

public class SalidaConsola implements DispositivoDeSalida {

  @Override
  public void registrarTexto(String texto) {
    System.out.println(texto);
  }
}
