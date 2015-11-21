
package controllers;


import org.hibernate.annotations.Check;
import play.mvc.With;

/**
 *
 * @author rodrigo
 */



@With(Secure.class)
public class Usuarios extends CRUD{
    
}
