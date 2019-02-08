//Andrea Paniagua, Jenniver Sandoval
//18733, 18962
import java.util.Random;
import java.util.Arrays;
public class Main {
    public static void Main (String[] args) {

        int paraSort[] = new int[3000];

        for (int i = 0; i < 3000; i++) {
            int test = new Random().nextInt(Integer.SIZE - 1);
            paraSort[i] = test;
        }

        for (int i = 1; i <paraSort.length; i++) {
            System.out.println(i + ":" + paraSort[i - 1]);
        }}
    }
