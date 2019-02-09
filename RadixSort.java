import java.util.Arrays;

/**
 *
 * @author Andrea Paniagua, Jennifer Sandoval
 * Carne: 18733, 18962
 * RadixSort.java
 * Referencia: https://www.geeksforgeeks.org/radix-sort/
 * <p>Esta clase tiene un metodo de ordenamiento de numeros de tipo Radix </p>
 */
public class RadixSort {
    void radixsort(Comparable arr[], int n) {
        // Find the maximum number to know number of digits
        Comparable m = getMax(arr, n);

        // No se cuenta poco a poco
    }

    Comparable getMax(Comparable arr[], int n) {
        Comparable mx = arr[0];
        for (int i = 1; i < n; i++)
            if (arr[i].compareTo(mx) > 0)
                mx = arr[i];
        return mx;

    }
}