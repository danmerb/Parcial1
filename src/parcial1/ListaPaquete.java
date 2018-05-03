package parcial1;

import java.util.Scanner;
import java.util.ArrayList;

/**
 *
 * @author Jeniffer Merino
 */
public class ListaPaquete {
    Scanner entrada= new Scanner(System.in);
    ArrayList<Paquete> listaPaquetes = new ArrayList<>();

    public ListaPaquete() {
        ListaServicios serviciosBasicos = new ListaServicios("Basico");
        Paquete paqueteBasico = new Paquete("Basico", serviciosBasicos, 10);
        ListaServicios serviciosPremium = new ListaServicios("Premium");
        Paquete paquetePremium = new Paquete("Premium", serviciosPremium, 150);
        listaPaquetes.add(paqueteBasico);
        listaPaquetes.add(paquetePremium);
    }
    
    
    public void mostrarPaquetes(){
        for(Paquete pack: listaPaquetes)
            System.out.println(pack.toString());
    }
    
    public void agregarPaquete (){
        System.out.println("Escriba el nombre del nuevo Paquete");
        String nombrePaquete=entrada.nextLine();
        System.out.println("Ingrese el precio del nuevo paquete");
        int precioPaquete=entrada.nextInt();
        ListaServicios listaServiciosNuevos= new ListaServicios("custom");
        Paquete paqueteNuevos= new Paquete(nombrePaquete,listaServiciosNuevos,precioPaquete);
        listaPaquetes.add(paqueteNuevos);
        
    }
    
    public void eliminarPaquete() {
        Scanner entrada3= new Scanner(System.in);
        System.out.println("que paquete desea eliminar");
        Paquete paquete = new Paquete (entrada3.nextLine());
        int pos = 0;

        for (Paquete pack : listaPaquetes) {
            if (pack.equals(paquete)) {
                listaPaquetes.remove(pos);
                System.out.println("Paquete  eliminado");
                return;
            }
            pos = pos + 1;

        }
        System.out.println("Paquete no encontrado");
    }

}
