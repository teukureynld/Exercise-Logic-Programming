public class arrayGanjilGenap {
    public static void main(String[] args) {
        
        int[] ganjil = {0,1,2,3,4,5,6,7,8,9,10};
        int[] genap = {0,1,2,3,4,5,6,7,8,9,10};
        int i , j;


        for( i = 0; i < ganjil.length; i++) {
            if (i % 2 == 1) {
                System.out.println("Berikut ini adalah angka ganjil = " + ganjil[i]);
            }
        }
        System.out.println();
        for( j =0; j < genap.length; j++ ) {
            if (j % 2 == 0) {
                System.out.println("Berikut ini adalah angka genap = " + genap[j]);
            }
        }

    }
}
