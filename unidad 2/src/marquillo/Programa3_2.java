/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package marquillo;

import java.time.LocalDate;
import javax.swing.JOptionPane;


public class Programa3_2 {
    static LocalDate fechaActual = LocalDate.now();
    static int anio, mes, dia, edad;
    static String nombre, eda;
    public static void main(String[] args) {
        fechaSistema();
        nombre = JOptionPane.showInputDialog("¿Cual es tu nombre?");
        validarNombre();
        eda = JOptionPane.showInputDialog("¿Cual es tu edad?");
        validarNumeros();
    }
    static void fechaSistema(){
        anio = fechaActual.getYear(); //año del sistema
        mes = fechaActual.getMonthValue(); //mes del sistema
        dia = fechaActual.getDayOfMonth(); //dia del sistema 
        //JOptionPane.showConfirmDialog(null,"AÑo "+ anio);
        //JOptionPane.showConfirmDialog(null,"Mes "+ mes);
        //JOptionPane.showConfirmDialog(null,"Día "+ dia);
    }
    static void validarNombre(){
        int c = 0;
        for (int i = 0; i < nombre.length(); i++) {
            if ((nombre.codePointAt(i)>=65 && nombre.codePointAt(i)<=90)
                   ||(nombre.codePointAt(i)>=97 && nombre.codePointAt(i)<=122)
                   || nombre.codePointAt(i)==32){
                c++;
            }
        }
        if(c==nombre.length()){
            System.out.println("Son letras y espacios");
            System.out.println("Nombre correcto");
        }else{
            System.out.println("No puede ser un nombre");
            System.exit(0);
        }
    }
    static void validarNumeros(){
        int c = 0;
        for (int i = 0; i < eda.length(); i++) {
            if(eda.codePointAt(i)>=48 && eda.codePointAt(i)<=57){
                c++;
            }
        }
        if(c==eda.length()){
            System.out.println("Si son numeros");
            System.out.println("Edad correcta");
            int b = Integer.parseInt(eda);
            edad = anio - b;
            JOptionPane.showMessageDialog(null, "El año de nacimiento es: \n"+edad);
        }else{
            System.out.println("No todos son numeros");
            System.exit(0);
        }
    }
}
