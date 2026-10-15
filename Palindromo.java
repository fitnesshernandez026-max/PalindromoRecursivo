package Palindromo;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Pablo
 */

public class Palindromo {
    
    private boolean esPalindromoAuxiliar(String cadenaLimpia, int izq, int der) {
        if (izq >= der) {
            return true;
        }
        
        if (cadenaLimpia.charAt(izq) != cadenaLimpia.charAt(der)) {
            return false;
        }
        
        return esPalindromoAuxiliar(cadenaLimpia, izq + 1, der - 1);
    }

    public boolean esPalindromo(String texto) {
       
        String cadenaLimpia = texto.toLowerCase().replaceAll("[^a-z0-9]", "");
        return esPalindromoAuxiliar(cadenaLimpia, 0, cadenaLimpia.length() - 1);
    }

    public static void main(String[] args) {
        Palindromo prueba = new Palindromo();
        
        System.out.println("¿Es palíndromo 'reconocer'? " + prueba.esPalindromo("reconocer"));
        System.out.println("¿Es palíndromo 'casa'? " + prueba.esPalindromo("casa"));
        System.out.println("¿Es palíndromo 'x'? " + prueba.esPalindromo("x"));
        System.out.println("¿Es palíndromo cadena vacía? " + prueba.esPalindromo(""));
    }
}