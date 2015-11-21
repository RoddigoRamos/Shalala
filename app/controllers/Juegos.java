
package controllers;

import play.mvc.Controller;


/**
 *Controlador encargado del minijuego
 * 
 * 
 * @author rodrigo
 */
public class Juegos extends Controller{
    
    
    /**
     * Metodo que se encarga de la renderizacion del minijuego
     */
    public static void memoramaBanderas(){
        renderTemplate("juegos/memoramaBanderas.html");
    }
    
}
