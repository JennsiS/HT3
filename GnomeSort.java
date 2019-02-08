

/**
 *
 * @author Andrea Paniagua, Jennifer Sandoval
 * Carne: 18733, 18962
 * GnomeSort.java
 * <p> Este es una clase que contiene un ordenamiento de numeros de tipo gnome</p>
 */
public class GnomeSort {

    /**
     *
     * @param number
     * @return
     */
    public int[] GnomeSort(int number[]) {
        int posicion = 1;
        while (posicion < number.length){
            if(number[posicion] >= number[posicion - 1]) {
                posicion++;
            }
            else {
                int temp = number[posicion];
                number[posicion] = number[posicion - 1];
                number[posicion - 1] = temp;
                if(posicion > 1) {
                    posicion--;
                }
            }
        }
        return number;
    }

}
