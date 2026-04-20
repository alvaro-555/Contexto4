package co.edu.poli.contexto4.model;

import java.io.Serializable;

/**
 * Clase que representa un Piloto, hereda de Astronauta.
 * Se encarga de modelar astronautas que operan o conducen naves.
 *
 * @author Alvaro Pachon
 * @since 03/04/2026
 */
public class Piloto extends Astronauta implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * Licencia del piloto.
     * Tipo de acceso: private
     */
    private String licencia;

    /**
     * Constructor del piloto.
     *
     * @param nombre   Nombre
     * @param edad     Edad
     * @param pesokg   Peso
     * @param id       Identificación
     * @param licencia Licencia del piloto
     */
    public Piloto(String nombre, int edad, double pesokg, String id, String licencia) {

        super(nombre, edad, pesokg, id, "12 junio", "piloto.png");
        this.licencia = licencia;
    }

    /** @return licencia del piloto */
    public String getLicencia() { return licencia; }

    /**
     * @param licencia Nueva licencia
     */
    public void setLicencia(String licencia) { this.licencia = licencia; }

    /**
     * Muestra el tipo de piloto.
     *
     * @param type Tipo de piloto
     */
    public void tipopiloto(String type) {
        System.out.println("Tipo piloto: " + type);
    }

    /**
     * Representación en cadena del piloto.
     *
     * @return información del piloto
     */
    @Override
    public String toString() {
        return super.toString() +
                " Piloto{" +
                "licencia='" + licencia + '\'' +
                '}';
    }

    /**
     * Implementación del trabajo del piloto.
     *
     * @return descripción del trabajo
     */
    @Override
    public String realizartrabajo() {
        return "el piloto esta manejando la nave";
    }
}