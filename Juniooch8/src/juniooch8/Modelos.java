/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juniooch8;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import juniooch8.modelos.Ciudad;

/**
 *
 * @author Dell
 */
public class Modelos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Ciudad ciudad = new Ciudad ();
        ArrayList<City>listado = new ArrayList();
        JOptionPane jop=new JOptionPane();
        
        String id=JOptionPane.showInputDialog("Dime el id");
        String nombre=JOptionPane.showInputDialog("Dime el nombre");
        ciudad.setId(Integer.parseInt(id));
        ciudad.setName(nombre);
        JOptionPane.showMessageDialog(null,ciudad);
    }
    
}
