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
public class clase4 {
    public static void main(String[] args) {
        
    
    
    
    
     //1.1
        String n = JOptionPane.showInputDialog("Escribe un numero con decimales");
        if (ValidarNumerosDecimales(n)) {
            JOptionPane.showMessageDialog(null, "Si es un numero con decimales");
        } else {
            JOptionPane.showMessageDialog(null, "No es un numero con decimales");
        }

    }

    static boolean ValidarNumerosDecimales(String a) {
        boolean r = false;
        int c = 0;
        int cn = 0;
        int p = 0;
        for (int i = 0; i < a.length(); i++) {
            if (a.codePointAt(i) == 46) {
                c++;
                p = i;
            }

        }
        if (c != 1) {
            r = false;

        } else {
            // JOptionPane.showMessageDialog(null,"el punto esta : "+p);

            if (p == 0) {
                a = "0" + a;
            }
            if (p == a.length() - 1) {
                a = a + "0";
            }
            for (int i = 0; i < a.length(); i++) {
                System.out.println(a.charAt(i));
                if (a.codePointAt(i) >= 48 && a.codePointAt(i) <= 57 || a.codePointAt(i) == 46) {

                }
            }
            if (cn == a.length()) {
                r = true;
            }
        }
        return r;
    }

}

