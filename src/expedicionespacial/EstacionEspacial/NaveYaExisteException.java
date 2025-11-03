package expedicionespacial.EstacionEspacial;


public class NaveYaExisteException extends Exception {

    public NaveYaExisteException(String nombreNave) {
        super("La nave " + nombreNave + " que quieres agregar ya existe.");
    }

}



