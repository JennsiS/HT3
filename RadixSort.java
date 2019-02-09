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

    /**
     *
     * @param arr
     * @param n
     * @return
     */
    public int getMax (int arr[], int n){
        int mx = arr[0];
        for (int i = 1; i < n; i++){
            if (arr[i] > mx){
                mx = arr[i];
            }
        }
        return mx;
    }

    /**
     *
     * @param arr
     * @param n
     * @param exp
     */
    public void countSort(int arr[], int n, int exp) {
        int output[] = new int[n];
        int i;
        int count[] = new int[10];
        Arrays.fill(count, 0);

        for (i = 0; i < n; i++) {
            count[arr[i] / exp % 10]++;
        }

        for (i = 1; i < 10; i++) {
            count[i] += count[i - 1];
        }

        for (i = n - 1; i >= 0; i--) {
            output[count[(arr[i] / exp) % 10] - 1] = arr[i];
            count[(arr[i] / exp) % 10]--;
        }

        for (i = 0; i < n; i++) {
            arr[i] = output[i];
        }
    }

    /**
     *
     * @param arr
     * @param n
     */
    public void radixSort(int arr[], int n){
        int m = this.getMax(arr, n);

        for (int exp = 1; m/exp > 0; exp *= 10)
            countSort(arr, n, exp);
    }
}
