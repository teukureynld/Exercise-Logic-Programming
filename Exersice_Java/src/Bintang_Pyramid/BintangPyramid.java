import java.util.Scanner;


public class BintangPyramid {
    public static void main(String[] args) {
        // untuk input jumlah bintang, kedua variable ini adalah tipe variable yang
        // global
        int n;
        Scanner input = new Scanner (System.in);

        System.out.print("Masukkan jumlah pola yang diinginkan : ");
        n = input.nextInt();
        
        System.out.print(" ");

        // untuk perulangan n (baris) inputan
        for(int rows = 1; rows <= n; rows++ ) {
            // ini perulangan untuk spasi baris dan kolom
            for(int coloumn = 1; coloumn <= n-rows; --coloumn) {
                System.out.print(" ");
            }
            // cetak bintang
            for(int star = 1; star <= rows; star++ ) { 
                System.out.println("*");
            }
            
        }
        input.close();
    }
}