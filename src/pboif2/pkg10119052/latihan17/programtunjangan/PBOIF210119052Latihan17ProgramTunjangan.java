package pboif2.pkg10119052.latihan17.programtunjangan;
import java.util.Scanner;
/**
 *
 * NAMA   : Rizki Dwi nugraha
 * KELAS  : IF-2
 * NIM    : 10119052
 * Deskripsi Program : Program ini berisi program untuk menampilkan
 * program tunjangan
 * 
 */
public class PBOIF210119052Latihan17ProgramTunjangan {

    public static double inputGaji(){
        double gajiPokok;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Berapa gaji pokok anda perbulan? : ");
        gajiPokok = scanner.nextInt();
        return gajiPokok;
    }
    public static String inputStatus(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Status anda? (Menikah/Belum) : ");
        String status = scanner.nextLine();
        return status;
    }
    public static void main(String[] args) {
       System.out.println("====Program Tunjangan====");
       double gajiPokok = inputGaji();
       String status = inputStatus();
       double tunjangan,gajiTotal;
       
       if (status.equals("Menikah")){
           tunjangan = 0.35 * gajiPokok;
       }else{
           tunjangan = 0;
       }
       
       gajiTotal=tunjangan + gajiPokok;
       
       System.out.println("====Hasil Perhitungan Gaji Anda====");
       System.out.println("Gaji Pokok\t:" + gajiPokok);
       System.out.println("Tunjangan\t:" + tunjangan);
       System.out.println("Gaji Total\t:" + gajiTotal);
       System.out.println("Developed By Rizki Dwi Nugraha");

    }
    
}
