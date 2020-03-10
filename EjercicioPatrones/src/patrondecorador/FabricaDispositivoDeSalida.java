package patrondecorador;

public class FabricaDispositivoDeSalida {

    int opcionSalida;
    
    public FabricaDispositivoDeSalida(int opcionSalida){
        this.opcionSalida= opcionSalida;
    }
    

  public DispositivoDeSalida getDispositivoSalida() {
    if (opcionSalida==1) {
        return new SalidaConsola();
    } 
    else {
      return SalidaArchivo.getSalidaArchivo();
    }
  }
}
