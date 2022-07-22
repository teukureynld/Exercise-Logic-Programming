package kereta;
import java.util.Scanner;

public class kereta {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        double hargaTotal = 0;
        double diskon = 50;

       System.out.println("Jenis Kelas Kereta api");
       System.out.println("1. Ekonomi");
       System.out.println("2. Eksekutif");
       System.out.println();

       System.out.print("Pilihan jenis kereta :" );
       int jenisKereta = input.nextInt();

       System.out.print("Masukkan jumlah penumpang : ");
       int penumpang = input.nextInt();

       if(jenisKereta == 1) {
            if(penumpang > 5) {
                hargaTotal = 100000 * penumpang / diskon;
            } else {
                hargaTotal = 80000 * penumpang / diskon;
            }

        } else if (jenisKereta == 2 ) {
            if(penumpang > 5 ) {
                hargaTotal = 500000 *penumpang / diskon;
            } else {
                hargaTotal = 400000 * penumpang / diskon;
            }

        } else {
            System.out.println("Salah input!");
        }
        System.out.println("Harga yang harus dibayar Rp." + "" + hargaTotal);

        input.close();
    }
}