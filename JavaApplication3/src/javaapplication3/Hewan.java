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
public class Hewan {
    String mata, mulut, telinga, ekor;
    Integer kaki;

    public String getMata() {
        return mata;
    }

    public String getMulut() {
        return mulut;
    }

    public String getTelinga() {
        return telinga;
    }

    public String getEkor() {
        return ekor;
    }

    public Integer getKaki() {
        return kaki;
    }

    public void setMata(String mata) {
        this.mata = mata;
    }

    public void setMulut(String mulut) {
        this.mulut = mulut;
    }

    public void setTelinga(String telinga) {
        this.telinga = telinga;
    }

    public void setEkor(String ekor) {
        this.ekor = ekor;
    }

    public void setKaki(Integer kaki) {
        this.kaki = kaki;
    }
    
    
    String bermain (String m) { 
        return m;
    }
    
    String  makan (String m) {
        return m;
    }
    
    Boolean bermain (Boolean t) {
        return t;
    }
}
