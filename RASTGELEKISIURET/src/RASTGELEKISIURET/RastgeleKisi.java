package RASTGELEKISIURET;

import java.io.FileNotFoundException;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author acer
 */
public class RastgeleKisi {
    Kisi kisi;
    Telefon tel;
    
    

    public String uret() throws FileNotFoundException {
        kisi = new Kisi();
       tel = new Telefon();
        return  kisi.kimlik_no + " " +kisi.isim + " " + kisi.yas + " " + tel.tel_no + " (" +tel.ime.imei_no+")";
    }
}
