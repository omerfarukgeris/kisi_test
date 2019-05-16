package RASTGELEKISIURET;

import java.util.Random;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author acer
 */
public class Telefon {
    String tel_no;    
    IMEINo ime=new IMEINo() ;
        
        Telefon(){
          tel_no = uret();  
          
            
        }
     public String uret(){
        String tel="";
       
        Random r = new Random(); 
        return "05"+Integer.toString(r.nextInt(6))+Integer.toString(r.nextInt(10))+Integer.toString(r.nextInt(10))+Integer.toString(r.nextInt(10))+Integer.toString(r.nextInt(10))+Integer.toString(r.nextInt(10))+Integer.toString(r.nextInt(10))+Integer.toString(r.nextInt(10))+Integer.toString(r.nextInt(10));  
                   
    }
}
