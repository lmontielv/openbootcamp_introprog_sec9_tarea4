/* TAREA DE SECCIÓN 9 HERENCIA, POLIMORFISMO E INTERFACE 
Crear un objeto Cliente en el main, asignarle valores a sus propiedades:
edad, nombre, teléfono y a su propiedad única de cliente credito


*/

public class Main {

    public static void main(String[] args) {

        //Creación del objeto cliente
        Cliente cliente = new Cliente();

        //Asignación de valores a las variables de la clase Cliente
        cliente.nombre = "Pedro Sanchez";
        cliente.edad = 25;
        cliente.telefono = "+584126610555";
        cliente.setCredito("Credito Hipotecario");

        //Se muestran los valores de las variables de la clase Cliente
        System.out.println();
        System.out.println(" Se muestran los valores de las variables de la clase Cliente ");
        System.out.print("El nombre del cliente es : ");
        System.out.println(cliente.nombre);
        System.out.print("Su edad es : ");
        System.out.println(cliente.edad + " años ");
        System.out.print("Su número de teléfono es : ");
        System.out.println(cliente.telefono);
        System.out.print("Su tipo de crédito es : ");
        System.out.println(cliente.getCredito());
        System.out.println();

        //Creación del objeto Trabajador
        Trabajador trabajador = new Trabajador();

        //Asignación de valores a las variables de la clase Trabajador
        trabajador.nombre = "Alfredo Martínez";
        trabajador.edad = 35;
        trabajador.telefono = "+584245948695";
        trabajador.setSalario(3500.00);

        //Se muestran los valores de las variables de la clase Trabajador
        System.out.println(" Se muestran los valores de las variables de la clase Trabajador ");
        System.out.print("El nombre del Trabajador es : ");
        System.out.println(trabajador.nombre);
        System.out.print("Su edad es : ");
        System.out.println(trabajador.edad + " años ");
        System.out.print("Su número de teléfono es : ");
        System.out.println(trabajador.telefono);
        System.out.print("Su salario es : ");
        System.out.println(trabajador.getSalario());
        System.out.println();

    }
    
}
