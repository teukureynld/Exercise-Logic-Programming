public class BelajarTryCatch {
    static void nyobaFunction() {
        System.out.println("test 12354");
    };
    static void belajarTry() {
        // !!! NOTE 
        // !! tidak bisa memakai inisial tipe data, 
        // !! harus memakai kata kunci var

         var a = 10;
         var b = 0;
        // tidak bisa di bagi dalam hukum aritmatika
        // System.out.println("Sebelum dibagi");
        try {
            System.out.println(a/b);
        } catch (Exception t) {
            System.out.println("Variable diatas tidak bisa di bagi 0");
        }
    };
    public static void main(String[] args){
        // functionnya java (java)
        nyobaFunction();
        belajarTry();
    }
}