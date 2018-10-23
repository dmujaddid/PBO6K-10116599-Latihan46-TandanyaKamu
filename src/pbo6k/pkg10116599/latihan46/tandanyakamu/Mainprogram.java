/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo6k.pkg10116599.latihan46.tandanyakamu;

import java.util.Scanner;

/**
 *
 * @author 
 * NAMA     : Robby Eka Purnama
 * KELAS    : PBO6K
 * NIM      : 10116599
 * Deskripsi Program : 
 * 
 */
public class Mainprogram {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner scan1 = new Scanner(System.in);
        Scanner scan2 = new Scanner(System.in);
        
        // Inisialisasi
        Age age = new Age();
        
        System.out.print("Masukkan Tahun Lahir Anda : ");
        int lahir = scan1.nextInt(); 
        age.setYearBirth(lahir);
        
        System.out.println();
        System.out.println("===== Hasil Perhitungan Umur ======");
        System.out.println("Tahun lahir Anda : " + age.getYearBirth());
        System.out.println("Hari ini tahun : " + age.getYearNow());
        System.out.println("Umur kamu sampai hari ini adalah " + age.hitungUmur() + " tahun");
        System.out.println(age.tandanyaKamu(lahir));
    }
    
}
