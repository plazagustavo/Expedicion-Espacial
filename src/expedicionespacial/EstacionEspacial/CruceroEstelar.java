package expedicionespacial.EstacionEspacial;


public class CruceroEstelar extends Nave{
    private int cantidadPasajeros;
    
    
    public CruceroEstelar() {

    }

    public CruceroEstelar(int cantidadPasajeros, String nombre, int capTripulacion, int anioDeLanzamiento) {
        super(nombre, capTripulacion, anioDeLanzamiento);
        this.cantidadPasajeros = cantidadPasajeros;
    }

    public int getCantidadPasajeros() {
        return cantidadPasajeros;
    }

    public void setCantidadPasajeros(int cantidadPasajeros) {
        this.cantidadPasajeros = cantidadPasajeros;
    }
    
    
    
    @Override
    public String toString() {
        return "CruceroEstelar{" +
                "nombre " + this.nombre +
                ", capacidad de tripulacion " + this.capTripulacion +
                ", año de lanzamiento " + this.anioDeLanzamiento +
                ", cantidad de pasajeros " + this.cantidadPasajeros + '}';
    }

} 