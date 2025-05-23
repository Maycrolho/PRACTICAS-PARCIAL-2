/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package marquillo;

import javax.swing.JOptionPane;


public class Programa1 {
    static int a ,b; //Si la variable se encuenta aqui la puede usar toda la classe
    //pero si esta dentro del static void main no dejara.
    public static void main(String[] args) {
        a = Integer.parseInt(JOptionPane.showInputDialog("Escribe un numero"));
        b = Integer.parseInt(JOptionPane.showInputDialog("Escribe un numero"));
        Suma();
    }
    static void Suma(){
        System.out.println(a + b);
        Resta();
    }
    static void Resta(){
        System.out.println(a - b);
        Multiplicacion();
    }
    static void Multiplicacion (){
        System.out.println(a * b);
        Division();
    }
    static void Division(){
        System.out.println(a / b);
    }
}
