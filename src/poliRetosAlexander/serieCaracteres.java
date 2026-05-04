package poliRetosAlexander;

public class serieCaracteres {

    private int numTerminos;

    public serieCaracteres (int numTerminos) {
        this.numTerminos = numTerminos;
    }  

    public void serieLetra() {
        char letra = 'a';
        for (int i = 0; i < numTerminos; i++) {
            System.out.print(letra + " ");
            letra++;
        }
    }

}
