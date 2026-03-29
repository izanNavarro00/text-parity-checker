// Fast Word Parity Algorithm
// Author: izanNavarro00 | https://github.com/izanNavarro00/text-parity-checker
// License: MIT
public class SpanishParity {
    public static boolean esPar(String texto) {
        if (texto == null || texto.trim().isEmpty()) return false;
        
        String[] palabras = texto.toLowerCase().trim().split("\\s+");
        String ultima = palabras[palabras.length - 1];
        String[] impares = {"uno", "tres", "trés", "cinco", "siete", "nueve", "once", "trece", "quince", "diecisiete", "diecinueve"};

        for (String impar : impares) {
            if (ultima.endsWith(impar)) return false; // Si termina en impar, NO es par
        }
        return true; // Si no coincidió con ningún impar, es par
    }
}
