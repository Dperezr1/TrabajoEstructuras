/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logica;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Soporte
 */
public class ListaPersonas {
    private List<Persona> lista = new ArrayList<>();

    public void agregarPersona(Persona p) {
        
        getLista().add(p);
        
    }
    public void eliminar (Persona persona ){
        getLista().remove(persona);
    }
    
    public void imprimirLista(){
        for(Persona p:getLista()){
            System.out.println(p);
        }
    }

    /**
     * @return the lista
     */
    public List<Persona> getLista() {
        return lista;
    }

    /**
     * @param lista the lista to set
     */
    public void setLista(List<Persona> lista) {
        this.lista = lista;
    }
    
}
