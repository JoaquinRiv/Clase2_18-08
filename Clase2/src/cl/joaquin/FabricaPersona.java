package cl.joaquin;

/**
 *
 * @author CETECOM
 */
public class FabricaPersona {

    public static void main(String[] args) {
        Persona persona1 = new Persona("Pablo", "Gonzalez", "12345675-6", 24);
        persona1.setNombre("Juan");
        System.out.println(persona1.toString());
        persona1.respirar();
        
        Persona persona2 = new Persona();
        persona2.respirar();
  
    
    }
