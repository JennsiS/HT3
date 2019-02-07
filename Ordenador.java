/**
 * @author Jennifer Sandoval,Andrea Paniagua
 * @Carne 18962,18733
 * @date 02/02/19
 * @name Ordenador.java
 * <p>Clase principal del programa,genera hasta 3000 numeros aleatorios y los escribe en un archivo de texto  </p>
 * */
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;
public class Ordenador {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException   {
        String ruta = "C:\\Users\\bff_n_000\\Desktop\\archivo.txt";
        File archivo = new File(ruta);
        BufferedWriter bw;
        if(archivo.exists()) {
            bw = new BufferedWriter(new FileWriter(archivo));
            for (int i=0; i<3000; i++){
                //Arreglar los numeros que genera
                int numero= numero = (int) (Math.random()*3000);
                String escribir= Integer.toString(numero);
                String espacio= " ";
                bw.write (espacio + escribir);
            }
        } else {
            bw = new BufferedWriter(new FileWriter(archivo));
           for (int i=0; i<3000; i++){
                int numero= numero = (int) (Math.random()*3000);
                bw.write (numero);
            }
        }
        bw.close();
    }
    
}
