/**
 *Clase Directivo que hereda de Empleado
 * @author Dulce Mora
 * @version 1.0
**/
public class Directivo extends Empleado{

    /**
     * Metodo constructor que manda llamar al constructor de Empleado
     **/
    public Directivo(String nombre){
	super(nombre);
    }

    /**
     * Metodo constructor que manda llamar al constructor de Empleado
     **/
    public Directivo(){
	super();
    }

    /**
     *Metodo toString
     * @return nombre
     **/
    public String toString(){
	return "Directivo: " + nombre;
    }

}
