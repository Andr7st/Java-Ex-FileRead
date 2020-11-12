package paquete;
/**
 * @author Andrés Segura
 * @author Andr7st
 * 
 * - Leer un archivo de texto plano.
 */
import java.io.*;

public class Main {
    public static void main(String[] args) {
       
        try {

            BufferedReader BR = new BufferedReader(new FileReader(new File("../Auxiliar/Andr7st.txt")));

            Object[] LI = BR.lines().toArray();
            
            System.out.println("Saltos de Linea: " + LI.length + "\n");

            for (Object obj : LI) {

                System.out.println(obj);

            }

            BR.close();

        } catch (Exception e) {

            System.out.println("No se puede leer la ruta especificada.");

        }
    }
}