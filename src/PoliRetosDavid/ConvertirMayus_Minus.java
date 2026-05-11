package PoliRetosDavid;

public class ConvertirMayus_Minus {
    /**
     * Ejercicio 9.4: Escribe un programa que convierta las letras de una frase a mayusculas y minusculas alternadamente.
     * frase: "di mi nombre"
     * salida: "Di Mi NoMbRe"
     ** @prompt "Ingrese una frase: "
    */
   public String convertirMayusMinus(String frase){
        String resultado = "";
        for (int i = 0; i < frase.length(); i++) {
            char letra = frase.charAt(i);
            if (i % 2 == 0) {
                resultado += Character.toUpperCase(letra);
            } else {
                resultado += Character.toLowerCase(letra);
            }
        }
        return resultado;
    }
    // convertirMayusMinus mediante Do-While
    public String convertirMayusMinusDoWhile(String frase){
        String resultado = "";
        int i = 0;
        do {
            char letra = frase.charAt(i);
            if (i % 2 == 0) {
                resultado += Character.toUpperCase(letra);
            } else {
                resultado += Character.toLowerCase(letra);
            }
            i++;
        } while (i < frase.length());
        return resultado;
    }
    // convertirMayusMinus mediante While
    public String convertirMayusMinusWhile(String frase){
        String resultado = "";
        int i = 0;
        while (i < frase.length()) {
            char letra = frase.charAt(i);
            if (i % 2 == 0) {
                resultado += Character.toUpperCase(letra);
            } else {
                resultado += Character.toLowerCase(letra);
            }
            i++;
        }
        return resultado;
    }
}
