/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ec.edu.ups.vista;

import javax.swing.JOptionPane;

/**
 *
 * @author José Quinde
 */
public class RutaNoExistenteException extends Exception{

    public RutaNoExistenteException() {
       super ("La ruta ingresada no existe") ;
    }
    
    
}
