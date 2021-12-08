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

    public String toString(){
	return "Directivo: " + nombre;
    }

}
