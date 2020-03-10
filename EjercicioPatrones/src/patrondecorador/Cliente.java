package patrondecorador;

import java.util.Scanner;

/**
 * @author Cristian
 */
public class Cliente {
    private Scanner lectura;
    private int opcionTipoSalida, opcionSalidaTexto;
    private String texto;
    private FabricaDispositivoDeSalida fabrica;
    private DispositivoDeSalida dispositivo;
    private DecoradorTexto decorador;
    
    public Cliente(){
        lectura = new Scanner(System.in);
        System.out.println("Bienvenido al seleccionador de dispositivos de salida");
        System.out.println("Seleccione por favor el dispositivo de salida: ");
        System.out.println("1 - Salida por consola ");
        System.out.println("2 - Salida desde archivo ");
        opcionTipoSalida= lectura.nextInt();
        System.out.println("Seleccione por favor la salida de texto: ");
        System.out.println("1 - Formato HTML ");
        System.out.println("2 - Texto encriptado ");
        opcionSalidaTexto = lectura.nextInt();
        System.out.println("Escriba el texto: ");
        texto = lectura.next();
        fabrica = new FabricaDispositivoDeSalida(opcionTipoSalida);
        dispositivo = fabrica.getDispositivoSalida();
        if(opcionSalidaTexto==1)
            decorador = new TextoHTML(dispositivo);
        if(opcionSalidaTexto==2)
            decorador = new TextoEncriptado(dispositivo);
        decorador.registrarTexto(texto);
    }
}
