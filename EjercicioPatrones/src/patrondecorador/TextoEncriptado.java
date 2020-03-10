package patrondecorador;

public class TextoEncriptado extends DecoradorTexto {

  public TextoEncriptado(DispositivoDeSalida dispositivoSalida) {
    super(dispositivoSalida);
  }

  @Override
  public void registrarTexto(String texto) {
    texto = encriptar(texto);
    dispositivoSalida.registrarTexto(texto);
  }
  
  public String encriptar(String texto) {
    texto = texto.substring(texto.length() - 1) + texto.substring(0, texto.length() - 1);
    return texto;
  }
}

