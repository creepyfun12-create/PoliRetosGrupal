package PoliRetosDavid;

public class SerieNumerica9 {
    /**
     * Genera la serie numérica de los múltiplos de 2^n hasta un número de términos dado por el usuario.
     * * @param nroTermino: número de términos a mostrar en la serie numérica
     *  2, 4, 8, 16, 32, 64, 128, 256, 512, 1024 ...
     */

    public void SerieEjer9(int nroTermino) {
        for (int i = 0; i < nroTermino; i++)
            System.out.print((int) Math.pow(2, i + 1) + " ");
        System.out.println("");
}
    // SerieNumerica9 mediante Do-While
    public void SerieEjer9DoWhile(int nroTermino) {
        int i = 0;
        do {
            System.out.print((int) Math.pow(2, i + 1) + " ");
            i++;
        } while (i < nroTermino);
        System.out.println("");
    }
    // SerieNumerica9 mediante While
    public void SerieEjer9While(int nroTermino) {
        int i = 0;
        while (i < nroTermino) {
            System.out.print((int) Math.pow(2, i + 1) + " ");
            i++;
        }
        System.out.println("");
    }
}
