/*
 * Clase Persona
 */
package linkia_c5;

import java.util.HashMap;

/**
 *
 * @author dmorenoar
 */
public class Persona {
 
    private String nombre;
    private int edad;

    public Persona() {}
    
    public Persona(Persona p){
        this.nombre = p.getNombre();
        this.edad = p.getEdad();
    }
    
    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }
    
    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) throws PersonaException{
        if(edad >0 && edad <120){
            this.edad = edad;
        }else{
            throw new PersonaException(111);
        }
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", edad=" + edad + '}';
    }


}
