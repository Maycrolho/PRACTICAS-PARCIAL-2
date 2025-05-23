/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

/**
 *
 * @author Marco Antonio
 */
public class clase3 {
    public static void main(String[] args) {
      String Nombre = "marquillo" ;
        //0-9  10
        //simbolos 33-47  14
        // 58- 64  6
        // 92 y 96  \ y _   2
       String Otra = (Encriptador(Nombre));
        //Desencriptador(Otra);
    }

    static String Desencriptador(String a) {
        String codigo = "";
        for (int i = 0; i < a.length(); i++) {
            

            switch (a.codePointAt(i)) {
                case 48:
                    codigo = codigo + "a";  
                    break;
                case 49:
                    codigo = codigo + "b";  
                    break;
                case 50:
                    codigo = codigo + "c";  
                    break;
                case 51:
                    codigo = codigo + "d"; 
                    break;
                case 52:
                    codigo = codigo + "e";  
                    break;
                case 53:
                    codigo = codigo + "f"; 
                    break;
                case 54:
                    codigo = codigo + "g";  
                    break;
                case 55:
                    codigo = codigo + "h";  
                    break;
                case 56:
                    codigo = codigo + "i";  
                    break;
                case 57:
                    codigo = codigo + "j";  
                    break;
                case 33:
                    codigo = codigo + "k";  
                    break;
                case 34:
                    codigo = codigo + "l";  
                    break;
                case 35:
                    codigo = codigo + "m";  
                    break;
                case 36:
                    codigo = codigo + "n";  
                    break;
                case 37:
                    codigo = codigo + "o";  
                    break;
                case 38:
                    codigo = codigo + "p";  
                    break;
                case 39:
                    codigo = codigo + "q";  
                    break;
                case 40:
                    codigo = codigo + "(r";  
                    break;
                case 41:
                    codigo = codigo + "s";  
                    break;
                case 42:
                    codigo = codigo + "t";  
                    break;
                case 43:
                    codigo = codigo + "u";  
                    break;
                case 44:
                    codigo = codigo + "v"; 
                    break;
                case 45:
                    codigo = codigo + "w";  
                    break;
                case 46:
                    codigo = codigo + "x"; 
                    break;
                case 47:
                    codigo = codigo + "y";  
                    break;
                case 58:
                    codigo = codigo + "z";  
                    break;
            }

        }

        return codigo;
    }
    

      static String Encriptador(String a) {
        String codigo = "";
        a = a.toLowerCase();
        for (int i = 0; i < a.length(); i++) {
            System.out.println(a.charAt(i));

            switch (a.codePointAt(i)) {
                case 97:
                    codigo = codigo + "0"; 
                    break;
                case 98:
                    codigo = codigo + "1"; 
                    break;
                case 99:
                    codigo = codigo + "2"; 
                    break;
                case 100:
                    codigo = codigo + "3"; 
                    break;
                case 101:
                    codigo = codigo + "4";  
                    break;
                case 102:
                    codigo = codigo + "5";  
                    break;
                case 103:
                    codigo = codigo + "6"; 
                    break;
                case 104:
                    codigo = codigo + "7";  
                    break;
                case 105:
                    codigo = codigo + "8";  
                    break;
                case 106:
                    codigo = codigo + "9";  
                    break;
                case 107:
                    codigo = codigo + "!";  
                    break;
                case 108:
                    codigo = codigo + '"';  
                    break;
                case 109:
                    codigo = codigo + "#";  
                    break;
                case 110:
                    codigo = codigo + "$";  
                    break;
                case 111:
                    codigo = codigo + "%";  
                    break;
                case 112:
                    codigo = codigo + "&";  
                    break;
                case 113:
                    codigo = codigo + "'";  
                    break;
                case 114:
                    codigo = codigo + "(";  
                    break;
                case 115:
                    codigo = codigo + ")";  
                    break;
                case 116:
                    codigo = codigo + "*";  
                    break;
                case 117:
                    codigo = codigo + "+";  
                    break;
                case 118:
                    codigo = codigo + ",";  
                    break;
                case 119:
                    codigo = codigo + "-";  
                    break;
                case 120:
                    codigo = codigo + ".";  
                    break;
                case 121:
                    codigo = codigo + "/";  
                    break;
                case 122:
                    codigo = codigo + ":";  
                    break;
            }

        }

        return codigo;
    }
}
