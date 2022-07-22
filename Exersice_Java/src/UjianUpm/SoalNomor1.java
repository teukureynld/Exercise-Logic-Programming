package UjianUpm;
import java.util.Scanner;
public class SoalNomor1 {
    public static void main(String[] args) {
        int i = 1;
        Scanner input = new Scanner(System.in);

        System.out.print("Input sebuah angka : ");
        int inputAngka = input.nextInt();

        System.out.println("=============================");
        while(i <= 10) {
            System.out.println(inputAngka + ":" + i + " = "  + inputAngka / i + " sisa " + inputAngka % i );
            i++;
        }
        input.close();
    }
}
