package PoliRetosMarco;

public class Figuras {
  public void mostrarfigura() {
        int filas = 5;

        for (int i = 0; i < filas; i++) {

            for (int j = 0; j < i * 4; j++) {
                System.out.print(" ");
            }
            if (i == 0) {
                System.out.println("___");
            } else {
                System.out.println("|___");
  }

}
    }
}
