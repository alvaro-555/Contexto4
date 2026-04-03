package co.edu.poli.contexto4.servicios;

import co.edu.poli.contexto4.model.Astronauta;

/**
 * Interfaz que define las operaciones básicas CRUD
 * (Crear, Leer, Actualizar y Eliminar) para objetos de tipo Astronauta.
 *
 * Esta interfaz establece el contrato que deben cumplir las clases que
 * implementen estas operaciones.
 *
 * No contiene implementación, solo definición de métodos.
 *
 * @author Alvaro Pachon
 * @since 03/04/2026
 */
public interface OperacionCRUD {

    /**
     * Crea un nuevo astronauta.
     *
     * @param a astronauta a crear
     * @return mensaje de resultado
     */
    String crear(Astronauta a);

    /**
     * Busca un astronauta por su ID.
     *
     * @param id identificador
     * @return astronauta encontrado o null
     */
    Astronauta leerPorId(String id);

    /**
     * Obtiene todos los astronautas.
     *
     * @return arreglo de astronautas
     */
    Astronauta[] leerTodos();

    /**
     * Actualiza un astronauta.
     *
     * @param id identificador
     * @param a nuevo astronauta
     * @return mensaje de resultado
     */
    String actualizar(String id, Astronauta a);

    /**
     * Elimina un astronauta.
     *
     * @param id identificador
     * @return astronauta eliminado
     */
    Astronauta eliminar(String id);
}