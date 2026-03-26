
package co.edu.poli.contexto4.servicios;

import co.edu.poli.contexto4.model.Astronauta;

public interface OperacionCRUD {

    String crear(Astronauta a);

    Astronauta leerPorId(String id);

    Astronauta[] leerTodos();

    String actualizar(String id, Astronauta a);

    Astronauta eliminar(String id);
    
}

