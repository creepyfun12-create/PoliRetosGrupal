package PoliRetosMarco;

import poliRetosAlexander.loading;

public class Loading {

  /*
   * L07) Crear una barra es de 20 caracteres, la barra avanza cambiando la punta
   * con
   * movimiento rotacional signos \|/-|
   * [ ==== /
   *
   * ] 20%
   */
  public void loading6() {
    String[] symbols = { "\\", "|", "/", "-" };
    int totalSteps = 20;

    for (int i = 0; i <= totalSteps; i++) {
      int progress = (i * 100) / totalSteps;
      StringBuilder bar = new StringBuilder("[");
      for (int j = 0; j < totalSteps; j++) {
        if (j < i) {
          bar.append("=");
        } else {
          bar.append(" ");
        }
      }
      bar.append("] ").append(progress).append("% ").append(symbols[i % symbols.length]);
      System.out.print("\r" + bar.toString());
      try {
        Thread.sleep(200); // Simula el tiempo de carga
      } catch (InterruptedException e) {
        Thread.currentThread().interrupt();
      }
    }
    System.out.println("\nCarga completa!");

     System.out.println("\nLoading con do while");
      int contador = 0;
      try {
          do {
              int progress = (contador * 100) / totalSteps;
              StringBuilder bar = new StringBuilder("[");
              for (int j = 0; j < totalSteps; j++) {
                  if (j < contador) {
                      bar.append("=");
                  } else {
                      bar.append(" ");
                  }
              }
              bar.append("] ").append(progress).append("% ").append(symbols[contador % symbols.length]);
              System.out.print("\r" + bar.toString());
              contador++;
              Thread.sleep(200); // Simula el tiempo de carga
          } while (contador <= totalSteps);
      } catch (InterruptedException e) {
          Thread.currentThread().interrupt();
      }
      System.out.println("\nCarga completa!");

       System.out.println("\nLoading con while");
      contador = 0;
      try {
          while (contador <= totalSteps) {
              int progress = (contador * 100) / totalSteps;
              StringBuilder bar = new StringBuilder("[");
              for (int j = 0; j < totalSteps; j++) {
                  if (j < contador) {
                      bar.append("=");
                  } else {
                      bar.append(" ");
                  }
              }
              bar.append("] ").append(progress).append("% ").append(symbols[contador % symbols.length]);
              System.out.print("\r" + bar.toString());
              contador++;
              Thread.sleep(200); // Simula el tiempo de carga
          }
      } catch (InterruptedException e) {
          Thread.currentThread().interrupt();
      }
  }


}
