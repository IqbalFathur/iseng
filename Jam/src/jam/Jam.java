/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jam;

import java.util.Scanner;

/**
 *
 * @author #IqbalFathur
 */
public class Jam {

    Scanner input = new Scanner(System.in);
    public int jj;
    public int mm;
    public int dd;
    int x, y, z;

    public Jam() {
    }

    void convertAll() {
        System.out.println("masukkan jam");
        x = input.nextInt();
        System.out.println("masukkan menit");
        y = input.nextInt();
        System.out.println("masukkan detik");
        z = input.nextInt();

        if (z >= 60) {
            dd = (z / 60);
            z = (z % 60);
        }
        if (y >= 60) {
            y = y + dd;
            mm = (y / 60);
            y = (y % 60);
        }
        if (x != 0) {
            x = x + mm;
        }
        
        System.out.println("Jam: " + x);
        System.out.println("Menit: " + y);
        System.out.println("Detik: " + z);
    }

    public static void main(String[] args) {
        Jam j = new Jam();
        j.convertAll();
    }

}
