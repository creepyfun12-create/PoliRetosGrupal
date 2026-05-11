package PoliRetosDavid;

public class SerieLetras {
    /** Generar serie de letras alternas fibonnacci del alfabeto hasta un número de términos dado por el usuario.
     * a b c dd eee fffff gggggggg ...
     * @param nroTerminos: número de términos a mostrar en la serie de letras alternas
     */
    public void mostrarLetrasAlternas(int nroTerminos){
        char letra = 'a';
        int prev = 0, curr = 0;
        for (int i = 1; i < nroTerminos; i++) {
            int rep = (i == 1 || i == 2) ? 1 : prev + curr;
            for (int j = 0; j < rep; j++) {
                System.out.print(letra);
            }
            System.out.print(" ");
            letra++;
            if (i >= 2) {
                prev = curr;
                curr = rep;
            }
        }
        System.out.println("");
    }
    // SerieLetras mediante Do-While
    public void mostrarLetrasAlternasDoWhile(int nroTerminos){
        char letra = 'a';
        int prev = 0, curr = 0;
        int i = 1;
        do {
            int rep = (i == 1 || i == 2) ? 1 : prev + curr;
            for (int j = 0; j < rep; j++) {
                System.out.print(letra);
            }
            System.out.print(" ");
            letra++;
            if (i >= 2) {
                prev = curr;
                curr = rep;
            }
            i++;
        } while (i < nroTerminos);
        System.out.println("");
    }
    // SerieLetras mediante While
    public void mostrarLetrasAlternasWhile(int nroTerminos){
        char letra = 'a';
        int prev = 0, curr = 0;
        int i = 1;
        while (i < nroTerminos) {
            int rep = (i == 1 || i == 2) ? 1 : prev + curr;
            for (int j = 0; j < rep; j++) {
                System.out.print(letra);
            }
            System.out.print(" ");
            letra++;
            if (i >= 2) {
                prev = curr;
                curr = rep;
            }
            i++;
        }
        System.out.println("");
    }

}




