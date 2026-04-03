package co.edu.poli.contexto4.model;

/**
 * Clase que representa un planeta dentro del sistema.
 * Contiene información sobre tipo, tamaño, atmósfera y distancia.
 *
 * @author Alvaro Pachon
 * @since 03/04/2026
 */
public class Planeta {

    /**
     * Tipo de planeta.
     * Tipo de acceso: private
     */
    private String tipo;

    /**
     * Identificador del planeta.
     * Tipo de acceso: private
     */
    private String id;

    /**
     * Tamaño del planeta.
     * Tipo de acceso: private
     */
    private int tamano;

    /**
     * Tipo de atmósfera.
     * Tipo de acceso: private
     */
    private String atmosfera;

    /**
     * Distancia del planeta.
     * Tipo de acceso: private
     */
    private int distancia;

    /**
     * Constructor vacío.
     */
    public Planeta(){}

    /**
     * Constructor con parámetros.
     *
     * @param tipo Tipo de planeta
     * @param id Identificador
     * @param tamano Tamaño
     * @param atmosfera Atmósfera
     * @param distancia Distancia
     */
    public Planeta(String tipo,String id,int tamano,String atmosfera,int distancia){
        this.tipo = tipo;
        this.id = id;
        this.tamano = tamano;
        this.atmosfera = atmosfera;
        this.distancia = distancia;
    }

    /**
     * Representación en cadena del planeta.
     *
     * @return información básica del planeta
     */
    @Override
    public String toString(){
        return "Planeta{" +
                "tipo='" + tipo + '\'' +
                ", id='" + id + '\'' +
                '}';
    }
/**
 * ...
 * Además, cuenta con métodos getter y setter que permiten
 * acceder y modificar los atributos de la clase.
 */
    public String getTipo(){ return tipo; }

    public void setTipo(String tipo){
        this.tipo = tipo;
    }

    public String getId(){ return id; }

    public void setId(String id){
        this.id = id;
    }

    public int getTamano(){ return tamano; }

    public void setTamano(int tamano){
        this.tamano = tamano;
    }

    public String getAtmosfera(){ return atmosfera; }

    public void setAtmosfera(String atmosfera){
        this.atmosfera = atmosfera;
    }

    public int getDistancia(){ return distancia; }

    public void setDistancia(int distancia){
        this.distancia = distancia;
    }
}