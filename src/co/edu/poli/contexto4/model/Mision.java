package co.edu.poli.contexto4.model;

/**
 * Clase que representa una misión espacial.
 * Contiene información sobre los planetas involucrados,
 * los astronautas participantes, el cohete y las fechas de la misión.
 *
 * Maneja arreglos de planetas y astronautas.
 *
 * @author Alvaro Pachon
 * @since 03/04/2026
 */
public class Mision {

    /**
     * Arreglo de planetas asociados a la misión.
     * Tipo de acceso: private
     */
    private Planeta[] planeta;

    /**
     * Arreglo de astronautas participantes.
     * Tipo de acceso: private
     */
    private Astronauta[] astronauta;

    /**
     * Identificador de la misión.
     * Tipo de acceso: private
     */
    private String id;

    /**
     * Nombre del cohete utilizado.
     * Tipo de acceso: private
     */
    private String cohete;

    /**
     * Fecha de inicio de la misión.
     * Tipo de acceso: private
     */
    private int fechainicio;

    /**
     * Fecha de finalización de la misión.
     * Tipo de acceso: private
     */
    private int fechafin;

    /**
     * Constructor vacío.
     */
    public Mision(){}

    /**
     * Constructor con todos los atributos.
     *
     * @param planeta Arreglo de planetas
     * @param astronauta Arreglo de astronautas
     * @param id Identificador
     * @param cohete Cohete
     * @param fechainicio Fecha inicio
     * @param fechafin Fecha fin
     */
    public Mision(Planeta[] planeta,Astronauta[] astronauta,String id,
                  String cohete,int fechainicio,int fechafin){

        this.planeta = planeta;
        this.astronauta = astronauta;
        this.id = id;
        this.cohete = cohete;
        this.fechainicio = fechainicio;
        this.fechafin = fechafin;
    }

    /**
     * Calcula la duración de la misión.
     *
     * @return duración (fin - inicio)
     */
    public int duracionmision(){
        return fechafin-fechainicio;
    }
/**
 * ...
 * Además, cuenta con métodos getter y setter que permiten
 * acceder y modificar los atributos de la clase.
 */
    public Planeta[] getPlaneta(){ return planeta; }

    public void setPlaneta(Planeta[] planeta){
        this.planeta = planeta;
    }

    public Astronauta[] getAstronauta(){ return astronauta; }

    public void setAstronauta(Astronauta[] astronauta){
        this.astronauta = astronauta;
    }

    public String getId(){ return id; }

    public void setId(String id){
        this.id = id;
    }

    public String getCohete(){ return cohete; }

    public void setCohete(String cohete){
        this.cohete = cohete;
    }

    public int getFechainicio(){ return fechainicio; }

    public void setFechainicio(int fechainicio){
        this.fechainicio = fechainicio;
    }

    public int getFechafin(){ return fechafin; }

    public void setFechafin(int fechafin){
        this.fechafin = fechafin;
    }

    /**
     * Representación en cadena de la misión.
     *
     * @return información de la misión
     */
    @Override
    public String toString(){
        return "Mision{" +
                "id='" + id + '\'' +
                ", cohete='" + cohete + '\'' +
                ", fechainicio=" + fechainicio +
                ", fechafin=" + fechafin +
                ", duracion=" + duracionmision() +
                '}';
    }
}