/**
 *Clase Directivo
 * @author Dulce Mora
 * @version 1.0
**/
public class Directivo extends Empleado{

        /**
     * Metodo constructor que recibe un String
     * @param nombre Parametro que es el nombre
     **/
    public Directivo(String nombre){
	super(nombre);
    }

    /**
     * Metodo constructor que da como nombre predeterminado Dulce Mora
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
