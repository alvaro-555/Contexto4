package co.edu.poli.contexto4.model;

/**
 * Clase que representa un medidor utilizado para obtener resultados,
 * como niveles de radiación u otros datos.
 *
 * Se encarga de almacenar información sobre el tipo de medidor,
 * su ubicación, tamaño y resultado obtenido.
 *
 * @author Alvaro Pachon
 * @since 03/04/2026
 */
public class Medidor {

    /**
     * Tipo de medidor.
     * Tipo de acceso: private
     */
    private String tipo;

    /**
     * Identificador del medidor.
     * Tipo de acceso: private
     */
    private String id;

    /**
     * Resultado obtenido por el medidor.
     * Tipo de acceso: private
     */
    private String resultado;

    /**
     * Ubicación del medidor.
     * Tipo de acceso: private
     */
    private String ubicacion;

    /**
     * Tamaño del medidor.
     * Tipo de acceso: private
     */
    private String tamanio;

    /**
     * Constructor vacío.
     */
    public Medidor(){}

    /**
     * Constructor que inicializa todos los atributos.
     *
     * @param tipo Tipo de medidor
     * @param id Identificador
     * @param resultado Resultado obtenido
     * @param ubicacion Ubicación del medidor
     * @param tamanio Tamaño del medidor
     */
    public Medidor(String tipo, String id, String resultado,
                   String ubicacion, String tamanio){
        this.tipo = tipo;
        this.id = id;
        this.resultado = resultado;
        this.ubicacion = ubicacion;
        this.tamanio = tamanio;
    }

    /** @return tipo del medidor */
    public String getTipo(){ return tipo; }

    /**
     * @param tipo Nuevo tipo
     */
    public void setTipo(String tipo){
        this.tipo = tipo;
    }

    /** @return id del medidor */
    public String getId(){ return id; }

    /**
     * @param id Nuevo id
     */
    public void setId(String id){
        this.id = id;
    }

    /** @return resultado */
    public String getResultado(){ return resultado; }

    /**
     * @param resultado Nuevo resultado
     */
    public void setResultado(String resultado){
        this.resultado = resultado;
    }

    /** @return ubicación */
    public String getUbicacion(){ return ubicacion; }

    /**
     * @param ubicacion Nueva ubicación
     */
    public void setUbicacion(String ubicacion){
        this.ubicacion = ubicacion;
    }

    /** @return tamaño */
    public String getTamanio(){ return tamanio; }

    /**
     * @param tamanio Nuevo tamaño
     */
    public void setTamanio(String tamanio){
        this.tamanio = tamanio;
    }

    /**
     * Representación en cadena del medidor.
     *
     * @return información del medidor
     */
    @Override
    public String toString(){
        return "Medidor{" +
                "tipo='" + tipo + '\'' +
                ", id='" + id + '\'' +
                ", resultado='" + resultado + '\'' +
                ", ubicacion='" + ubicacion + '\'' +
                ", tamanio='" + tamanio + '\'' +
                '}';
    }
}