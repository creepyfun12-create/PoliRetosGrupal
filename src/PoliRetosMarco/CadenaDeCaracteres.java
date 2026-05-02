package PoliRetosMarco;

public class CadenaDeCaracteres {

  public String QuitarLaLetraJ (String Cadena) {
    String CadenaSinJ = "";
    for (int i = 0; i < Cadena.length(); i++) {
      if (Cadena.charAt(i) != 'j' && Cadena.charAt(i) != 'J') {
        CadenaSinJ += Cadena.charAt(i);
      }
    }
    return CadenaSinJ;
  }

}
