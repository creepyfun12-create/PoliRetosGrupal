package PoliRetosDavid;

public class ControladorDavid {
    public static void main(String[] args) {
        SerieNumerica9 serieNumerica9 = new SerieNumerica9();
        System.out.println(" Serie Numérica Ejercicio 9 ");
        serieNumerica9.SerieEjer9(10);

        SerieLetras serieLetras = new SerieLetras();
        System.out.println(" Serie Letras Ejercicio 9.2 ");
        serieLetras.mostrarLetrasAlternas(10);

        Escaleras escaleras = new Escaleras();
        System.out.println(" Escaleras Ejercicio 9.3 ");
        escaleras.dibujarEscalera(5);

        ConvertirMayus_Minus convertidor = new ConvertirMayus_Minus();
        System.out.println(" Convertir Mayusculas y Minusculas Ejercicio 9.4 ");
        String frase = "no me la puedo creer";
        String resultado = convertidor.convertirMayusMinus(frase);
        System.out.println("Frase original: " + frase);
        System.out.println("Frase convertida: " + resultado);

        MostrarNombre mostrarNombre = new MostrarNombre();
        System.out.println(" Mostrar Nombre Ejercicio 9.5 ");
        String nombre = "DAVID";
        mostrarNombre.mostrarNombre(nombre, nombre.length());
    }
}
