package expedicionespacial.EstacionEspacial;

public abstract class Nave {
    
    protected String nombre;
    protected int capTripulacion;
    protected int anioDeLanzamiento;

    public Nave() {
    }

    
    
    
    public Nave(String nombre, int capTripulacion, int anioDeLanzamiento) {
        this.nombre = nombre;
        this.capTripulacion = capTripulacion;
        this.anioDeLanzamiento = anioDeLanzamiento;
    }



    public String getNombre() {
        return nombre;
    }

    public int getCapTripulacion() {
        return capTripulacion;
    }

    public int getAnioDeLanzamiento() {
        return anioDeLanzamiento;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCapTripulacion(int capTripulacion) {
        this.capTripulacion = capTripulacion;
    }

    public void setAnioDeLanzamiento(int anioDeLanzamiento) {
        this.anioDeLanzamiento = anioDeLanzamiento;
    }
    
    
    
    
    
    
}
