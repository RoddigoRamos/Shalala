
package models;

import org.mongodb.morphia.annotations.Entity;
import play.modules.morphia.Model;

/**
 * Modelo para guardar los datos de una Materia en el sistema.
 *
 * @author Rodrigo Ramos Nájera
 */
@Entity
public class Materia extends Model{
    
    public String nombre;
    
}
