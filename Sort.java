import java.util.Random;

public class Sort{
    
    public static int particion(int arr2[], int izq, int der) {
        int pivote = arr2[izq];
	while (true) {
            while (arr2[izq] < pivote) {
                izq++;
            }
            while (arr2[der] > pivote) {
                der--;
            }
            if (izq >= der) {
                return der;
            } else {
                int temporal = arr2[izq];
                arr2[izq] = arr2[der];
                arr2[der] = temporal;
                izq++;
                der--;
            }
        }
    }

    public static void quicksort(int arr2[], int izq, int der) {
    if (izq < der) {
        int indiceParticion = particion(arr2, izq, der);
        quicksort(arr2, izq, indiceParticion);
        quicksort(arr2, indiceParticion + 1, der);
       }
    }
}
