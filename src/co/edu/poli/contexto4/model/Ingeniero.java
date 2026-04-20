package co.edu.poli.contexto4.model;

import java.io.Serializable;

/**
 * Clase que representa un Ingeniero, hereda de Astronauta.
 * Es una clase final, por lo que no puede ser heredada por otras clases.
 *
 * Se encarga de representar astronautas con funciones técnicas o de mantenimiento.
 *
 * @author Alvaro Pachon
 * @since 03/04/2026
 */
public final class Ingeniero extends Astronauta implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * Nivel técnico del ingeniero.
     * Tipo de acceso: private
     */
    private String niveltecnico;

    /**
     * Constructor que inicializa todos los atributos del ingeniero.
     *
     * @param nombre       Nombre
     * @param edad         Edad
     * @param pesokg       Peso
     * @param id           Identificación
     * @param niveltecnico Nivel técnico del ingeniero
     */
    public Ingeniero(String nombre, int edad, double pesokg, String id,
                     String niveltecnico) {

        super(nombre, edad, pesokg, id, "13 marzo", "astronauta.png");
        this.niveltecnico = niveltecnico;
    }

    /**
     * Sobrescribe el cálculo del IMC aplicando una fórmula modificada.
     *
     * @param peso   Peso
     * @param altura Altura
     * @return IMC modificado
     */
    @Override
    protected double calcularimc(double peso, double altura) {
        return peso / (altura * altura) * 1000;
    }

    /** @return nivel técnico */
    public String getNiveltecnico() { return niveltecnico; }

    /**
     * @param niveltecnico Nuevo nivel técnico
     */
    public void setNiveltecnico(String niveltecnico) {
        this.niveltecnico = niveltecnico;
    }

    /**
     * Representación en cadena del ingeniero.
     *
     * @return información del ingeniero
     */
    @Override
    public String toString() {
        return super.toString() +
                " Ingeniero{" +
                "niveltecnico='" + niveltecnico + '\'' +
                '}';
    }

    /**
     * Implementación del método abstracto de Astronauta.
     *
     * @return descripción del trabajo realizado
     */
    @Override
    public String realizartrabajo() {
        return "el ingeniero, esta realizando un mantenimiento";
    }
}