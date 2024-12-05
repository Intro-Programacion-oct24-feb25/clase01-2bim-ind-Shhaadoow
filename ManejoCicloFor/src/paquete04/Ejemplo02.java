/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete04;

/**
 *
 * @author reroes
 */
public class Ejemplo02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int grados = 20;
        int incremento = 4;
        int operacion = 20;
        String cadenaFinal = "";

        for (int i = 0; i <= operacion; i++) {
            double gradosC = (5.0 / 9) * (grados - 32);
            cadenaFinal+= 
                    String.format("Operación(%d)Farenheit: %d ===> Celsius: "
                            + "%.2f\n", i, grados, gradosC);
            grados += incremento;

        }
      System.out.println(cadenaFinal);
    }
}