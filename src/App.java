import poliRetosAlexander.controladorAlexander;
import PoliRetosMarco.ControladorPoliRetosMarco;
import PoliRetosDavid.ControladorDavid;

public class App {
    public static void main(String[] args) throws Exception {
        ControladorPoliRetosMarco controlador = new ControladorPoliRetosMarco();
        controlador.showSerieNumerica();

        controladorAlexander controladorAlexander = new controladorAlexander();
        controladorAlexander.showSeries();

        ControladorDavid controladorDavid = new ControladorDavid();
        controladorDavid.showEscaleras();
        controladorDavid.showMostrarNombre("MOSTRANDO NOMBRE", 10);
        controladorDavid.showSerieLetras(1);
        controladorDavid.showConvertirMayusMinus("no me la puedo creer");
        controladorDavid.showSerieNumerica9(10);

    }
}
