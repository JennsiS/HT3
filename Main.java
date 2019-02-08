
import java.util.Random;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Andrea Paniagua, Jennifer  Sandoval
 * carne: 18733,18962
 * Main.java
 * <p>Esta clase es la principal y se encarga de controlar el programa y ordenar los numeros  </p>
 */
public class Main {

    /**
     *
     * @param args
     */
    public static void main (String[] args) {
        Scanner scan = new Scanner (System.in);
        String op=" ";
        String op1=" ";
        MergeSort merge= new MergeSort();
        GnomeSort gnome= new GnomeSort();
        QuickSort quick= new QuickSort();
        RadixSort radix= new RadixSort();
    
    System.out.println("Seleccione la accion que desea realizar");
    System.out.println("1. Ordenar 100 numeros");
    System.out.println("2. Ordenar 500 numeros");
    System.out.println("3. Ordenar 1000 numeros");
    System.out.println("4. Ordenar 1500 numeros");
    System.out.println("5. Ordenar 2000 numeros");
    System.out.println("6. Ordenar 3000 numeros");
    op= scan.nextLine();
        if (op.equals("1")){
            int paraSort[] = new int[100];
                 for (int i = 0; i < 100; i++) {
                    int test = new Random().nextInt(Integer.SIZE - 1);
                    paraSort[i] = test;
                }

                for (int i = 1; i <paraSort.length; i++) {
                    System.out.println(i + ":" + paraSort[i - 1]);
                }
            System.out.println("Seleccione la accion que desea realizar");
            System.out.println("1.Ordenar con metodo Merge");
            System.out.println("2.Ordenar con metodo Gnome");
            System.out.println("3.Ordenar con metodo Quick");
            System.out.println("4.Ordenar con metodo Radix");
            System.out.println("5.Ordenar con metodo ");
            op1= scan.nextLine();
            if (op1.equals("1")){
                merge.sort1(paraSort);
               
            }
            if (op1.equals("2")){
                gnome.GnomeSort(paraSort);
                
            }
            if (op1.equals("3")){
                quick.sort(paraSort, 0, 100);
            }
            if (op1.equals ("4")){
                radix.radixSort(paraSort, 100);
            }
            if (op1.equals("5")){
            }
            for (int i = 1; i <paraSort.length; i++) {
                    System.out.println(i + ":" + paraSort[i - 1]);
                }
        }
         if (op.equals("2")){
             int paraSort[] = new int[500];

            for (int i = 0; i < 500; i++) {
                int test = new Random().nextInt(Integer.SIZE - 1);
                paraSort[i] = test;
            }

            for (int i = 1; i <paraSort.length; i++) {
                System.out.println(i + ":" + paraSort[i - 1]);
            }
            System.out.println("Seleccione la accion que desea realizar");
            System.out.println("1.Ordenar con metodo Merge");
            System.out.println("2.Ordenar con metodo Gnome");
            System.out.println("3.Ordenar con metodo Quick");
            System.out.println("4.Ordenar con metodo Radix");
            System.out.println("5.Ordenar con metodo ");
            op1= scan.nextLine();
              if (op1.equals("1")){
                merge.sort1(paraSort);
            }
            if (op1.equals("2")){
                gnome.GnomeSort(paraSort);
            }
            if (op1.equals("3")){
                quick.sort(paraSort, 0, 500);
            }
            if (op1.equals ("4")){
                radix.radixSort(paraSort, 500);
            }
            if (op1.equals("5")){
            }
            for (int i = 1; i <paraSort.length; i++) {
                    System.out.println(i + ":" + paraSort[i - 1]);
                }
        }
          if (op.equals("3")){
              int paraSort[] = new int[1000];

             for (int i = 0; i < 1000; i++) {
                    int test = new Random().nextInt(Integer.SIZE - 1);
                    paraSort[i] = test;
                }

             for (int i = 1; i <paraSort.length; i++) {
                    System.out.println(i + ":" + paraSort[i - 1]);
                }
            System.out.println("Seleccione la accion que desea realizar");
            System.out.println("1.Ordenar con metodo Merge");
            System.out.println("2.Ordenar con metodo Gnome");
            System.out.println("3.Ordenar con metodo Quick");
            System.out.println("4.Ordenar con metodo Radix");
            System.out.println("5.Ordenar con metodo ");
            op1= scan.nextLine();
              if (op1.equals("1")){
                merge.sort1(paraSort);
            }
            if (op1.equals("2")){
                gnome.GnomeSort(paraSort);
            }
            if (op1.equals("3")){
                quick.sort(paraSort, 0, 1000);
            }
            if (op1.equals ("4")){
                radix.radixSort(paraSort, 1000);
            }
            if (op1.equals("5")){
            }
            for (int i = 1; i <paraSort.length; i++) {
                    System.out.println(i + ":" + paraSort[i - 1]);
                }
        }
         if (op.equals("4")){
             int paraSort[] = new int[1500];

            for (int i = 0; i < 1500; i++) {
                int test = new Random().nextInt(Integer.SIZE - 1);
                paraSort[i] = test;
            }

            for (int i = 1; i <paraSort.length; i++) {
                System.out.println(i + ":" + paraSort[i - 1]);
            }
            System.out.println("Seleccione la accion que desea realizar");
            System.out.println("1.Ordenar con metodo Merge");
            System.out.println("2.Ordenar con metodo Gnome");
            System.out.println("3.Ordenar con metodo Quick");
            System.out.println("4.Ordenar con metodo Radix");
            System.out.println("5.Ordenar con metodo ");
            op1= scan.nextLine();
              if (op1.equals("1")){
                merge.sort1(paraSort);
            }
            if (op1.equals("2")){
                gnome.GnomeSort(paraSort);
            }
            if (op1.equals("3")){
                quick.sort(paraSort, 0, 1500);
            }
            if (op1.equals ("4")){
                radix.radixSort(paraSort, 1500);
            }
            if (op1.equals("5")){
            }
            for (int i = 1; i <paraSort.length; i++) {
                    System.out.println(i + ":" + paraSort[i - 1]);
                }
        }
         if (op.equals("5")){
             int paraSort[] = new int[2000];

            for (int i = 0; i < 2000; i++) {
                int test = new Random().nextInt(Integer.SIZE - 1);
                paraSort[i] = test;
            }

            for (int i = 1; i <paraSort.length; i++) {
                System.out.println(i + ":" + paraSort[i - 1]);
            }
            System.out.println("Seleccione la accion que desea realizar");
            System.out.println("1.Ordenar con metodo Merge");
            System.out.println("2.Ordenar con metodo Gnome");
            System.out.println("3.Ordenar con metodo Quick");
            System.out.println("4.Ordenar con metodo Radix");
            System.out.println("5.Ordenar con metodo ");
            op1= scan.nextLine();
              if (op1.equals("1")){
                merge.sort1(paraSort);
            }
            if (op1.equals("2")){
                gnome.GnomeSort(paraSort);
            }
            if (op1.equals("3")){
                quick.sort(paraSort, 0, 2000);
            }
            if (op1.equals ("4")){
                radix.radixSort(paraSort, 2000);
            }
            if (op1.equals("5")){
            }
            for (int i = 1; i <paraSort.length; i++) {
                    System.out.println(i + ":" + paraSort[i - 1]);
                }
        }
         
          if (op.equals("6")){
              
              int paraSort[] = new int[3000];

            for (int i = 0; i < 3000; i++) {
                int test = new Random().nextInt(Integer.SIZE - 1);
                paraSort[i] = test;
            }

            for (int i = 1; i <paraSort.length; i++) {
                System.out.println(i + ":" + paraSort[i - 1]);
            }
            System.out.println("Seleccione la accion que desea realizar");
            System.out.println("1.Ordenar con metodo Merge");
            System.out.println("2.Ordenar con metodo Gnome");
            System.out.println("3.Ordenar con metodo Quick");
            System.out.println("4.Ordenar con metodo Radix");
            System.out.println("5.Ordenar con metodo ");
            op1= scan.nextLine();
              if (op1.equals("1")){
                merge.sort1(paraSort);
            }
            if (op1.equals("2")){
                gnome.GnomeSort(paraSort);
            }
            if (op1.equals("3")){
                quick.sort(paraSort, 0, 3000);
            }
            if (op1.equals ("4")){
                radix.radixSort(paraSort, 3000);
            }
            if (op1.equals("5")){
            }
            for (int i = 1; i <paraSort.length; i++) {
                    System.out.println(i + ":" + paraSort[i - 1]);
                }
        }
    
    
    }
    }