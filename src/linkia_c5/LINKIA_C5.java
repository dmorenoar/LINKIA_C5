/*
 * Main para el control de excepciones
 */
package linkia_c5;


/**
 *
 * @author dmorenoar
 */
public class LINKIA_C5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        try {
            Persona p = new Persona("Alba", 25);
            
            p.setEdad(500);
            
            System.out.println(p);
            
        } catch (PersonaException ex) {
            System.out.println(ex.errPersona());
        }

    }  
}
