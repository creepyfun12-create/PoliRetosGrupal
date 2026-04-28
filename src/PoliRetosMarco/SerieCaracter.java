package PoliRetosMarco;

public class SerieCaracter {
  public void mostrarSerieCaracteres(int cantidad) {
    System.out.println("");
    System.out.println("");

    char letra = 'a';
    boolean suma = true;

    for (int i = 0; i < cantidad; i++) {
      System.out.print(letra + " ");

      if (suma) {
        System.out.print("+ ");
      } else {
        System.out.print("- ");
      }
      letra += 2;
      suma = !suma;
    }
    System.out.println("");
    System.out.println("");
  }

}
