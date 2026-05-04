package poliRetosAlexander;

public class serieNumerica {

    private int numTerminos;

    public serieNumerica (int numTerminos) {
        this.numTerminos = numTerminos;
    }    

    public void serieCuadrados() {
        for (int i = 1; i <= numTerminos; i++) {
            System.out.print((i * i) + " ");
        }
    }    

}
