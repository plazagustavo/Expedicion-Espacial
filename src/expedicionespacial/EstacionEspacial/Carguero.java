package expedicionespacial.EstacionEspacial;

public class Carguero extends Nave implements Explorable {
    
    private int capacidadCarga;

    public Carguero() {

    }
    


    public Carguero(int capacidadCarga, String nombre, int capTripulacion, int anioDeLanzamiento) {
        super(nombre, capTripulacion, anioDeLanzamiento);
        this.capacidadCarga = capacidadCarga;
    }

    public float getCapacidadCarga() {
        return capacidadCarga;
    }

    public void setCapacidadCarga(int capacidadCarga) {
        this.capacidadCarga = capacidadCarga;
    }
    

    @Override
    public void explorar() {
        System.out.println("Carguero " + this.nombre +
                " listo para transportar " + this.capacidadCarga + "t");
    }

    @Override
    public String toString() {
        return "Carguero{" +
                "nombre " + this.nombre +
                ", capacidad de tripulacion " + this.capTripulacion +
                ", año de lanzamiento " + this.anioDeLanzamiento +
                ", capacidad de carga " + capacidadCarga + '}';
    }
    
    
    
}
