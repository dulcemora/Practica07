/**
 *Clase Operador que hereda de Empleado
 * @author Dulce Mora
 * @version 1.0
**/
public class Operador extends Empleado{

    /**
     * Metodo constructor que manda llamar al constructor de Empleado
     **/
    public Operador(String nombre){
	super(nombre);
    }

    /**
     * Metodo constructor que manda llamar al constructor de Empleado
     **/
    public Operador(){
	super();
    }

    /**
     *Metodo toString
     * @return nombre
     **/
    public String toString(){
	return "Operador: " + nombre;
    }

}
