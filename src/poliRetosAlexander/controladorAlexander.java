package poliRetosAlexander;

public class controladorAlexander {

    public void showSeries() {

        System.out.println("Ejercicio 1 - Series numericas: ");
        serieNumerica serie = new serieNumerica(5);
        serie.serieCuadrados();

        System.out.println("Ejercicio 2 - Serie de caracteres: ");
        serieCaracteres serie2 = new serieCaracteres(5);
        serie2.serieLetra();

        System.out.println("Ejercicio 3 - Figuras: ");
        serieFigura serie3 = new serieFigura(5);
        serie3.seriePiramide();

        System.out.println("Ejercicio 4 - Cadena de caracteres: ");
        cadenaCaracteres cadena = new cadenaCaracteres();
        cadena.cadenaInvertida("EfrainAlexander");

        System.out.println("Ejercicio 6 - Loading ");
        loading load = new loading();
        load.loading6();

        System.out.println("Ejercicio 7 - Recursion ");
        recursion recurs = new recursion();
        System.out.println("Iniciando conteo regresivo... ");
        recurs.conteoRegresivo(10);

    }

}
