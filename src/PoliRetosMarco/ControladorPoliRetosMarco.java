package PoliRetosMarco;

public class ControladorPoliRetosMarco {

  public void showSerieNumerica() {
    SerieNumerica serie = new SerieNumerica();
    serie.sumarTresAlSiguienteNumero(30);

    SerieCaracter serieCaracter = new SerieCaracter();
    serieCaracter.mostrarSerieCaracteres(13);

    Figuras figuras = new Figuras();
    figuras.mostrarfigura();
  }
}
