package co.edu.poli.contexto4.model;

/**
 * Clase que representa un registro dentro del sistema.
 * Contiene información sobre un astronauta, su misión y su diagnóstico,
 * junto con un identificador y una fecha.
 *
 * Esta clase permite relacionar múltiples entidades del sistema en un solo objeto.
 * Además, cuenta con métodos getter y setter que permiten acceder y modificar
 * los atributos de forma controlada.
 *
 * No hereda de ninguna clase ni es clase padre.
 *
 * @author Alvaro Pachon
 * @since 03/04/2026
 */
public class Registro {

    /**
     * Identificador del registro.
     * Tipo de acceso: private
     */
    private String id;

    /**
     * Fecha del registro.
     * Tipo de acceso: private
     */
    private String fecha;

    /**
     * Astronauta asociado al registro.
     * Tipo de acceso: private
     */
    private Astronauta astronauta;

    /**
     * Misión asociada al registro.
     * Tipo de acceso: private
     */
    private Mision mision;

    /**
     * Diagnóstico asociado al registro.
     * Tipo de acceso: private
     */
    private Diagnostico diagnostico;

    /**
     * Constructor vacío.
     */
    public Registro(){}

    /**
     * Constructor con todos los atributos.
     *
     * @param id Identificador del registro
     * @param fecha Fecha del registro
     * @param astronauta Astronauta asociado
     * @param mision Misión asociada
     * @param diagnostico Diagnóstico asociado
     */
    public Registro(String id,String fecha,Astronauta astronauta,
                    Mision mision,Diagnostico diagnostico){

        this.id = id;
        this.fecha = fecha;
        this.astronauta = astronauta;
        this.mision = mision;
        this.diagnostico = diagnostico;
    }

    /**
     * Representación en cadena del registro.
     *
     * @return información del registro
     */
    @Override
    public String toString(){
        return "Registro{" +
                "id='" + id + '\'' +
                ", fecha='" + fecha + '\'' +
                ", astronauta=" + astronauta +
                '}';
    }

    /**
     * Método getter que obtiene el id.
     * @return id del registro
     */
    public String getId(){ return id; }

    /**
     * Método setter que modifica el id.
     * @param id nuevo id
     */
    public void setId(String id){
        this.id = id;
    }

    /**
     * Método getter que obtiene la fecha.
     * @return fecha del registro
     */
    public String getFecha(){ return fecha; }

    /**
     * Método setter que modifica la fecha.
     * @param fecha nueva fecha
     */
    public void setFecha(String fecha){
        this.fecha = fecha;
    }

    /**
     * Método getter que obtiene el astronauta.
     * @return astronauta asociado
     */
    public Astronauta getAstronauta(){ return astronauta; }

    /**
     * Método setter que modifica el astronauta.
     * @param astronauta nuevo astronauta
     */
    public void setAstronauta(Astronauta astronauta){
        this.astronauta = astronauta;
    }

    /**
     * Método getter que obtiene la misión.
     * @return misión asociada
     */
    public Mision getMision(){ return mision; }

    /**
     * Método setter que modifica la misión.
     * @param mision nueva misión
     */
    public void setMision(Mision mision){
        this.mision = mision;
    }

    /**
     * Método getter que obtiene el diagnóstico.
     * @return diagnóstico asociado
     */
    public Diagnostico getDiagnostico(){ return diagnostico; }

    /**
     * Método setter que modifica el diagnóstico.
     * @param diagnostico nuevo diagnóstico
     */
    public void setDiagnostico(Diagnostico diagnostico){
        this.diagnostico = diagnostico;
    }
}