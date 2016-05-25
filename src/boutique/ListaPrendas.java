/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boutique;

/**
 *
 * @author usu21
 */

import java.io.Serializable; 
import java.util.ArrayList;
import java.util.Collections;

public class ListaPrendas {
    private ArrayList<Prenda> lista;

    public ListaPrendas() {
        lista = new ArrayList<>();
    }
    
    //Metodo que devuelve el total de peliculas en el VideoClub
    public int TodasPeliculas(){
        int total = lista.size();
        return total;
    } 
        
    //Metodo para borrar una prenda a la lista
    public void borrarPelicula(Prenda p){
        lista.remove(p);
    }
    
    //Opcion B del metodo de peliculaPorCodigo
    public Prenda PeliculaPorCodigoOpcionB(String codigo){
        //Creo una pelicula auxiliar con el codigo
        Prenda aux = new Prenda();
        aux.setCodigo(codigo);
        //para saber en que posicion se encuentra esta pelicula
        //creo una pelicula auxiliar
        int posicion = lista.indexOf(aux);
        if(posicion == -1){ // Significa q la pelicula no existe
            return null;
        } else {
            return lista.get(posicion); //devuelve la pelicula encontrada
        }
    }
    
    //Metodo que devuelve la pelicula que hay en una posicion pasada
    // como parametro
    public Prenda obtenerPrenda(int posicion){
        return lista.get(posicion);
    }
    
   //Metodo que devuelve la cantidad de elementos que tiene el arraylist
    public int cantidad(){
        return lista.size();
    }
    
        
    //Metodo para añadir una Pelicula a la lista
    public void altaPrenda(Prenda p){
        lista.add(p);
    }
    
    //Funcion que comprueba si existe una pelicula con el mismo codigo
    // que p (parametro) en el ArrayList
    public boolean existe(Prenda p){
//        for (Pelicula aux : lista){
//            if(p.getCodigo().equalsIgnoreCase(aux.getCodigo())){
//                return true;
//            }
//        }
//        return false;
        return lista.contains(p);
    }
    public ArrayList<Prenda> getLista() {
        return lista;
    }

    public void setLista(ArrayList<Prenda> lista) {
        this.lista = lista;
    }

}

