public class Main {
    public static void main(String[] args) {
        //Crea ahora un objeto de la clase Cliente que debe tener como propiedades la edad, el telefono, el nombre y el credito, tienes que darles valor y mostrarlas por pantalla.
        Cliente cliente = new Cliente();
        cliente.setNombre("Laura");
        cliente.setEdad(35);
        cliente.setTelefono("+56944612393");
        cliente.setCredito(3000000);


        System.out.println(cliente.getNombre(""));
        System.out.println(cliente.getEdad(35));
        System.out.println(cliente.getTelefono(""));
        System.out.println(cliente.getCredito(3000000));

        Trabajador trabajador = new Trabajador();
        trabajador.setNombre("Laura");
        trabajador.setEdad(35);
        trabajador.setTelefono("+56944612393");
        trabajador.setSalario(6000000);


        System.out.println(trabajador.getNombre(""));
        System.out.println(trabajador.getEdad(35));
        System.out.println(trabajador.getTelefono(""));
        System.out.println(trabajador.getSalario(6000000));
    }
}
//Crea una clase Persona con las siguientes variables:
//
//La edad
//
//El nombre
//
//El teléfono
class Persona {
    int edad;
    String nombre;
    String telefono;

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
//Una vez creada la clase, crea una nueva clase Cliente que herede de Persona, esta nueva clase tendrá la variable credito solo para esa clase.
class Cliente extends Persona {
    private int credito;

    public void setCredito(int credito) {
        this.credito = credito;
    }
    public int getCredito(int credito){
        return this.credito;
    }
}

//Una vez hecho esto, haz lo mismo con la clase Trabajador que herede de Persona, y con una variable
// salario que solo tenga la clase Trabajador.
class Trabajador extends  Persona{
    private int salario;

    public void setSalario(int salario) {
        this.salario = salario;
    }
    public int getSalario(int salario){
        return this.salario;
    }
}