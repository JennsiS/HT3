//Andrea Paniagua, Jenniver Sandoval
//18733, 18962
public class GnomeSort {

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
