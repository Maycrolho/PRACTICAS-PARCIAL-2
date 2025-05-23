/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package marquillo;
import java.time.LocalDate; //Libreria para obtener fecha del sistema
import javax.swing.JOptionPane;


public class Programa3_2_1 {
    //Lo que se declara aqui es de dominio publico 
    static LocalDate fechaActual = LocalDate.now(); //Objeto de la fecha del sistema 
    static int anio, mes, dia, edad;
    
    public static void main(String[] args) {
        //Lo que se declara aqui es de dominio privado 
        String nombre, eda; 
        fechaSistema();
        nombre = JOptionPane.showInputDialog("¿Cual es tu nombre?");
        if (validarNombre(nombre)){ //Validar el satatic
            eda = JOptionPane.showInputDialog("¿Cual es tu edad?");
            if(validarNumeros(eda)){
                 int b = Integer.parseInt(eda);
                 edad = anio - b; //Sacar el año 
                 JOptionPane.showMessageDialog(null, "El año de nacimiento es: \n"+edad); 
            }
        }  
    }
    static void fechaSistema(){
        anio = fechaActual.getYear(); //año del sistema
        mes = fechaActual.getMonthValue(); //mes del sistema
        dia = fechaActual.getDayOfMonth(); //dia del sistema 
        //JOptionPane.showConfirmDialog(null,"AÑo "+ anio);
        //JOptionPane.showConfirmDialog(null,"Mes "+ mes);
        //JOptionPane.showConfirmDialog(null,"Día "+ dia);
    }
    static boolean validarNombre(String nombre){
        boolean r;//baribable boolena para ver si es correcto
        int c = 0; //Contador que verifica que sean letras 
        for (int i = 0; i < nombre.length(); i++) { //Siclo for que mira cada caracter 
            if ((nombre.codePointAt(i)>=65 && nombre.codePointAt(i)<=90) //Verifiaca si es una letra pero minusculas 
                   ||(nombre.codePointAt(i)>=97 && nombre.codePointAt(i)<=122) //Verifica si es una letra pero mayusculas 
                   || nombre.codePointAt(i)==32){ //Verifica si es un espacio o si tiene espacio 
                c++;
            }
        }
        if(c==nombre.length()){ //si en el contador solo esta lo asignado continua la operacion 
            System.out.println("Son letras y espacios");
            System.out.println("Nombre correcto");
            r = true; // Si el dato es verdadero lo lleva 
        }else{ //Si el contador encunetra un error no sigue 
            System.out.println("No puede ser un nombre");
            System.exit(0);
            r =  false; //Si el dato es falso no lo lleva 
        }
        return r;//Retorno para poder llevar el static hacia arriva 
    }
    static boolean validarNumeros(String eda){
        boolean r;
        int c = 0;
        for (int i = 0; i < eda.length(); i++) {
            if(eda.codePointAt(i)>=48 && eda.codePointAt(i)<=57){
                c++;
            }
        }
        if(c==eda.length()){
            System.out.println("Si son numeros");
            r = true;
        }else{
            System.out.println("No todos son numeros");
            System.exit(0);
            r = false;
        }
        return r;//Retorno para poder llevar el static hacia arriva 
    }
}
