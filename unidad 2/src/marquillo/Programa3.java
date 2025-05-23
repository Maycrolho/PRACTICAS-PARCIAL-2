/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package marquillo;

import javax.swing.JOptionPane;


/*Hacer un programa que lea nombre y edad previa mente validados. El programa mostrara el prosible año de nacimiento*/
public class Programa3 {
    static String edad;
    static String nombre;
 
    public static void main(String[] args) {
        nombre =  JOptionPane.showInputDialog("¿Cual es tu nombre?");
        validarNombre();
        edad = JOptionPane.showInputDialog("¿Cual es tu edad?");
        validarEdad();
    }
    static void validarNombre(){
        int c = 0;
        for (int i = 0; i < nombre.length(); i++) {
            if ((nombre.codePointAt(i) >= 65 && nombre.codePointAt(i) <= 90)
                ||(nombre.codePointAt(i) >= 97 && nombre.codePointAt(i) <= 122)
                || nombre.codePointAt(i) == 32){
              c++;
            }
        }
        if (c == nombre.length()){
            System.out.println("Nombre correcto");
        }else{
            System.out.println("Tu nombre no solo contiene letras");
            System.exit(0);
        }
    }
    static void validarEdad(){
        int c = 0;
        for (int i = 0; i < edad.length(); i++) {
            if (edad.codePointAt(i) >= 48 && edad.codePointAt(i) <= 57){ 
            c++;
            }
        }
        if (c == edad.length()){
         System.out.println("La edad es correcta");
     }else {
         System.out.println("La edad no es correcta");
         System.exit(0);
     }
    }
}


