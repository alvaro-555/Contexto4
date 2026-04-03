package co.edu.poli.contexto4.model;

/**
 * Clase que representa un diagnóstico realizado a un astronauta.
 * Contiene información sobre el nivel de radiación detectado,
 * la fecha del diagnóstico, el astronauta evaluado y el medidor utilizado.
 *
 * Esta clase se encarga de relacionar un astronauta con un resultado de medición.
 *
 * @author Alvaro Pachon
 * @since 03/04/2026
 */
public class Diagnostico {

    /**
     * Identificador del diagnóstico.
     * Tipo de acceso: private
     */
    private String id;

    /**
     * Nivel de radiación detectado.
     * Tipo de acceso: private
     */
    private int nivelRadiacion;

    /**
     * Fecha en la que se realizó el diagnóstico.
     * Tipo de acceso: private
     */
    private String fechaDiagnostico;

    /**
     * Astronauta al que se le realiza el diagnóstico.
     * Tipo de acceso: private
     */
    private Astronauta astronauta;

    /**
     * Medidor utilizado para realizar el diagnóstico.
     * Tipo de acceso: private
     */
    private Medidor medidor;

    /**
     * Constructor que inicializa todos los atributos del diagnóstico.
     *
     * @param id Identificador del diagnóstico
     * @param nivelRadiacion Nivel de radiación detectado
     * @param fechaDiagnostico Fecha del diagnóstico
     * @param astronauta Astronauta evaluado
     * @param medidor Medidor utilizado
     */
    public Diagnostico(String id, int nivelRadiacion, String fechaDiagnostico,
                       Astronauta astronauta, Medidor medidor){

        this.id = id;
        this.nivelRadiacion = nivelRadiacion;
        this.fechaDiagnostico = fechaDiagnostico;
        this.astronauta = astronauta;
        this.medidor = medidor;
    }

    /** @return id del diagnóstico */
    public String getId(){ return id; }

    /**
     * @param id Nuevo id del diagnóstico
     */
    public void setId(String id){
        this.id = id;
    }

    /** @return nivel de radiación */
    public int getNivelRadiacion(){ return nivelRadiacion; }

    /**
     * @param nivelRadiacion Nuevo nivel de radiación
     */
    public void setNivelRadiacion(int nivelRadiacion){
        this.nivelRadiacion = nivelRadiacion;
    }

    /** @return fecha del diagnóstico */
    public String getFechaDiagnostico(){ return fechaDiagnostico; }

    /**
     * @param fechaDiagnostico Nueva fecha del diagnóstico
     */
    public void setFechaDiagnostico(String fechaDiagnostico){
        this.fechaDiagnostico = fechaDiagnostico;
    }

    /** @return astronauta evaluado */
    public Astronauta getAstronauta(){ return astronauta; }

    /**
     * @param astronauta Nuevo astronauta asociado
     */
    public void setAstronauta(Astronauta astronauta){
        this.astronauta = astronauta;
    }

    /** @return medidor utilizado */
    public Medidor getMedidor(){ return medidor; }

    /**
     * @param medidor Nuevo medidor
     */
    public void setMedidor(Medidor medidor){
        this.medidor = medidor;
    }

    /**
     * Representación en cadena del diagnóstico.
     *
     * @return información del diagnóstico
     */
    @Override
    public String toString(){
        return "Diagnostico{" +
                "id='" + id + '\'' +
                ", nivelRadiacion=" + nivelRadiacion +
                ", fechaDiagnostico='" + fechaDiagnostico + '\'' +
                ", astronauta=" + astronauta +
                ", medidor=" + medidor +
                '}';
    }
}