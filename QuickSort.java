/**
 *
 * @author Andrea Paniagua, Jennifer  Sandoval
 * Carne: 18733, 18962
 * QuickSort.java
 * Referencia: https://www.geeksforgeeks.org/quick-sort/
 * <p>Esta es una clase con el metodo de ordenamiento de numeros de tipo Quick </p>
 */
public class QuickSort {
    int partition(Comparable arr[], int low, int high) { //Se usa comparable como indica hoja
        Comparable pivot = arr[high]; //siempre inicia con un pivot en este caso , comparable
        int i = (low-1);
        for (int j=low; j<high; j++){ //para que funcione
            if (arr[j].compareTo(pivot) < 0){ //compara arr con pivot
                i++;
                Comparable temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        Comparable temp = arr[i+1]; //suma al comparable
        arr[i+1] = arr[high];
        arr[high] = temp;

        return i+1;
    }

    void sort(Comparable arr[], int low, int high){
        if (low < high){
            //low menor que high
            int pi = partition(arr, low, high);
            sort(arr, low, pi-1);
            sort(arr, pi+1, high);
        }
    }
}
