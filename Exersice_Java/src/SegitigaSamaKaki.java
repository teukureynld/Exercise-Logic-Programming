import java.util.Scanner;
public class SegitigaSamaKaki {
    public static void main(String[] args) {
        
        double alas;
        double tinggi;
        float dibagi2;

        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan nilai variable alas = ");
        alas = input.nextDouble();
        System.out.print("Masukkan nilai variable tinggi = ");
        tinggi = input.nextDouble();
        System.out.print("Masukkan nilai variabble untuk /2 =  ");
        dibagi2 = input.nextInt();

        System.out.println();
        System.out.println("Totalnya adalah = " + (alas*tinggi/dibagi2));
    }
}
