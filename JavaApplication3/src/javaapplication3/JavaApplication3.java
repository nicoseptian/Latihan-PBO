/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication3;

/**
 *
 * @author Nico Septian
 */
public class JavaApplication3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Hewan h = new Hewan ();
        
        h.setTelinga ("Panjang");
        System.out.println (h.getTelinga() );
        
         System.out.println (h.bermain ("Bola") );
        
        // TODO code application logic here
    }
    
}
