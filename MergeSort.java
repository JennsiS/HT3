

/**
 *
 * @author Andrea Paniagua, Jennifer Sandoval
 * Carne: 18733,18962
 * MergeSort.java
 * <p>Esta es una clase que contiene el metodo de ordenamiento de numeros de tipo merge </p>
 */
public class MergeSort {

    /**
     *
     * @param number
     * @param izq
     * @param der
     */
    public void sort(int[] number, int izq, int der) {
        if (izq >= der) {
            return;
        }
        int mid = (izq + der) / 2;
        sort(number, izq, mid);
        sort(number, mid + 1, der);
        merge(number, izq, mid, der);
    }

    /**
     *
     * @param number
     * @return
     */
    public int[] sort1(int[] number) {
        int largo = 1;
        int[] test = new int[0];
        while (number.length > largo) {
            for (int i = 0; i + largo <= number.length - 1; i += largo * 2) {
                int izq = i;
                int mid = i + largo - 1;
                int der = i + largo * 2 - 1;
                if (der > number.length - 1) {
                    der = number.length - 1;
                }
                test = merge(number, izq, mid, der);
            }
            largo *= 2;
        }
        return test;
    }

    /**
     *
     * @param listanum
     * @param izq
     * @param mid
     * @param der
     * @return
     */
    public int[] merge(int[] listanum, int izq, int mid, int der) {

        int[] temp = new int[der - izq + 1];

        int i = izq;
        int j = mid + 1;
        int k = 0;

        while (i <= mid && j <= der) {
            if (listanum[i] < listanum[j]) {
                temp[k++] = listanum[i++];
            }
            else {
                temp[k++] = listanum[j++];
            }
        }

        while (i <= mid) {
            temp[k++] = listanum[i++];
        }
        while (j <= der) {
            temp[k++] = listanum[j++];
        }

        for (int m = 0; m < temp.length; m++) {
            listanum[m + izq] = temp[m];
        }
        return temp;
    }
}