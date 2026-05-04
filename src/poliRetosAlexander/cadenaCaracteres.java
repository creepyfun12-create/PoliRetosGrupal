package poliRetosAlexander;

public class cadenaCaracteres {

    public String cadenaInvertida (String frase) {
        String resultado = "";
        frase = frase.toLowerCase();

        for (int i = frase.length() - 1; i >= 0; i--) {
            char c = frase.charAt(i);
            
            if ("aeiou".indexOf(c) >= 0) {
                resultado += Character.toUpperCase(c);
            } else {
                resultado += c;
            }
        }
        return resultado;
    }
}
