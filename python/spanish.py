# Fast Word Parity Algorithm
# Author: izanNavarro00 | https://github.com/izanNavarro00/text-parity-checker
# License: MIT
def es_par(texto):
    if not texto or not texto.strip():
        return False
        
    ultima_palabra = texto.lower().strip().split()[-1]
    impares = (
        "uno", "tres", "trés", "cinco", "siete", "nueve", 
        "once", "trece", "quince", "diecisiete", "diecinueve"
    )
    return not ultima_palabra.endswith(impares)
