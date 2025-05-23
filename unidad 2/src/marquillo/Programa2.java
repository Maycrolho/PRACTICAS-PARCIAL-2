/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package marquillo;
import javax.swing.JOptionPane;

/**
 *
 *
 */
public class Programa2 {
    static String a;
    public static void main(String[] args) {
        a = JOptionPane.showInputDialog("Escribe un numero"); 
        
        validarNombre();
        validarNumero();
    }
    static void validarNombre(){
        int c = 0;
      
        if(c==a.length()){
            System.out.println("Son letras y espacios correctos");
            System.out.println("Nobre correcto");
        }else{
            System.out.println("No puede ser un nombre ");
        }
    }
    static void validarNumero(){
     int c = 0;
     for (int i = 0; i < a.length(); i++) { //Ciclo ford para poder leer cada caracter de lo que ingresamos 
     //System.out.println(a.codePointAt(i));
     if (a.codePointAt(i) >= 48 && a.codePointAt(i) <= 57){ // Transfor cada caracter a codigo asqui para verificar
         c++; //genera contador para contener cada caracter    si lo que se introdujo es correcto.
     }
     }
     if (c == a.length()){ // Si el contador "c" es comparado con el length para ver el resultado
         System.out.println("Si son numeros");
     }else {
         System.out.println("No todos son numeros");
     }
    }
}
