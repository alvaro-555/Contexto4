package co.edu.poli.contexto4.servicios;

import co.edu.poli.contexto4.model.*;
import java.io.IOException;

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
     * @throws IOException si ocurre un error al guardar el archivo
     */
    public String serializar(Astronauta[] astronautas, String path, String name) throws IOException;

    /**
     * Método encargado de deserializar (leer) un archivo previamente guardado,
     * recuperando los objetos Astronauta almacenados.
     *
     * @param path Ruta donde se encuentra el archivo
     * @param name Nombre del archivo a leer (incluyendo extensión)
     * @throws IOException si ocurre un error al leer el archivo
     * @throws ClassNotFoundException si la clase no es encontrada
     */
    void deserializar(String path, String name) throws IOException, ClassNotFoundException;

}


