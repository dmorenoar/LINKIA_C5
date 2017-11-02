/*
 * 
 */
package linkia_c5;

/**
 *
 * @author 
 */
public class PersonaException extends Exception{

    private int errCode;
    
    public PersonaException(String message) {
        super(message);
    }

    public PersonaException(int errCode) {
        super();
        this.errCode = errCode;
    }
    
    public String errPersona(){
        
        String error = "";
        
        switch(errCode){
            case 111:
                error = "Error con el limite de edad";
            break;
            case 222:
                error = "Error con el nombre te falta un asterisco en la contrasenya";
            break;
        }
        
        return error;
        
    }
    
    
    
}
