package RASTGELEKISIURET;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author acer
 */
public class Kisi {
    
   public String isim;
    private KimlikNo kn=new KimlikNo();
    public String kimlik_no=kn.no;
    public int yas;
 
    Random r = new Random();
  public  Kisi() throws FileNotFoundException{
        
       
        
        List<String> isimler = new ArrayList<String>();
        
        File dosya=new File("random_isimler.txt");
        Scanner s=new Scanner(dosya);
        while(s.hasNext()){
            isimler.add(s.nextLine());
         }
        isim = isimler.get(r.nextInt(isimler.size()));
       
        yas=r.nextInt(101);
       
    }
}
