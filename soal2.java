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
public class soal2 {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.println("Masukkan Angka:");
        int a=input.nextInt();
        if(a%2==0||a%a==1){
            System.out.println("Genap");
        }else if(a%2!=0||a%a!=1){
            System.out.println("Ganjil");
        }
    }
}
