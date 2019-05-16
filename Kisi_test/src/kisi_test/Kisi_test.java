/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kisi_test;
import RASTGELEKISIURET.*;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author acer
 */
public class Kisi_test {

    /**
     * @param args the command line arguments
     */
    

    public static void main(String[] args) throws FileNotFoundException, IOException {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        int secim=3; 
        int adet;
        do{


                  
          System.out.println("1 - Rastgele Kişi Üret");
          System.out.println("2 - Üretilmiş Dosya Kontrol Et");
          System.out.println("3 - Çıkış");
          secim = input.nextInt();
          if(secim == 1){
              String temp;
               System.out.print("Üretilecek Kişi Sayısını Giriniz...");
              
               adet = input.nextInt();
               System.out.println("------------------------------------------------------------------------");
               RastgeleKisi[] rast = new RastgeleKisi[adet];
               BufferedWriter writer = new BufferedWriter(new FileWriter("Kisiler.txt"));
  
 
               for(int i=0 ; i<adet ; i++){
                   rast[i]=new RastgeleKisi();
                   temp =rast[i].uret();
                  System.out.println(temp);
                   writer.write(temp);
                   writer.newLine();
               }
                 
    
     
                 writer.close();

               System.out.println("------------------------------------------------------------------------");
          }else if (secim == 2){
                IMEINo imei=new IMEINo();
                KimlikNo kimlik_no = new KimlikNo();
                File dosya=new File("Kisiler.txt");
                Scanner s=new Scanner(dosya);
                String str[]=new String[4];
                int sayac=0, hatali_tc=0,hatali_imei=0;
                while(s.hasNext()){
                    sayac++;
                    str = s.nextLine().split(" ");
                    
                    if(!kimlik_no.kontrol(str[0])){
                        hatali_tc++;
                    }
                    if(!imei.kontrol(str[5].substring(1,16))){
                        hatali_imei++;
                    }
                   // System.out.println("-"+str[5].substring(1,16)+"*");
                }
                System.out.println("------------------------------------------------------------------------"); 
                System.out.println("T.C. Kimlik Kontrol");
                System.out.println(sayac-hatali_tc + "\tGeçerli");
                System.out.println(hatali_tc + "\tGeçersiz");
                
                System.out.println("IMEI Kimlik Kontrol");
                System.out.println(sayac-hatali_imei + "\tGeçerli");
                System.out.println(hatali_imei + "\tGeçersiz");
                System.out.println("------------------------------------------------------------------------"); 
          }
          
          
          }while(secim != 3);
    }
    
}
