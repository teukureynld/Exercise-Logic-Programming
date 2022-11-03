import java.io.*;
public class inputStream {
    public static void main(String[] args) {
        try {
            FileOutputStream out = new FileOutputStream("inputNama.txt");
            PrintStream p = new PrintStream(out);
            p.println("Nama | Teuku Reynaldi");
            p.println("Nama | Reynaldi");
        }  catch (Exception e) {
            System.out.println("Kesalahan : " + e.getMessage());      
        }
        System.out.println("File has been sucsessed to writeOver");
    }
}
