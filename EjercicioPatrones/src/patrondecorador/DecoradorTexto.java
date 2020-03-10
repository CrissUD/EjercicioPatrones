package patrondecorador;

public class DecoradorTexto implements DispositivoDeSalida {

  DispositivoDeSalida dispositivoSalida;

  public DecoradorTexto(DispositivoDeSalida dispositivoSalida) {
    this.dispositivoSalida = dispositivoSalida;
  }

  @Override
  public void registrarTexto(String texto) {
    dispositivoSalida.registrarTexto(texto);
  }
}

