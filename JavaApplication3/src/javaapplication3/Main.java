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
public class Main {

    private static Object g;
    
      public static void main(String[] args) {
        Hewan h = new Hewan();
        
             h.setTelinga("Panjang");
             System.out.println("Telinganya Terlihat " + h.getTelinga());

        Manusia m = new Manusia();
        
             m.setMata("Coklat");
             System.out.println("Manusia itu memiliki mata " + m.getMata());

        Pesawat_Telepon p = new Pesawat_Telepon();
        
             p.setKabel("Merah");
             System.out.println("Warna kabel telepon itu adalah " + p.getKabel());

        
    }
}
