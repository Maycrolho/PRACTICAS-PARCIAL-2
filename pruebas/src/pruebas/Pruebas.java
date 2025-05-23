/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebas;

import javax.swing.JOptionPane;

/**
 *
 * @author Marco Antonio
 */
public class Pruebas {

    /**
     * @param args the command line arguments
     */

    
    vocales obj = new vocales ();
     
    
    public boolean ValidarLetras(String a) {
        int c = 0;
        boolean ban = false;
        for (int i = 0; i < a.length(); i++) {
            if ((a.codePointAt(i) >= 65 && a.codePointAt(i) <= 90) ||  
                (a.codePointAt(i) >= 97 && a.codePointAt(i) <= 122) ||  
                (a.codePointAt(i) == 32)) {  
                c++;
            }
        }
        if (c == a.length()) {
            ban = true;
        }
        return ban;
    }

    public int Conarletras(String a) { // CAMBIADO: Ahora este método solo muestra errores
        int c = 0;
        boolean ban = false;
    
        for (int i = 0; i < a.length(); i++) {
            if (a.codePointAt(i) >= 48 && a.codePointAt(i) <= 57) {  // Detecta números (0-9)
                JOptionPane.showMessageDialog(null, "Error: Se ingresó un número");
                 // Termina el método sin contar letras
            }
        }
        JOptionPane.showMessageDialog(null, "El texto ingresado es válido."); // Mensaje si es correcto
        
   return c ; 
}

     
        
        public boolean validarMAYUSCULAS(String a) {
    int c = 0;
    boolean ban = true; // Lo inicializamos en true

    for (int i = 0; i < a.length(); i++) {
        if (a.codePointAt(i) >= 97 && a.codePointAt(i) <= 122) { 
            c++;
        } else { 
            ban = false; // Si encuentra un carácter que no es minúscula, retorna false
        }
    }

    if (c == a.length()) {
        JOptionPane.showMessageDialog(null, "Es correcto, son minúsculas.");
    } else {
        JOptionPane.showMessageDialog(null, "Es incorrecto, no son solo minúsculas.");
    }

    return ban;
}

        

        
    
     
    
    
       
 
        
        public boolean validarMinusculas(String a) {
    int c = 0;
    boolean ban = true; // Lo inicializamos en true

    for (int i = 0; i < a.length(); i++) {
        if (a.codePointAt(i) >= 97 && a.codePointAt(i) <= 122) { 
            c++;
        } else { 
            ban = false; // Si encuentra un carácter que no es minúscula, retorna false
        }
    }

    if (c == a.length()) {
        JOptionPane.showMessageDialog(null, "Es correcto, son minúsculas.");
    } else {
        JOptionPane.showMessageDialog(null, "Es incorrecto, no son solo minúsculas.");
    }

    return ban;
}
}
        

        
    
     
    
    
       
            
            
        
        
      

