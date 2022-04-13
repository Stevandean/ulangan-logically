/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ulangan.harian;

/**
 *
 * @author ASUS
 */
import java.util.Scanner;
public class soal3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner pengurangan = new Scanner (System.in);
    int Pertama, Kedua, Ketiga, Keempat, HasilJumlah;
           System.out.print("1. Masukan Angka : ");
               Pertama = pengurangan.nextInt();
           System.out.print("2. Masukan Angka : ");
               Kedua = pengurangan.nextInt();
           System.out.print("3. Masukan Angka : ");
               Ketiga = pengurangan.nextInt();
           System.out.print("4. Masukan Angka : ");
                Keempat = pengurangan.nextInt();    HasilJumlah = Pertama + Kedua + Ketiga + Keempat;
           System.out.println("Hasil Penjumlahan dari "+Pertama+" - "+Kedua+" - "+Ketiga+" - "+Keempat+" = "+HasilJumlah);
    
}
}