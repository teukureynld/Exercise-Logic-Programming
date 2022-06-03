package menuUtama;
import java.util.Scanner;

public class MenuUtama {

    public static void main(String[] args) {
        
        Scanner input = new Scanner (System.in);

        int pilihMenu;

        System.out.print("Masukkan pilihan Menu : ");
        pilihMenu = input.nextInt();

        System.out.println("=====Pilihan Menu=====");

        //menggunakan switch lambda
        switch(pilihMenu) {
            case 1 -> System.out.println("1. Baca Data");
            case 2 -> System.out.println("2. Cetak Data");
            case 3 -> System.out.println("3. Ubah Data");
            case 4 -> System.out.println("4. Hapus Data");

            default -> {
                System.out.println("Salah input!");
            
            }   
        }
        input.close();
    }
    
}