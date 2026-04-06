package co.edu.poli.contexto4.servicios;

import co.edu.poli.contexto4.model.*;

/**
 * Interfaz que define las operaciones básicas para el manejo
 * de archivos mediante serialización y deserialización de objetos.
 *
 * Permite guardar y recuperar arreglos de objetos tipo Astronauta
 * en almacenamiento externo.
 *
 * @author Alvaro Pachon
 * @since 05/04/2026
 */
public interface Operacionarchivo {

    /**
     * Método encargado de serializar (guardar) un arreglo de astronautas
     * en un archivo dentro de una ruta específica.
     *
     * @param astronautas Arreglo de objetos Astronauta que se desea guardar
     * @param path Ruta donde se almacenará el archivo
     * @param name Nombre del archivo a crear (incluyendo extensión, por ejemplo .dat)
     * @return Mensaje indicando el resultado de la operación (éxito o error)
     */
    public String serializar(Astronauta[] astronautas, String path, String name);

    /**
     * Método encargado de deserializar (leer) un archivo previamente guardado,
     * recuperando los objetos Astronauta almacenados.
     *
     * @param path Ruta donde se encuentra el archivo
     * @param name Nombre del archivo a leer (incluyendo extensión)
     */
    void deserializar(String path, String name);

}


