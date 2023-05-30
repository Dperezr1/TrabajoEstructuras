/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logica;

/**
 *
 * @author Soporte
 */
public class Ordenamiento {

    public ListaPersonas bubbleSort (ListaPersonas lista) {
        for (int i = 1; i < lista.getLista().size(); i++) {
            for (int j = 0; j < lista.getLista().size() - 1; j++) {
                if (lista.getLista().get(j).getEdad() > lista.getLista().get(j + 1).getEdad()) {
                    Persona aux = lista.getLista().get(j);
                    lista.getLista().set((j), lista.getLista().get(j + 1));
                    lista.getLista().set(j + 1, aux);

                }
            }
        }

        return lista;
    }
    
    public ListaPersonas insertionSort  (ListaPersonas lista){
        
        for (int i = 1; i < lista.getLista().size(); ++i) {
            Persona aux =  lista.getLista().get(i);
            int j = i - 1;
            while (j >= 0 && lista.getLista().get(j).getEdad() < aux.getEdad()) {
                lista.getLista().set(j + 1, lista.getLista().get(j));
                j = j - 1;
            }
            lista.getLista().set(j + 1, aux);
        }
        return lista;
    }

}
