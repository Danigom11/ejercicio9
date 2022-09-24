public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        cliente.edad = 40;
        cliente.nombre = "Daniel";
        cliente.telefono = 666123456;
        cliente.credito = 1000;
        System.out.println("Edad: " + cliente.edad);
        System.out.println("Nombre: " + cliente.nombre);
        System.out.println("Teléfono: " + cliente.telefono);
        System.out.println("Crédito: " + cliente.credito);

        Trabajador trabajador = new Trabajador();
        trabajador.edad = 30;
        trabajador.nombre = "Ana";
        trabajador.telefono = 661123456;
        trabajador.salario = 1500;
        System.out.println("Edad: " + trabajador.edad);
        System.out.println("Nombre: " + trabajador.nombre);
        System.out.println("Teléfono: " + trabajador.telefono);
        System.out.println("Salario: " + trabajador.salario);
    }
}

class Persona {
    int edad;
    String nombre;
    int telefono;
}

class Cliente extends Persona {
    int credito;
}

class Trabajador extends Persona {
    int salario;
}