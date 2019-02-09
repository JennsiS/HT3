/**
 *
 * @author Andrea Paniagua, Jennifer Sandoval
 * Carne: 18733, 18962
 * GnomeSort.java
 * Referencia: https://www.geeksforgeeks.org/gnome-sort-a-stupid-one/
 * <p> Este es una clase que contiene un ordenamiento de numeros de tipo gnome</p>
 */
public class GnomeSort {

    /**
     * @param arr,low,high
     * @return
     */
    public void quickSort(Comparable arr[], int low, int high){ //comparable
        if (low < high){
            //si low rs menor que high ejecuta esto
            int pi = partition(arr, low, high);
            quickSort(arr, low, pi-1);
            quickSort(arr, pi+1, high);
        }
    }

    int partition(Comparable arr[], int low, int high) {
        Comparable pivot = arr[high]; //se crea pivot por necesidad de clase
        int i = (low-1);
        for (int j=low; j<high; j++){
            if (arr[j].compareTo(pivot) < 0){
                i++;
                Comparable temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        Comparable temp = arr[i+1];
        arr[i+1] = arr[high];
        arr[high] = temp;

        return i+1; //se regresa lo que de mas uno.
    }
}


