// materi belajar array2d 
import java.util.Scanner;

public class array2d {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("How Much Data do you want to insert?: ");
        int insertData = input.nextInt();

        String dataTabel[][] = new String[insertData] [4];

        for(int i = 0; i < insertData; i++)
        {
            System.out.print("NPM : "); 
            dataTabel[i][0] = input.next();

            System.out.print("Nama : ");
            dataTabel[i][1] = input.next();

            System.out.print("Address : "+ "\n");
            dataTabel[i][2] = input.next();

            System.out.print("Umur : ");
            dataTabel[i][3] = input.next();
        }
        System.out.println();

        System.out.println("-----------");
        for(int i = 0; i < insertData; i++) {
            System.out.print(dataTabel[i][0] + "\t" + dataTabel[i][1] + "\t" + dataTabel[i][2]+ "\t" + dataTabel[i][3]);
        }
        input.close();
    }
}