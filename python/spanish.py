def es_par(texto):
    if not texto or not texto.strip():
        return False
        
    ultima_palabra = texto.lower().strip().split()[-1]
    impares = (
        "uno", "tres", "trés", "cinco", "siete", "nueve", 
        "once", "trece", "quince", "diecisiete", "diecinueve"
    )
    return not ultima_palabra.endswith(impares)
