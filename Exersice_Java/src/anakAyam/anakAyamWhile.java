public class anakAyamWhile {
    public static void main(String[] args) {
        
       int i = 5;
        while(i >= 1) {
            System.out.println("Anak ayam turun "+ (i)+ ", mati satu tinggal" + " " +(i-1));

            i--;
            
        }
        if (i == 1) {
            System.out.println("Anak ayam turun 1, mati satu tinggal induknya");
        }
    }

    
}
