/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp8_1;

/**
 *
 * @author #IqbalFathur
 */
public class Roket extends Thread {

    final String nama;
    int lama = 10;

    public Roket(String p) {
        nama = p;
    }

    @Override
    public void run() {
        for (int i = 0; i <= lama;) {
            System.out.println("Rocket " + (nama + " has " + lama + " seconds before launch"));
            lama--;
        }
        System.out.println("Rocket " + nama + " has launch!");
    }
}
