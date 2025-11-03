package expedicionespacial.EstacionEspacial;

import java.util.Scanner;

public enum TipoMision {
    CARTOGRAFIA,
    CONTACTO, 
    INVESTIGACION;
    
    
    public static TipoMision seleccionarTipoMision(Scanner sc) {
    TipoMision mision = null;
    boolean salir = false;

    do {
        System.out.println("Seleccione tipo de misión:");
        System.out.println("1) CARTOGRAFIA");
        System.out.println("2) CONTACTO");
        System.out.println("3) INVESTIGACION");
        System.out.print("Ingrese el número de la misión: ");

        int opcion = sc.nextInt();
        sc.nextLine(); // limpiar buffer

        switch (opcion) {
            case 1 -> { mision = TipoMision.CARTOGRAFIA; salir = true; }
            case 2 -> { mision = TipoMision.CONTACTO; salir = true; }
            case 3 -> { mision = TipoMision.INVESTIGACION; salir = true; }
            default -> System.out.println("Opción inválida. Intente nuevamente.");
        }
    } while (!salir);

    return mision;
}
}


