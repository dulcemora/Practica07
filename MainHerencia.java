public class MainHerencia{
    public static void main(String[] args){

	System.out.println("***Empleados destacados***");
	Empleado em1 = new Empleado();
	System.out.println(em1.getNombre());
	Empleado em2 = new Empleado("Sandra Ramirez");
	System.out.println(em2.getNombre());

	System.out.println("***Operadores destacados***");	
	Operador op1 = new Operador();
	System.out.println(op1.getNombre());
	Operador op2 = new Operador("Alejandro Herrera");
	op2.setNombre("Alejandro Juarez");
	System.out.println(op2.getNombre());
	System.out.println("¿El nombre de los operadores es igual? " + op2.equals(op1));

	Oficial of1 = new Oficial();
	System.out.println(of1.trabaja());

	System.out.println("------------------------------------");
	Empleado em3;
	em3 = new Empleado("Raquel Mendoza");
	System.out.println(em1);
	System.out.println(em2);
	System.out.println(em3);
	
       	Operador op3;
	op3 = new Operador("Isaac Juarez");
	System.out.println(op1);
	System.out.println(op2);
	System.out.println(op3);
	
	Directivo dir1;
	dir1 = new Directivo("Sebastian Martinez");
	System.out.println(dir1);

       	Oficial of2;
	of2 = new Oficial("Jorge Carranza");
	System.out.println(of2);

	Tecnico tec1;
	tec1 = new Tecnico("Daniela Martinez");
	System.out.println(tec1);

    }

}
