public class tryExcep {
    public static void main(String[] args) {
        String nama = "Teuku Reynaldi";

        switch (nama) {
            // case "Reynaldi" :
            // System.out.println("Ini tidak benar"); 
            // break;

            // case "Putra" : 
            // System.out.println("Ini masih tidak benar");
            // break;

            // case "Teuku Reynaldi" : 
            // System.out.println("Ini benar");
            // break;

            // default : 
            // System.out.println("Yang benar case yang ketika");

            case "Teuku" -> System.out.println("Ini salah");
            case "Reynaldi" -> System.out.println("Ini yang salah juga");
            case "Teuku Reynaldi" -> System.out.println("ini yang benar");

            default -> System.out.println("Ini pemanis"); 
        }
    }
}
