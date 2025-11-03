package expedicionespacial.EstacionEspacial;

public class NaveExploracion extends Nave implements Explorable{
    
    private TipoMision tipoMision;
    
    
    public NaveExploracion() {

    }
    
    public NaveExploracion(TipoMision tipoMision, String nombre, int capTripulacion, int anioDeLanzamiento) {
        super(nombre, capTripulacion, anioDeLanzamiento);
        this.tipoMision = tipoMision;
    }

    public TipoMision getTipoMision() {
        return tipoMision;
    }

    public void setTipoMision(TipoMision tipoMision) {
        this.tipoMision = tipoMision;
    }

    
    
    @Override
    public void explorar() {
        
        System.out.println("Nave de exploración " + this.nombre + 
                " iniciando mision de " + this.tipoMision);
    }

    @Override
    public String toString() {
        return "NaveExploracion{" + 
                "nombre " + this.nombre +
                ", capacidad de tripulacion " + this.capTripulacion +
                ", año de lanzamiento " + this.anioDeLanzamiento +
                ", tipo de mision " + this.tipoMision + '}';
    }
        
}
