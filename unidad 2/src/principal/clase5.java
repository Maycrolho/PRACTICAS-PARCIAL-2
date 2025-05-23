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
public class clase5 {
    public static void main(String[] args) {
     //1.1
        String n = JOptionPane.showInputDialog("Introduce un correo");
        //if(ValidarNumerosDecimales(n)){
        //  JOptionPane.showMessageDialog(null, "Si es un numero con decimales");
        //}else{
        //JOptionPane.showMessageDialog(null, "No es un numero con decimales");
        if (ValidarCorreo(n)) {
            JOptionPane.showMessageDialog(null, "Si es un correo valido");
        } else {
            JOptionPane.showMessageDialog(null, "No es un correo valido");
        }

    }

    static boolean ValidarCorreo(String a) {
        //a@a.com
        boolean r = false;
        int c = 0;
        for (int i = 0; i < a.length(); i++) {
            if (a.codePointAt(i) == 64) {
                c++;
            }
        }
        if (c != 1) {
            r = false;
        } else {
            System.out.println("Por el momento si es valido");
            int p = a.indexOf("@");
            String c1 = a.substring(0, p); //a-z 0-9 - _
            String c2 = a.substring(p + 1, a.length()); //a -z .com
            System.out.println(c1 + " " + c2);
            if (c1.length() > 1 && c2.length() > 5) {
                int cn = 0;
                for (int i = 0; i < c1.length(); i++) {
                    if ((c1.codePointAt(i) >= 97 && c1.codePointAt(i) <= 122)
                            || (c1.codePointAt(i) == 45)
                            || (c1.codePointAt(i) == 95)) {
                        cn++;
                    }
                }
                int pcom = c2.indexOf(".com");
                if (pcom != -1) {
                    String c3 = c2.substring(c2.length() - 4, c2.length());
                    System.out.println("COM: " + c3);
                    if (c3.endsWith(".com")) {
                        String c4 = c2.substring(0, pcom);
                        if (c4.length() > 1) {
                            for (int i = 0; i < c4.length(); i++) {
                                if ((c4.codePointAt(i) >= 97 && c4.codePointAt(i) <= 122)) {
                                    cn++;
                                }
                            }
                            if (cn == (c4.length() + c1.length())) {
                                r = true;
                            }
                        }
                    }
                } else {
                    r = false;
                }
            } else {
                r = false;
            }
        }
        return r;
    }
}
