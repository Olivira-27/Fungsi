/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fungsi;
import java.util.Scanner;
/**
 *
 * @author ASUS
 */
public class Fungsi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner masukan = new Scanner(System.in);
        int pilihan = 9 ;
        do{
            System.out.println("Menu Luas Bangun");
            System.out.println("1. Menghitung Luas Persegi");
            System.out.println("2. Menghitung Luas Persegi Panjang");
            System.out.println("3. Keluar");
            System.out.print("Masukan Pilihan Anda : ");
            pilihan = masukan.nextInt();
        switch(pilihan) {
            case 1 : luasPersegi() ; break ;
            case 2 : luasPersegiPanjang() ; break ;
        }
        }while(pilihan !=3) ;
                
    }
    

    private static void luasPersegi() {
        Scanner masukan = new Scanner(System.in);
            float sisi,luas;
            System.out.print("Masukan Nilai Sisi : ");
            sisi = masukan.nextFloat();
            luas = sisi*sisi;
            System.out.println("Luas Persegi adalah : " + luas);
    
    }

    private static void luasPersegiPanjang() {
        Scanner masukan = new Scanner(System.in);
            float sisi,luas;
            System.out.print("Masukan Nilai Sisi : ");
            sisi = masukan.nextFloat();
            luas = sisi*sisi;
            System.out.println("Luas Persegi adalah : " + luas);
        
    }
}


    
