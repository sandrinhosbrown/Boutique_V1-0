/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boutique;

import OCUtilidades.Fichero;
/**
 *
 * @author usu21
 */
public class BoutiqueFichero {
    public static Fichero miFichero;
    public static ListaPrendas misPrendas;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Inicializamos el fichero y la lista de peliculas
        miFichero = new Fichero ("boutique.xml");
        misPrendas = (ListaPrendas) miFichero.leer(); //casting de objeto q devuelve leer a ListaPeliculas
        if(misPrendas == null){
            misPrendas = new ListaPrendas();
        }
        //Creamos el Menu Principal y lo hacemos visible
        MenuPrincipal menu = new MenuPrincipal();
        menu.setVisible(true);
    }
    
}

