/**
 *Clase 
 * @author Dulce Mora
 * @version 1.0
**/
public class Empleado{

    //Atributos
    protected String nombre;

    /**
     * Metodo constructor que da como nombre predeterminado Dulce Mora
     **/
    public Empleado(){
	this.nombre = "Dulce Mora";
    }
    
    /**
     * Metodo constructor que recibe un String
     * @param nombre Parametro que es el nombre
     **/
    public Empleado(String nombre){
	this.nombre = nombre;
    }

    /**
     * Metodo que devuelve el nombre
     * @return El nombre
     **/
    public String getNombre(){
	return this.nombre;
    }
    /**
     * Metodo que modifica el nombre
     **/
    public void setNombre(String nombre){
	this.nombre = nombre;
    }
    
    //toString
    public String toString(){
	return "Empleado: " + nombre;
    }
    
    //equals
    @Override
    public boolean equals(Object empleado){
	Empleado em = (Empleado) empleado;
	return this.nombre.equals(em.getNombre());
    }    
}
