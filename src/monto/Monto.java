/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package monto;

/**
 *
 * @author javier Bustamante
 * 
 * Ssituación: Supongamos que tenemos una aplicación que posee una
 * pantalla para el ingreso de un valor numérico, como por ejemplo un monto (en alguna moneda),
 * cuyo valor debe estar entre 1 y 1.000. Por lo tanto, todo valor menor que 1 y mayor a 1.000 es
 * invalido.
 * 
 */
public class Monto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
    public String ingreso (int cantidad) {
        String sRespuesta = "Error desconocido";
        
            if (cantidad >= 1 && cantidad <=1000) {
                sRespuesta = "Valor introducido correcto";
            } else if (cantidad < 1) {
                sRespuesta = "Error: La cantidad introducida es menor de 1";
            } else {
                sRespuesta= "Error: La cantidad introducida es > 1000";
            }
        
        return sRespuesta;
    }
}



/* monto1: equivalencia: si el monto es menor de 1,ahora 0, el mensaje seria:
                        la cantidad introducida es menor de 1
monto2: equivalencia: si el monto es de 450(enre 1y1000) el mensaje seria:
                        valor introducido correcto
monto3:equivalencia: si el monto es de 1100(mayor de 1000)el mensaje seria:
                        la cantidad introducida es mayor de 1000
monto4:valores limite:si el monto es de 1 el mensaje seria:
                        valor introducido correcto
monto5:valores limites: si el monto es de 1000 el mensaje seria:
                        valor introducido es correcto
*/