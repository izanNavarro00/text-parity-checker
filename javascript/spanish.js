function esPar(texto) {
    if (!texto || texto.trim() === "") return false;
    
    const palabras = texto.toLowerCase().trim().split(/\s+/);
    const ultima = palabras[palabras.length - 1];
    
    const impares = ["uno", "tres", "trés", "cinco", "siete", "nueve", "once", "trece", "quince", "diecisiete", "diecinueve"];
    
    return !impares.some(impar => ultima.endsWith(impar));
}
