package PoliRetosDavid;

public class Escaleras {
    /**
     * Dibuja una escalera de ___| con el tamaño especificado
     *             ___
     *         ___|
     *     ___|   
     * @param EscaleraTamano: tamaño de la escalera a dibujar
     */
   public void dibujarEscalera(int EscaleraTamano) {
        for(int v = 0; v < EscaleraTamano; v++){
            for (int h = 0; h < EscaleraTamano; h++)
                if (h == EscaleraTamano || v == EscaleraTamano - 1 - h)
                    System.out.print("___");
                else if (v == EscaleraTamano  || h == EscaleraTamano - v)
                    System.out.print("|   ");
                else
                    System.out.print("    ");
                System.out.println(); 
        }       
    }
    // Dibujar escalera con do while
    public void dibujarEscaleraDoWhile(int EscaleraTamano) {
        int v = 0;
        do {
            int h = 0;
            do {
                if (h == EscaleraTamano || v == EscaleraTamano - 1 - h)
                    System.out.print("___");
                else if (v == EscaleraTamano  || h == EscaleraTamano - v)
                    System.out.print("|   ");
                else
                    System.out.print("    ");
                h++;
            } while (h < EscaleraTamano);
            System.out.println(); 
            v++;
        } while (v < EscaleraTamano);       
    }
    // Dibujar escalera con while
    public void dibujarEscaleraWhile(int EscaleraTamano) {
        int v = 0;
        while (v < EscaleraTamano) {
            int h = 0;
            while (h < EscaleraTamano) {
                if (h == EscaleraTamano || v == EscaleraTamano - 1 - h)
                    System.out.print("___");
                else if (v == EscaleraTamano  || h == EscaleraTamano - v)
                    System.out.print("|   ");
                else
                    System.out.print("    ");
                h++;
            }
            System.out.println(); 
            v++;
        }       
    }
}
