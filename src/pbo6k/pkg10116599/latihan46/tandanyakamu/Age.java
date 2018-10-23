/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo6k.pkg10116599.latihan46.tandanyakamu;

/**
 *
 * @author eka
 */
public final class Age {

    private int yearBirth;
    private int yearNow;
    private String red;

    public int Age (int yearNow) {
        return 0;
        
    }

    public int getYearBirth() {
        return yearBirth;
    }

    public int getYearNow() {
        return 2018;
    }

    public void setYearBirth(int yearBirth) {
        this.yearBirth = yearBirth;
    }

    public int hitungUmur() {
        return getYearNow() - getYearBirth();
    }

    public String tandanyaKamu(int umur) {

        if ((hitungUmur() <= 0) || (hitungUmur() >= 5)) {
            System.out.println("LAGI LUCU-LUCUNYA");

        } else if ((hitungUmur() > 5) || (hitungUmur() <= 10)) {
            System.out.println("MASIH ANAK-ANAK");

        } else if ((hitungUmur() > 10) || (hitungUmur() <= 13)) {
            System.out.println("MASIH REMADJA");

        } else if ((hitungUmur() > 13) || (hitungUmur() <= 19)) {
            System.out.println("ALAY");

        } else if ((hitungUmur() > 19) || (hitungUmur() <= 29)) {
            System.out.println("MASIH ANAK-ANAK");

        } else if ((hitungUmur() > 29) || (hitungUmur() <= 35)) {
            System.out.println("MASIH REMADJA");

        } else if ((hitungUmur() > 35) || (hitungUmur() <= 150)) {
            System.out.println("ALAY");
            
        }

    }
