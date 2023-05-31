//Clase Cliente que hereda a la clase Persona e incluye una variable única credito
// Se utilizan los métodos set get para asignar y obtener los valores de la variable privada credito

public class Cliente extends Persona{

    private String credito;

    public void setCredito(String credito){
        this.credito = credito;
    }
    
    public String getCredito(){
        return this.credito;
    }
}
