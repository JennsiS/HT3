/**
 *
 * @author Andrea Paniagua, Jennifer Sandoval
 * Carne: 18733, 18962
 * BubbleSort.java
 * <p> Esta clase es un Sort de tipo Bubble. Es el Sort de algoritmos mas simple, hace swap 3
 * veces hasta que no tiene ningun elemto que ordenar</p>
 */
public class BubbleSort {
    static void BubbleSort(int[] arr) {
        int paraSort = arr.length;
        int counter = 0;
        for(int i=0; i < paraSort; i++){
            for(int j=1; j < (paraSort-i); j++){
                if(arr[j-1] > arr[j]){
                    //Se hace un swap para todos los elementos
                    counter = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = counter;
                }

            }
        }

    }}
