/**
 *Clase 
 * @author Dulce Mora
 * @version 1.0
**/
public class Oficial extends Operador{
    /**
     * Metodo constructor que recibe un String
     * @param nombre Parametro que es el nombre
     **/
    public Oficial(String nombre){
	super(nombre);
    }

    /**
     * Metodo constructor que da como nombre predeterminado Dulce Mora
     **/
    public Oficial(){
	super();
    }

    /**
     * Metodo que devuelve "Estoy trabajando"
     * @return Estoy trabajando
     **/    
    public String trabaja(){
	return "Estoy trabajando";
    }
    
    public String toString(){
	return "Oficial: " + nombre;
    }

}
