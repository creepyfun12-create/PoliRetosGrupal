import poliRetosAlexander.controladorAlexander;
import PoliRetosMarco.ControladorPoliRetosMarco;

public class App {
    public static void main(String[] args) throws Exception {
        ControladorPoliRetosMarco controlador = new ControladorPoliRetosMarco();
        controlador.showSerieNumerica();

        controladorAlexander controladorAlexander = new controladorAlexander();
        controladorAlexander.showSeries();

    }
}
