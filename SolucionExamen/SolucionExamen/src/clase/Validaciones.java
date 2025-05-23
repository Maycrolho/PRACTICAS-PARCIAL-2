/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase;

/**
 *
 * @author ROASUS
 */
public class Validaciones {
    
    public boolean ValidarLetras(String a){
      int c=0;
      boolean ban = false;
        for (int i = 0; i < a.length(); i++) {
            if((a.codePointAt(i)>=67 && a.codePointAt(i)<=90)||
                    (a.codePointAt(i)>=97 && a.codePointAt(i)<=122)||
                    (a.codePointAt(i)==32)){
               c++;
            }
        }
    if (c == a.length()){
       ban =true;
    }else{
      ban = false;
    }
    
    return ban;
    }
    
    
    
    public int Conarletras(String a){
      int c=0;
      boolean ban = false;
        for (int i = 0; i < a.length(); i++) {
            if((a.codePointAt(i)>=67 && a.codePointAt(i)<=90)||
                    (a.codePointAt(i)>=97 && a.codePointAt(i)<=122)){
               c++;
            }
        }
    return c;
    }
    public int Conarmayusculas(String a){
      int c=0;
      boolean ban = false;
        for (int i = 0; i < a.length(); i++) {
            if((a.codePointAt(i)>=67 && a.codePointAt(i)<=90)){
               c++;
            }
        }
    return c;
    }
     public int Conarminusculas(String a){
      int c=0;
      boolean ban = false;
        for (int i = 0; i < a.length(); i++) {
            if((a.codePointAt(i)>=97 && a.codePointAt(i)<=122)){
               c++;
            }
        }
    return c;
    }
}
