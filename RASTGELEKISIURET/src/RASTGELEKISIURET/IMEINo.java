package RASTGELEKISIURET;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Random;
/**
 *
 * @author acer
 */
public class IMEINo {
    public  String imei_no="";
       
        Random r = new Random(); 
     private int tek, cift, temp, check;
     
     public IMEINo(){
     imei_no=uret();
     }
    private String uret(){
      
       
        
        
        temp = r.nextInt(9)+1;
        tek = temp;
        imei_no = Integer.toString(temp);
        
        temp = r.nextInt(10);
        cift = (temp*2)/10+(temp*2)%10;
        imei_no += Integer.toString(temp);
        
         temp = r.nextInt(10);
        tek += temp;
        imei_no += Integer.toString(temp);
        
        temp = r.nextInt(10);
        cift += ((temp*2)/10+(temp*2)%10);
        imei_no += Integer.toString(temp);
        
           temp = r.nextInt(10);
        tek += temp;
        imei_no += Integer.toString(temp);
        
        temp = r.nextInt(10);
        cift += ((temp*2)/10+(temp*2)%10);
        imei_no += Integer.toString(temp);
        
         temp = r.nextInt(10);
        tek += temp;
        imei_no += Integer.toString(temp);
        
        temp = r.nextInt(10);
        cift += ((temp*2)/10+(temp*2)%10);
        imei_no += Integer.toString(temp);
        
           temp = r.nextInt(9)+1;
        tek += temp;
        imei_no += Integer.toString(temp);
        
        temp = r.nextInt(10);
        cift += ((temp*2)/10+(temp*2)%10);
        imei_no += Integer.toString(temp);
        
         temp = r.nextInt(10);
        tek += temp;
        imei_no += Integer.toString(temp);
        
        temp = r.nextInt(10);
        cift += ((temp*2)/10+(temp*2)%10);
        imei_no += Integer.toString(temp);
        
           temp = r.nextInt(9)+1;
        tek += temp;
        imei_no += Integer.toString(temp);
        
        temp = r.nextInt(10);
        cift += ((temp*2)/10+(temp*2)%10);
        imei_no += Integer.toString(temp);
        
       
        
        check=(tek + cift)%10;
        if(check != 0){
            check=10-check;
        }else if(check == 0){
            check = 0;
        }
        
        return imei_no +Integer.toString(check) ;
          
    }
    
    public boolean kontrol(String value){
        if(value.length()!=15) return false;
        
        tek=0;
        cift=0;
        check=0;
        temp=0;
        value+="0";
        char[] str = value.toCharArray();
        for(int i = 0 ; i<15; i+=2){
           // System.out.print(value[i]);
           
           tek += Integer.parseInt(String.valueOf(str[i]));
           temp = ((Integer.parseInt(String.valueOf(str[i+1])))*2);
           cift += temp/10+temp%10;
           
        }
        if(((tek+cift)%10)==0){
            return true;
        }else 
           return false;
    }
    
    
}
