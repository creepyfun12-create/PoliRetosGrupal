package PoliRetosMarco;

public class GrafosyAutomatas {

  /*
   * A07) Crear un validador de clave para validar:
   * - almenos una letra mayuscula
   * - almenos una letra miniscula
   * - almenos una letra un numero
   * - almenos una letra un caracter
   */

  public boolean validarClave(String clave) {
    boolean tieneMayuscula = false;
    boolean tieneMinuscula = false;
    boolean tieneNumero = false;
    boolean tieneCaracterEspecial = false;

    for (char c : clave.toCharArray()) {
      if (Character.isUpperCase(c)) {
        tieneMayuscula = true;
      } else if (Character.isLowerCase(c)) {
        tieneMinuscula = true;
      } else if (Character.isDigit(c)) {
        tieneNumero = true;
      } else if (!Character.isLetterOrDigit(c)) {
        tieneCaracterEspecial = true;
      }
    }

    return tieneMayuscula && tieneMinuscula && tieneNumero && tieneCaracterEspecial;
  }
}
