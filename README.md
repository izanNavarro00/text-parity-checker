# ⚡ O(1) Text Parity Checker (Fast Word Parity)

A zero-dependency, highly optimized algorithm to determine if a written number (in English or Spanish) is even or odd. 

Instead of parsing entire strings into integers using heavy Natural Language Processing (NLP) libraries, this algorithm uses a **linguistic shortcut**: it only checks the suffix of the last word.

## 🚀 Why use this?
* **O(1) Complexity:** It executes in microseconds. It doesn't matter if the string is `"ten"` or `"three hundred thousand trillion and four"`.
* **Zero Overflow Limits:** Standard string-to-int parsers fail with massive numbers. This algorithm handles infinitely large numbers because it never converts text to math.
* **Zero Dependencies:** No heavy libraries. Just pure, native string manipulation.
* **Memory Efficient:** Ideal for low-latency systems, bots, or embedded devices (C++, IoT).

## 🧠 How it works
Mathematically and linguistically, the parity of a spelled-out number is strictly determined by its final word. 
The algorithm simply extracts the last word and checks if it ends with any of the core "odd" suffixes (e.g., *one, three, five* / *uno, tres, cinco*). If it doesn't, the number is even by definition (including magnitudes like *million/millón*).

---

# 🇪🇸 Versión en Español

Un algoritmo ultrarrápido y sin dependencias para determinar si un número escrito en texto es par o impar.

En lugar de usar librerías complejas de Procesamiento de Lenguaje Natural (NLP) para convertir el texto a números enteros, este algoritmo aplica un **atajo lingüístico**: solo evalúa la terminación de la última palabra.

## 🚀 ¿Por qué usarlo?
* **Complejidad O(1):** Se ejecuta en microsegundos. Tarda lo mismo en procesar `"diez"` que `"trescientos mil trillones cuarenta"`.
* **Inmune al Desbordamiento (Overflow):** Los conversores tradicionales fallan con números gigantes por falta de memoria. Este algoritmo soporta números infinitos porque nunca hace conversiones matemáticas.
* **Cero Dependencias:** Código nativo puro. Ideal para sistemas embebidos, Arduino o bots de alta concurrencia.

## 🧠 ¿Cómo funciona?
Tanto matemática como gramaticalmente, la paridad de un número escrito está determinada exclusivamente por su última palabra. 
El algoritmo extrae la palabra final y comprueba si termina en alguno de los sufijos "impares" base (del 1 al 19). Si no coincide con ninguno, por descarte lógico y gramatical, el número es par (esto incluye magnitudes como *mil, millón, billón*).

## 📂 Languages Supported / Lenguajes Soportados
* Python (`/python`)
* JavaScript / Node.js (`/javascript`)
* C++ (`/cpp`)
* Java (`/java`)

## 🤝 Contributing
Feel free to open a Pull Request to add more programming languages or adapt the logic to other spoken languages (French, German, etc.)!
