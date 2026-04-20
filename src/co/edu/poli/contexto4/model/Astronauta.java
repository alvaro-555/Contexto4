package co.edu.poli.contexto4.model;

import java.io.Serializable;

/**
 * Clase abstracta que representa un astronauta dentro del sistema.
 * Esta clase sirve como base para otras clases como Ingeniero o Piloto,
 * almacenando información general como nombre, edad, peso, identificación,
 * fecha de nacimiento y foto.
 *
 * Es una superclase (padre) de otras clases que heredan sus atributos y métodos.
 *
 * @author Alvaro Pachon
 * @since 03/04/2026
 */
public abstract class Astronauta implements Serializable{ //clase abstracta.

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
     * Nombre del astronauta.
     * Tipo de acceso: private
     */
    private String nombre;

    /**
     * Edad del astronauta.
     * Tipo de acceso: private
     */
    private int edad;

    /**
     * Peso del astronauta en kilogramos.
     * Tipo de acceso: private
     */
    private double pesokg;

    /**
     * Identificador único del astronauta.
     * Es final, por lo tanto no se puede modificar después de asignarse.
     * Tipo de acceso: private
     */
    private final String id; // FINAL no se puede modificar

    /**
     * Fecha de nacimiento del astronauta.
     * Tipo de acceso: private
     */
    private String fechanacimiento;

    /**
     * Ruta o referencia de la foto del astronauta.
     * Tipo de acceso: private
     */
    private String foto;

    /**
     * Constructor vacío de la clase Astronauta.
     * Inicializa el id como una cadena vacía.
     */
    public Astronauta(){
        this.id = ""; // necesario para constructor vacío
    }

    /**
     * Constructor parametrizado que inicializa todos los atributos del astronauta.
     *
     * @param nombre Nombre del astronauta
     * @param edad Edad del astronauta
     * @param pesokg Peso en kilogramos
     * @param id Identificador único (no modificable)
     * @param fechanacimiento Fecha de nacimiento
     * @param foto Foto del astronauta
     */
    public Astronauta(String nombre,int edad,double pesokg,
                      String id,String fechanacimiento,String foto){
        this.nombre = nombre;
        this.edad = edad;
        this.pesokg = pesokg;
        this.id = id; // se asigna una sola vez
        this.fechanacimiento = fechanacimiento;
        this.foto = foto;
    }

    /**
     * Método protegido que calcula el IMC.
     * En esta implementación solo retorna el peso.
     *
     * @return peso del astronauta
     */
    protected double calcularimc(){
        return pesokg;
    }

    /**
     * Método protegido sobrecargado que calcula el IMC con fórmula.
     *
     * @param peso Peso del astronauta
     * @param altura Altura del astronauta
     * @return índice de masa corporal (IMC)
     */
    protected double calcularimc(double peso,double altura){
        return peso/(altura*altura);
    }

    /**
     * Método final que obtiene el IMC del astronauta.
     * No puede ser sobrescrito por clases hijas.
     *
     * @param altura Altura del astronauta
     * @return IMC calculado
     */
    public final double obtenerIMC(double altura){ // FINAL, no se puede sobrescribir
        return calcularimc(pesokg,altura);
    }

    /** @return nombre del astronauta */
    public String getNombre(){return nombre;}

    /**
     * @param nombre Nuevo nombre del astronauta
     */
    public void setNombre(String nombre){this.nombre = nombre;}

    /** @return edad del astronauta */
    public int getEdad(){return edad;}

    /**
     * @param edad Nueva edad del astronauta
     */
    public void setEdad(int edad){this.edad = edad;}

    /** @return peso en kg */
    public double getPesokg(){return pesokg;}

    /**
     * @param pesokg Nuevo peso en kg
     */
    public void setPesokg(double pesokg){this.pesokg = pesokg;}

    /**
     * @return identificador del astronauta
     */
    public String getId(){return id;}

    /** @return fecha de nacimiento */
    public String getFechanacimiento(){return fechanacimiento;}

    /**
     * @param fechanacimiento Nueva fecha de nacimiento
     */
    public void setFechanacimiento(String fechanacimiento){this.fechanacimiento = fechanacimiento;}

    /** @return foto del astronauta */
    public String getFoto(){return foto;}

    /**
     * @param foto Nueva foto del astronauta
     */
    public void setFoto(String foto){this.foto = foto;}

    /**
     * Representación en cadena del objeto Astronauta.
     *
     * @return información del astronauta
     */
    @Override
    public String toString(){
        return "Astronauta{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", pesokg=" + pesokg +
                ", id='" + id + '\'' +
                '}';
    }

    /**
     * Método abstracto que debe ser implementado por las clases hijas.
     * Define el trabajo que realiza el astronauta.
     *
     * @return descripción del trabajo realizado
     */
    public abstract String realizartrabajo();

}