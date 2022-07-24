public class Main {
    public static void main(String[] args) {
        //cliente
        Cliente cliente = new Cliente();
        cliente.edad=22;
        cliente.telefono=65982612;
        cliente.nombre="Jorge";
        cliente.credito= 256.56;

        System.out.println("El cliente "+cliente.nombre);
        System.out.println("tiene "+cliente.edad+" años");
        System.out.println("su número de teléfono es "+cliente.telefono);
        System.out.println("y su crédito es "+cliente.credito);
        System.out.println("");// Esto lo estoy usando para generar un salto de linea.

        //trabajador
        Trabajador trabajador = new Trabajador();
        trabajador.edad=21;
        trabajador.telefono=56894526;
        trabajador.nombre="Luis";
        trabajador.salario= 2150.53;

        System.out.println("El trabajador "+trabajador.nombre);
        System.out.println("tiene "+trabajador.edad+" años");
        System.out.println("su número de teléfono es "+trabajador.telefono);
        System.out.println("y su salario es "+trabajador.salario);
    }
}

class Persona{
    int edad;
    String nombre;
    int telefono;
}

class Cliente extends Persona{
    double credito;
}

class Trabajador extends Persona {
    double salario;
}


