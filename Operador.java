/**
 *Clase 
 * @author Dulce Mora
 * @version 1.0
**/
public class Operador extends Empleado{

    /**
     * Metodo constructor que recibe un String
     * @param nombre Parametro que es el nombre
     **/
    public Operador(String nombre){
	super(nombre);
    }

    /**
     * Metodo constructor que da como nombre predeterminado Dulce Mora
     **/
    public Operador(){
	super();
    }

    public String toString(){
	return "Operador: " + nombre;
    }

}
