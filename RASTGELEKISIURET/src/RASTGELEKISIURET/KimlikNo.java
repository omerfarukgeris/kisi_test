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
public class KimlikNo {
   public String no;
    
 public KimlikNo(){
     no = uret();
 
 }
    
    
    private int tek, cift, temp, check10, check11;
    private  String uret(){
        String no="";
       
        Random r = new Random(); 
       
        
        
        temp = r.nextInt(9)+1;
        tek = temp;
        no = Integer.toString(temp);
        
        temp = r.nextInt(10);
        cift = temp;
        no += Integer.toString(temp);
        
         temp = r.nextInt(10);
        tek += temp;
        no += Integer.toString(temp);
        
        temp = r.nextInt(10);
        cift += temp;
        no += Integer.toString(temp);
        
           temp = r.nextInt(10);
        tek += temp;
        no += Integer.toString(temp);
        
        temp = r.nextInt(10);
        cift += temp;
        no += Integer.toString(temp);
        
         temp = r.nextInt(10);
        tek += temp;
        no += Integer.toString(temp);
        
        temp = r.nextInt(10);
        cift += temp;
        no += Integer.toString(temp);
        
         temp = r.nextInt(10);
        tek += temp;
        no += Integer.toString(temp);
      
        
   
        
       
        
        check10=(tek*7 - cift)%10;
        check11=(tek+cift+check10)%10;
  
                
               
        return no +Integer.toString(check10) + Integer.toString(check11) ;
          
    }
    
    public boolean kontrol(String value){
        if(value.length()!=11) return false;
        
        tek=0;
        cift=0;
        
        temp=0;
        
        char[] str = value.toCharArray();
        for(int i = 0 ; i<10; i+=2){
           // System.out.print(value[i]);
           
           tek += Integer.parseInt(String.valueOf(str[i]));
           if(i==8)break;
           cift += Integer.parseInt(String.valueOf(str[i+1]));
           
        }
        check10 = Integer.parseInt(String.valueOf(str[9]));
        check11 = Integer.parseInt(String.valueOf(str[10]));

        if(((tek*7-cift)%10)==check10 && ((tek+cift+check10)%10 == check11)){
            return true;
        }else 
           return false;
    }
    
}
