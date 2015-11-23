package controllers;

import models.Usuario;
import org.hibernate.annotations.Check;
import play.mvc.Before;
import play.mvc.Router;
import play.mvc.With;

/**
 *
 * @author rodrigo
 */

@With(Secure.class)
public class Usuarios extends CRUD{

}
