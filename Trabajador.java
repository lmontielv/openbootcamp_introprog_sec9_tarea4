//Clase Cliente que hereda a la clase Persona e incluye una variable única (privada) salario
// Se utilizan los métodos set get para asignar y obtener los valores de la variable privada salario

public class Trabajador extends Persona {
    
    private double salario;

    public void setSalario(double salario){
        this.salario = salario;
    }
    
    public double getSalario(){
        return this.salario;
    }

}
