package PoliRetosMarco;

public class ControladorPoliRetosMarco {

  public void showSerieNumerica() {

    System.out.println("Ejercicio 1: Serie numérica");
    SerieNumerica serie = new SerieNumerica();
    serie.sumarTresAlSiguienteNumero(30);

    System.out.println("Ejercicio 2: Serie de caracteres");
    SerieCaracter serieCaracter = new SerieCaracter();
    serieCaracter.mostrarSerieCaracteres(13);

    System.out.println("Ejercicio 3: Figuras");
    Figuras figuras = new Figuras();
    figuras.mostrarfigura();

    System.out.println("Ejercicio 4: Cadena de caracteres");
    CadenaDeCaracteres cadena = new CadenaDeCaracteres();
    String resultado = cadena.QuitarLaLetraJ("josejuaquin".toUpperCase());
    System.out.println("Cadena sin la letra J: " + resultado);
  }
}
