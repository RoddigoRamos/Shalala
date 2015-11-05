
package models;

import java.util.Date;
import javax.persistence.Entity;
import play.data.validation.*;
import play.db.jpa.Model;

/**
 *
 * @author rodrigo
 */
@Entity
public class Usuario extends Model{
    
    @Required
    @MinSize(value=3)
    public String usuario;
    
    @Email
    @Required
    @Unique
    public String email;
    
    @Password
    public String password;
    
    public String nombre;
    public String primerApellido;
    public String segundoApellido;
    public Date fechaNacimiento;
    public Integer grado;
    
    public boolean isAdmin;
    
    
}
