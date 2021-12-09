/**
 *Clase Tecnico 
 * @author Dulce Mora
 * @version 1.0
**/
public class Tecnico extends Operador{

    /**
     * Metodo constructor que recibe un String
     * @param nombre Parametro que es el nombre
     **/
    public Tecnico(String nombre){
	super(nombre);
    }

    /**
     * Metodo constructor que da como nombre predeterminado Dulce Mora
     **/
    public Tecnico(){
	super();
    }

    /**
     * Metodo que devuelve "Estoy trabajando"
     * @return Estoy trabajando
     **/
    public String trabaja(){
	return "Estoy trabajando";
    }
    
    /**
     *Metodo toString
     * @return nombre
     **/
    public String toString(){
	return "Tecnico: " + nombre;
    }
    
}
