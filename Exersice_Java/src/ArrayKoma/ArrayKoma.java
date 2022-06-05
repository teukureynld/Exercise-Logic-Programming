package ArrayKoma;

public class ArrayKoma {
    public static void main(String[] args) {
        
        int[] nilai = {1,2,3,4,5,6,7,8,9,10};
        double jumlah = 0;

        for(int i = 0; i < 10; i++) {
            jumlah = jumlah + nilai[i];
        }
        System.out.println(jumlah/10);
    }
}
