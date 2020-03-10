package patrondecorador;

import java.io.DataOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class SalidaArchivo implements DispositivoDeSalida {

  private static SalidaArchivo salidaArchivo;
  private DataOutputStream dos;
  
  private SalidaArchivo() {
  }

  public static SalidaArchivo getSalidaArchivo() {
    if (salidaArchivo == null) {
      salidaArchivo = new SalidaArchivo();
    }
    return salidaArchivo;
  }

  @Override
  public synchronized void registrarTexto(String texto) {
      escribirEnArchivo("texto.txt",texto, true, true);
      System.out.println("Texto escrito en Archivo");
  }
  
  public boolean escribirEnArchivo(String nombreArchivo, String texto,
        boolean seAñadeLinea, boolean esNuevaLinea) {
    if (esNuevaLinea) {
        texto = "\n" + texto;
    }

    try {
        File outFile = new File(nombreArchivo);
        if (seAñadeLinea) {
            dos = new DataOutputStream(new FileOutputStream(nombreArchivo, true));
        } 
        else {
            dos = new DataOutputStream(new FileOutputStream(outFile));
        }   
        dos.writeBytes(texto);
        dos.close();
    } 
    catch (FileNotFoundException ex) {
        return (false);
    }
    catch (IOException ex) {
        return (false);
    }
    return (true);
  }
}
