package expedicionespacial;


import expedicionespacial.EstacionEspacial.Carguero;
import expedicionespacial.EstacionEspacial.CruceroEstelar;
import expedicionespacial.EstacionEspacial.Explorable;
import expedicionespacial.EstacionEspacial.GestorExpediciones;
import expedicionespacial.EstacionEspacial.Nave;
import expedicionespacial.EstacionEspacial.NaveExploracion;
import expedicionespacial.EstacionEspacial.NaveYaExisteException;
import expedicionespacial.EstacionEspacial.TipoMision;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        GestorExpediciones gestor = new GestorExpediciones();
        Scanner sc = new Scanner(System.in);

        int opcion;

        do {
            
            System.out.println("\n ========== BASE DE CONTROL ESPACIAL ==========");
            System.out.println("1. Agregar nave de exploración");
            System.out.println("2. Agregar carguero");
            System.out.println("3. Agregar crucero estelar");
            System.out.println("4. Iniciar exploración de todas las naves disponibles");
            System.out.println("5. Mostrar naves registradas");
            System.out.println("6. Enviar a una nave de exploracion");
            System.out.println("0)Salir");
            System.out.print("Ingrese el numero de su opcion: ");

            opcion = sc.nextInt();
            sc.nextLine(); // limpiar buffer
            
            
                    
            switch (opcion){
                case 1 -> {
                    NaveExploracion nave = new NaveExploracion();
                    
                    System.out.println("Nombre de la nave");
                    nave.setNombre(sc.nextLine());
                    System.out.println("Capacidad de la tripulacion");
                    nave.setCapTripulacion(sc.nextInt());
                    System.out.println("Año de lanzamiento");
                    nave.setAnioDeLanzamiento(sc.nextInt());

                    nave.setTipoMision(TipoMision.seleccionarTipoMision(sc)); 
                    
                    try {
                        gestor.agregarNave(nave);
                    } catch (NaveYaExisteException e) {
                        System.out.println(e.getMessage());
                    }
                    
                }
                case 2 ->{
                    Carguero carguero = new Carguero();
                    
                    System.out.println("Nombre de la nave");
                    carguero.setNombre(sc.nextLine());
                    System.out.println("Capacidad de la tripulacion");
                    carguero.setCapTripulacion(sc.nextInt());
                    System.out.println("Año de lanzamiento");
                    carguero.setAnioDeLanzamiento(sc.nextInt());
                    System.out.println("Ingrese capacidad de carga: ");
                    carguero.setCapacidadCarga(sc.nextInt());
                    
                    try {
                        gestor.agregarNave(carguero);
                    } catch (NaveYaExisteException e) {
                        System.out.println(e.getMessage());
                    }
                      
                }
                case 3 ->{
                    CruceroEstelar ce = new CruceroEstelar();

                    System.out.println("Nombre de la nave");
                    ce.setNombre(sc.nextLine());
                    System.out.println("Capacidad de la tripulacion");
                    ce.setCapTripulacion(sc.nextInt());
                    System.out.println("Año de lanzamiento");
                    ce.setAnioDeLanzamiento(sc.nextInt());
                    System.out.println("Ingrese capacidad de carga: ");
                    ce.setCantidadPasajeros(sc.nextInt());

                    try {
                        gestor.agregarNave(ce);
                    } catch (NaveYaExisteException e) {
                        System.out.println(e.getMessage());
                    }
                }
                case 4 ->{
                    gestor.iniciarExploracion();
                }
                case 5 ->{
                    gestor.mostrarNaves();
                }
                case 6 -> {
                    System.out.println("Ingrese nombre de la nave para enviarla a explorar ..");
                    String nombreNave = sc.nextLine();
                    boolean encontrada = false;

                    for (Nave n : gestor.getNaves()) {
                        if (n.getNombre().equalsIgnoreCase(nombreNave)) {
                            encontrada = true;
                        }
                        if (n instanceof Explorable e) {
                            e.explorar();

                        } else {
                            System.out.println(" La nave " + nombreNave
                                    + "NO puede ser enviada a explorar");
                        }
                        break;
                    }
                    if (!encontrada) {
                        System.out.println("No se encontro ninguna nave con ese nombre");
                    }

                }
                case 0 -> System.out.println("Saliendo...");
            }
            
        } while (opcion != 0);
        sc.close();
    }
}

