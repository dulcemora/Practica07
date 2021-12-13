/**
 *Clase Oficial que hereda de Operador
 * @author Dulce Mora
 * @version 1.0
**/
public class Oficial extends Operador{
    /**
     * Metodo constructor que manda llamar al constructor Operador
     **/
    public Oficial(String nombre){
	super(nombre);
    }

    /**
     * Metodo constructor que manda llamar al constructor de Operador
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

    /**
     *Metodo toString
     * @return nombre
     **/
    public String toString(){
	return "Oficial: " + nombre;
    }

}
