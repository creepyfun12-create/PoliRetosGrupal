package PoliRetosDavid;

public class MostrarNombre {
    /*
    * Ejercicio 9.5: Escribe un programa que muestre tu nombre, mostrando solo una letra en la misma linea 0% hasta 100%
        * Ejemplo de salida:
        * [=         ] 10% M
        * [==        ] 20% O
        * [===       ] 30% S
        * [====      ] 40% T
        * [=====     ] 50% R
        * [======    ] 60% A
        * [=======   ] 70% N
        * [========  ] 80% O
        * [========= ] 90% 
        * [==========] 100%
    */
   public void mostrarNombre(String nombre, int avance){
    int total = 20;
    for (int i = 0; i < avance; i++){
        int porcentaje = (i + 1) * 100 / avance;
        int caracteresCompletos = porcentaje * total / 100;
        String barra = "[" + "=".repeat(caracteresCompletos) + " ".repeat(total - caracteresCompletos) + "]";
        char letra = nombre.charAt(i % nombre.length());
        System.out.print("\r" + barra + " " + porcentaje + "% " + letra);
        try {
            Thread.sleep(1000);// Simular tiempo de carga
        } catch (Exception e) {} 
    }
   }
   // mostrarNombre mediante DoWhile
   public void mostrarNombreDoWhile(String nombre, int avance){
    int total = 20;
    int i = 0;
    do {
        int porcentaje = (i + 1) * 100 / avance;
        int caracteresCompletos = porcentaje * total / 100;
        String barra = "[" + "=".repeat(caracteresCompletos) + " ".repeat(total - caracteresCompletos) + "]";
        char letra = nombre.charAt(i % nombre.length());
        System.out.print("\r" + barra + " " + porcentaje + "% " + letra);
        try {
            Thread.sleep(1000);// Simular tiempo de carga
        } catch (Exception e) {} 
        i++;
    } while (i < avance);
   }
   // mostrarNombre mediante While
   public void mostrarNombreWhile(String nombre, int avance){
    int total = 20;
    int i = 0;
    while (i < avance){
        int porcentaje = (i + 1) * 100 / avance;
        int caracteresCompletos = porcentaje * total / 100;
        String barra = "[" + "=".repeat(caracteresCompletos) + " ".repeat(total - caracteresCompletos) + "]";
        char letra = nombre.charAt(i % nombre.length());
        System.out.print("\r" + barra + " " + porcentaje + "% " + letra);
        try {
            Thread.sleep(1000);// Simular tiempo de carga
        } catch (Exception e) {} 
        i++;
    }
   }
}
