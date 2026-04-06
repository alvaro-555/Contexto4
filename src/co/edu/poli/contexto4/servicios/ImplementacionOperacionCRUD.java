
package co.edu.poli.contexto4.servicios;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.IOException;
import co.edu.poli.contexto4.model.Astronauta;

/**
 * Clase que implementa la interfaz OperacionCRUD.
 * Se encarga de gestionar operaciones CRUD (Crear, Leer, Actualizar, Eliminar)
 * sobre objetos de tipo Astronauta utilizando un arreglo.
 *
 * Maneja almacenamiento dinámico básico (expansión del arreglo).
 * Además, cuenta con métodos que permiten gestionar los datos de forma controlada.
 *
 * Implementa la interfaz OperacionCRUD.
 *
 * @author Alvaro Pachon
 * @since 03/04/2026
 */
public class ImplementacionOperacionCRUD implements OperacionCRUD, Operacionarchivo {

    /**
     * Arreglo que almacena los astronautas.
     * Tipo de acceso: private
     */
    private Astronauta[] arreglo;

    /**
     * Constructor que inicializa el arreglo con tamaño inicial 2.
     */
    public ImplementacionOperacionCRUD(){
        arreglo = new Astronauta[2];
    }

    /**
     * Crea un nuevo astronauta en el arreglo.
     * Valida que no sea nulo y que no exista el mismo ID.
     *
     * @param a astronauta a crear
     * @return mensaje de resultado de la operación
     */
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

    /**
     * Busca un astronauta por su ID.
     *
     * @param id identificador del astronauta
     * @return astronauta encontrado o null si no existe
     */
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

    /**
     * Retorna todos los astronautas almacenados.
     *
     * @return arreglo de astronautas
     */
    @Override
    public Astronauta[] leerTodos() {
        return arreglo;
    }

    /**
     * Actualiza un astronauta existente por su ID.
     *
     * @param id identificador del astronauta a actualizar
     * @param nuevo nuevo objeto astronauta
     * @return mensaje de resultado
     */
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

    /**
     * Elimina un astronauta por su ID.
     *
     * @param id identificador del astronauta
     * @return astronauta eliminado o null si no se encuentra
     */
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
    /**
 * Serializa el arreglo de astronautas y lo guarda en un archivo.
 *
 * @param datos arreglo de astronautas a guardar
 * @param path ruta donde se almacenará el archivo
 * @param name nombre del archivo
 * @return mensaje de resultado
 */
@Override
public String serializar(Astronauta[] datos, String path, String name) {
    try {
        FileOutputStream fos = new FileOutputStream(path + name);
        ObjectOutputStream oos = new ObjectOutputStream(fos);

        oos.writeObject(datos);

        oos.close();
        fos.close();

        return "Archivo creado correctamente";
    } catch (IOException ioe) {
        return "Error al crear archivo: " + ioe.getMessage();
    }
}

/**
 * Deserializa un archivo y retorna el arreglo de astronautas almacenado.
 *
 * @param path ruta del archivo
 * @param name nombre del archivo
 * @return arreglo de astronautas o null si ocurre un error
 */
/**
 * Deserializa un archivo y carga el arreglo de astronautas.
 *
 * @param path ruta del archivo
 * @param name nombre del archivo
 */
@Override
public void deserializar(String path, String name) {

    try {
        FileInputStream fis = new FileInputStream(path + name);
        ObjectInputStream ois = new ObjectInputStream(fis);

        Astronauta[] datos = (Astronauta[]) ois.readObject();
        arreglo = datos;

        ois.close();
        fis.close();

    } catch (IOException ioe) {
        System.err.println(ioe.getMessage());
    } catch (ClassNotFoundException c) {
        System.err.println(c.getMessage());
    }
}
}