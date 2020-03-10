package patrondecorador;

public class TextoHTML extends DecoradorTexto {

  public TextoHTML(DispositivoDeSalida dispositivoSalida) {
    super(dispositivoSalida);
  }

  @Override
  public void registrarTexto(String texto) {
    texto = crearEstiloHTML(texto);
    dispositivoSalida.registrarTexto(texto);
  }
  public String crearEstiloHTML(String texto) {
    texto = "<HTML><BODY>" + "<p>" + texto + 
	  "</p>" + "</BODY></HTML>";
    return texto;
  }
}

