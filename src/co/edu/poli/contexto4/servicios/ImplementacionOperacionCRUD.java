
package co.edu.poli.contexto4.servicios;

import co.edu.poli.contexto4.model.Astronauta;

public class ImplementacionOperacionCRUD implements OperacionCRUD {

    private Astronauta[] arreglo;

    public ImplementacionOperacionCRUD(){
        arreglo = new Astronauta[2];
    }

    @Override
    public String crear(Astronauta a) {

        if (a == null) return "Error: objeto nulo";

        if (leerPorId(a.getId()) != null) {
            return "Error: ya existe un ID";
        }

        for (int i = 0; i < arreglo.length; i++) {
            if (arreglo[i] == null) {
                arreglo[i] = a;
                return "Astronauta creado";
            }
        }

         
        Astronauta[] nuevo = new Astronauta[arreglo.length * 2];

        for (int i = 0; i < arreglo.length; i++) {
            nuevo[i] = arreglo[i];
        }

        arreglo = nuevo;

        arreglo[arreglo.length / 2] = a;

        return "Astronauta creado (arreglo expandido)";
    }

    @Override
    public Astronauta leerPorId(String id) {

        if (id == null) return null;

        for (Astronauta a : arreglo) {
            if (a != null && a.getId().equals(id)) {
                return a;
            }
        }
        return null;
    }

    @Override
    public Astronauta[] leerTodos() {
        return arreglo;
    }

    @Override
    public String actualizar(String id, Astronauta nuevo) {

        if (id == null || nuevo == null) {
            return "Error: datos inválidos";
        }

        for (int i = 0; i < arreglo.length; i++) {
            if (arreglo[i] != null && arreglo[i].getId().equals(id)) {
                arreglo[i] = nuevo;
                return "Astronauta actualizado";
            }
        }

        return "No encontrado";
    }

    @Override
    public Astronauta eliminar(String id) {

        if (id == null) return null;

        for (int i = 0; i < arreglo.length; i++) {
            if (arreglo[i] != null && arreglo[i].getId().equals(id)) {
                Astronauta eliminado = arreglo[i];
                arreglo[i] = null;
                return eliminado;
            }
        }

        return null;
    }
}

