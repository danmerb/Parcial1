package parcial1;

import java.util.Scanner;

/**
 *
 * @author Jeniffer Merino
 */
public class Parcial1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //       ListaServicios listaSer= new ListaServicios();
        //       listaSer.AgregarServicio();
        //       listaSer.AgregarServicio();
        //       listaSer.mostrar();
        //       listaSer.eliminar();
        //       listaSer.mostrar();
        //       listaSer.eliminar();
        //       listaSer.mostrar();
        //         ListaPaquete listaPack= new ListaPaquete();
        //         listaPack.mostrarPaquetes();
        //         listaPack.agregarPaquete();
        //         listaPack.mostrarPaquetes();
        //         listaPack.eliminarPaquete();
        //         listaPack.mostrarPaquetes();

        /**
         *
         */
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese el mes a comparar");
        int mes = entrada.nextInt();
        float PrecioTemporada;

        switch (mes) {
            case 1:
                System.out.println("Enero pertenece a la temporada Alta");
                PrecioTemporada = 50;
                break;
            case 2:
                System.out.println("Febrero pertenece a la temporada Alta");
                PrecioTemporada = 50;
                break;
            case 3:
                System.out.println("Marzo pertenece a la temporada Baja");
                PrecioTemporada = -10;
                break;
            case 4:
                System.out.println("Abril pertenece a la temporada Baja");
                PrecioTemporada = -10;
                break;
            case 5:
                System.out.println("Mayo pertenece a la temporada Alta");
                PrecioTemporada = 50;
                break;
            case 6:
                System.out.println("Junio pertenece a la temporada Baja");
                PrecioTemporada = -10;
                break;
            case 7:
                System.out.println("Julio pertenece a la temporada Baja");
                PrecioTemporada = -10;
                break;
            case 8:
                System.out.println("Agosto pertenece a la temporada Alta");
                PrecioTemporada = 50;
                break;
            case 9:
                System.out.println("Septiembre pertenece a la temporada Baja");
                PrecioTemporada = -10;
                break;
            case 10:
                System.out.println("Octubre pertenece a la temporada Baja");
                PrecioTemporada = -10;
                break;
            case 11:
                System.out.println("Noviembre pertenece a la temporada Alta");
                PrecioTemporada = 50;
                break;
            case 12:
                System.out.println("Diciembre pertenece a la temporada Alta");
                PrecioTemporada = 50;
                break;
            default:
                System.out.println("El mes ingresado no es valido");

        }
        
        ;
        
        

    }
}
