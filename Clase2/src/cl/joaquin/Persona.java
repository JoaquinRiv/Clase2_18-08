
package cl.joaquin;

/**
 *
 * @author CETECOM
 */
public class Persona {
    //1 crear atributos
    private String nombre, apellido, rut;
    private int edad;
    
    //2 crear constructor con y sin parametros

    public Persona() {
        System.out.println("hola, soy el constructor sin parametros");
    }

    public Persona(String nombre, String apellido, String rut, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.rut = rut;
        this.edad = edad;
        System.out.println("hola, soy el constructor con parametros");
    }
    
    //3 crear accesadores y mutadores (getter y setters)

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    //4 creamos metodo toString

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", apellido=" + apellido + ", rut=" + rut + ", edad=" + edad + '}';
    }
    
    //5 crear metodo customer
    public void respirar() {
        System.out.println("estoy respirando...");
        
    }
    
    public void comer() {
        System.out.println("estoy comiendo");
    }
    
}
