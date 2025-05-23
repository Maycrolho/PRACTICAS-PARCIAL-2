/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

import javax.swing.JOptionPane;

/**
 *
 * @author Marco Antonio
 */
public class clase2 {
    public static void main(String[] args) {
        String res = "s";
          
        while (res.equals("s")) {
            String a = JOptionPane.showInputDialog("Escribe un número");
            
            if (validarNumeros(a)) {
                int x = Integer.parseInt(a);
                if (x % 2 == 0) {
                    division(x);
                } else {
                    float b = (float) x;
                    division(b);
                }
            }
            
           int respuesta = JOptionPane.showConfirmDialog(null, "Quieres volver a correrlo","confirmacion",JOptionPane.YES_NO_OPTION);
            if(respuesta == JOptionPane.YES_OPTION){
                res= "s";
            }else if (respuesta==JOptionPane.NO_OPTION){
                res = "n";
            }       
        }
    }

    // Sobrecarga de métodos
    static void division(int a) {
        JOptionPane.showMessageDialog(null, (a / 2));
    }

    static void division(float b) {
        JOptionPane.showMessageDialog(null, (b / 2));
    }

    static boolean validarNumeros(String a) {
        int c = 0;
        boolean r = false;

        for (int i = 0; i < a.length(); i++) {
            if (a.codePointAt(i) >= 48 && a.codePointAt(i) <= 57) { // 48-57 son los códigos ASCII de '0' a '9'
                c++;
            }
        }

        if (c == a.length()) {
            System.out.println("Sí, son números");
            r = true;
        } else {
            System.out.println("No todos son números");
            JOptionPane.showMessageDialog(null, "No todos son números");
            r = false;
        }

        return r;
    }
}
