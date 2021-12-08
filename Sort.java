import java.util.Random;

public class Sort{

    public static void main(String[] args){
	Random random1 = new Random();
	int[] arr = new int[100000];
	int[] arr2 = new int[100000];
	for(int i = 0; i < arr.length; i++){
	     int aux = random1.nextInt(100);
	     arr[i] = aux;
	     arr2[i] = aux;
      }

	//Arreglo desordenado
      	for(int i = 0; i < arr.length; i++){
	    System.out.print(arr[i] + ", ");
	}

	//Para quicksort
	System.out.println("\nQuicksort");
	quicksort(arr, 0, arr.length - 1);
	for(int i = 0; i < arr.length; i++){
	    System.out.print(arr[i] + ", ");
	}	

	//Para bubblesort
	System.out.println("\nBubblesort");
	bubblesort(arr2);
	for(int i = 0; i < arr2.length; i++){
	    System.out.print(arr2[i] + ", ");
	}
	
    }
    
    //Quicksort
    public static int particion(int arr[], int izq, int der) {
        int pivote = arr[izq];
	while (true) {
            while (arr[izq] < pivote) {
                izq++;
            }
            while (arr[der] > pivote) {
                der--;
            }
            if (izq >= der) {
                return der;
            } else {
                int temporal = arr[izq];
                arr[izq] = arr[der];
                arr[der] = temporal;
                izq++;
                der--;
            }
        }
    }

    public static void quicksort(int arr[], int izq, int der) {
    if (izq < der) {
        int indiceParticion = particion(arr, izq, der);
        quicksort(arr, izq, indiceParticion);
        quicksort(arr, indiceParticion + 1, der);
       }
    }

    //Bubblesort
    public static void bubblesort(int[] arr2) {
	for(int i = 0; i < arr2.length; i++){
	    for(int j = 0; j < arr2.length - 1; j++){
		if (arr2[j] > arr2[j+1]){
		    int temp = arr2[j];
		    arr2[j] = arr2[j + 1];
		    arr2[j + 1] = temp; 
		}
	    }
	}
    }
 
}
