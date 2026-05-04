package poliRetosAlexander;

public class serieFigura {

    private int numTerminos;

    public serieFigura (int numTerminos) {
        this.numTerminos = numTerminos;
    }  

        public void seriePiramide() {
            char letra = 'a';
            for (int i = 0; i < numTerminos; i++) {
                System.out.print(letra + " ");
                letra++;
            }
        }

}
