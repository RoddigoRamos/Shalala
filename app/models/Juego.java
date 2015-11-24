
package models;

import play.modules.morphia.Model;
import org.mongodb.morphia.annotations.Entity;

/**
 * Modelo para guardar los datos de un juego en el sistema.
 *
 * @author Rodrigo Ramos Nájera
 */

@Entity
public class Juego extends Model{
    
    public Float puntuacion;
    
}
