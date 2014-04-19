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
public class TP81 {

    public static void main(String[] args) {
        Roket Thread1 = new Roket("1103120224");
        Roket Thread2 = new Roket("Iqbal");
        Thread1.start();
        Thread2.start();
        
    }
    
}
