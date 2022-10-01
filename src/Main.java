public class Main {
    public static void main(String[] args) {

        Person person = new Person();
        person.setNombre("Laura");
        person.setEdad(35);
        person.setTelefono("+56944612393");

        System.out.println(person.getNombre(""));
        System.out.println(person.getEdad(35));
        System.out.println(person.getTelefono(""));
    }
}
//Crear clase Persona.
//Crear variables las privadas edad, nombre y telefono de la clase Persona.
class Person {
    private int edad;
    private String nombre;
    private String telefono;

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getNombre(String nombre){
        return this.nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    public int getEdad(int edad){
        return this.edad;
    }
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    public String getTelefono(String telefono){
        return this.telefono;
    }
}

//Crear gets y sets de cada propiedad.
// Crear un objeto persona en el main.
//Utiliza los gets y sets para darle valores a las propiedades edad, nombre y telefono, por último muéstralas por consola.