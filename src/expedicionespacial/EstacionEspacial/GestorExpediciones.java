package expedicionespacial.EstacionEspacial;

import java.util.ArrayList;
import java.util.List;

public class GestorExpediciones {
    
    private List<Nave> naves;

    public GestorExpediciones() {
        this.naves = new ArrayList<>();
    }
   
    
    public void agregarNave(Nave nuevaNave) throws NaveYaExisteException{
        for (Nave naveExistente : this.naves ){
            if (naveExistente.nombre.equalsIgnoreCase(nuevaNave.getNombre()) &&
                naveExistente.getAnioDeLanzamiento() == nuevaNave.getAnioDeLanzamiento())    {
                throw new NaveYaExisteException(nuevaNave.getNombre()); 
            }
        }
        this.naves.add(nuevaNave);
        System.out.println("La nave " + nuevaNave + " se agrego con exito");
    }

    public void mostrarNaves(){
        if (naves.isEmpty()){
            System.out.println("No hay ninguna nave registrada.");
        }
        else
        System.out.println("\n========== NAVES REGISTRADAS ==========");
            for (Nave n : this.naves) {
            System.out.println(n);
        }
    }
    
    public void iniciarExploracion() {
    System.out.println("\n========== INICIANDO EXPLORACIÓN ==========");
    
    boolean hayExplorables = false;
    
    for (Nave n : this.naves) {
        if (n instanceof Explorable naveExploradora) {
            naveExploradora.explorar();
            hayExplorables = true;
        } else if (n instanceof CruceroEstelar) {
            System.out.println("El crucero estelar " + n.getNombre() + 
                             " NO puede participar de misiones de exploración.");
        }
    }
    if (!hayExplorables){
        System.out.println("No hay naves disponibles para exploración.");
    }
}
    public List<Nave> getNaves() {
        return naves;
    }
            
    
    
}
