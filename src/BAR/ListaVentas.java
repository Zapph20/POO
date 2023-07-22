/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BAR;

import java.util.Vector;

/**
 *
 * @author Axel Yamir CT
 */
public class ListaVentas {
    private static Vector datos= new Vector();
    
    public static void eliminar(int pos){
        datos.removeElementAt(pos);
    }
}
