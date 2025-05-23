package principal;

import javax.swing.JOptionPane;

public class Principal {

    public static void main(String[] args) {
        String r = "";
        while (!r.equals("5")) {  // Corregí la condición para salir cuando el usuario elija '5'
            r = menu();
            if (r.equals("1")) {
                JOptionPane.showInputDialog(null, "Suma");
                leerdatos(r);
            } else if (r.equals("2")) {
                JOptionPane.showInputDialog(null, "Resta");
                leerdatos(r);
            } else if (r.equals("3")) {
                JOptionPane.showInputDialog(null, "Multiplicación");
                leerdatos(r);
            } else if (r.equals("4")) {
                JOptionPane.showInputDialog(null, "División");
                leerdatos(r);
            } else if (r.equals("5")) {
                System.exit(0);  // Sale del programa
            } else {
                JOptionPane.showMessageDialog(null, "Opción no válida\nVuelve a intentarlo");
            }
        }
    }

    // Método para validar si la entrada es un número
    static boolean validarNumeros(String v) {
        try {
            Integer.parseInt(v); // Intenta convertir la entrada en un número entero
            return true;
        } catch (NumberFormatException e) {
            return false;  // Si no es un número válido, devuelve falso
        }
    }

    // Método para leer los datos y realizar las operaciones
    static String leerdatos(String r) {
        String a = JOptionPane.showInputDialog("Escribe un número:");
        if (validarNumeros(a)) {
            String b = JOptionPane.showInputDialog("Escribe otro número:");
            if (validarNumeros(b)) {
                realizarOperacion(a, b, r);
            } else {
                JOptionPane.showMessageDialog(null, "Error en el número 2");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Error en el número 1");
        }
        return "";
    }

    // Método para realizar las operaciones según la opción seleccionada
    static void realizarOperacion(String a, String b, String operacion) {
        int num1 = Integer.parseInt(a);
        int num2 = Integer.parseInt(b);
        int resultado = 0;

        switch (operacion) {
            case "1":  // Suma
                resultado = num1 + num2;
                break;
            case "2":  // Resta
                resultado = num1 - num2;
                break;
            case "3":  // Multiplicación
                resultado = num1 * num2;
                break;
            case "4":  // División
                if (num2 != 0) {
                    resultado = num1 / num2;
                } else {
                    JOptionPane.showMessageDialog(null, "No se puede dividir por cero");
                    return;
                }
                break;
            default:
                JOptionPane.showMessageDialog(null, "Operación no válida");
                return;
        }
        JOptionPane.showMessageDialog(null, "Resultado: " + resultado);
    }

    // Método de menú para seleccionar la operación
    static String menu() {
        String op = JOptionPane.showInputDialog("1.- Suma\n2.- Resta\n3.- Multiplicación\n4.- División\n5.- Salir");
        return op;
    }
}
