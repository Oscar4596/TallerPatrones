/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Alejandra
 */
public class Proxy implements Iacceso{
    
    Acceso acceso;
    Usuario usuario;
    
    public Proxy (Usuario usuario){
        this.usuario=usuario;
        
    }

    public void acceder() {
       
        if(usuario.getUsuario().equalsIgnoreCase("PaDi")&& usuario.getContraseña().equalsIgnoreCase("software"))
        {
        // acceso = new Acceso();
         //acceso.acceder();
         Main main = new Main();
         main.setVisible(true);
        }
        else
        {
            System.out.println("No tiene acceso al servidor");
        }
    }

  
}
