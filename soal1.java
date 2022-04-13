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
public class soal1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Masukkan Angka:");
        int a=input.nextInt();
        int b=input.nextInt();
        if(a>b || b>a){
            if(a>b){
                System.out.print(a+" Lebih besar dari "+b+" ");
            }else if(b>a){
                System.out.print(b+" lebih besar dari "+a+" ");
            }
        }else{
            System.out.print("Hanya untuk menentukan angka lebih besar ");
        }
    } 
}
