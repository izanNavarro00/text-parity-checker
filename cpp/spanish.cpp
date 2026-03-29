// Fast Word Parity Algorithm
// Author: izanNavarro00 | https://github.com/izanNavarro00/text-parity-checker
// License: MIT
#include <iostream>
#include <vector>
#include <string>

bool esPar(std::string texto) {
    if (texto.empty()) return false;
    
    std::string ultima = texto.substr(texto.find_last_of(" ") + 1);
    std::vector<std::string> impares = {"uno", "tres", "trés", "cinco", "siete", "nueve", "once", "trece", "quince", "diecisiete", "diecinueve"};
    
    for (const std::string& impar : impares) {
        if (ultima.size() >= impar.size() && 
            ultima.compare(ultima.size() - impar.size(), impar.size(), impar) == 0) {
            return false; // Si coincide con un impar, no es par
        }
    }
    return true;
}
