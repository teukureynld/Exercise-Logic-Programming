package upahKarwayan;

public class upahLemburKaryawan {
    public static void main(String[] args) {
         
        char[] golonganKaryawan = {'A', 'B' , 'C'};
        int gajiLembur = 3000;
        int totalJamPerminggu = 48;
        int jamLembur = 2;
        int totalUpah;
        
        if(golonganKaryawan [0] == 'A') {
            totalUpah = (totalJamPerminggu*4000) + (jamLembur*gajiLembur);
            System.out.println("Total gajian Untuk Karyawan A : " + totalUpah);
                
        }
        if (golonganKaryawan [1] == 'B') {
            totalUpah = (totalJamPerminggu *5000) + (jamLembur*gajiLembur);
            System.out.println("Total gajian Untuk Karyawan B : " + totalUpah);
        }
        if (golonganKaryawan [2] == 'C') {
            totalUpah = (totalJamPerminggu *600) + (jamLembur*gajiLembur);
            System.out.println("Total gajian Untuk Karyawan C : " + totalUpah);
        }
    }
}

