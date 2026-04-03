package co.edu.poli.contexto4.servicios;

import co.edu.poli.contexto4.model.Piloto;

/**
 * Clase que representa un piloto en entrenamiento.
 * Hereda de Piloto, por lo tanto también de Astronauta.
 *
 * Se encarga de gestionar información adicional como nivel,
 * aptitud para volar y salario base.
 *
 * @author Alvaro Pachon
 * @since 03/04/2026
 */
public class Pilotoentrenamiento extends Piloto {

    /**
     * Indica si el piloto es apto para volar.
     * Tipo de acceso: private
     */
    private boolean esAptoParaVolar;

    /**
     * Nivel del piloto en entrenamiento.
     * Tipo de acceso: private
     */
    private String nivel;

    /**
     * Salario base del piloto en entrenamiento.
     * Es estático, pertenece a la clase.
     * Tipo de acceso: private static
     */
    private static int salarioBase;

    /**
     * Constructor del piloto en entrenamiento.
     *
     * @param nombre Nombre
     * @param edad Edad
     * @param pesokg Peso
     * @param id Identificación
     * @param fechanacimiento Fecha de nacimiento
     * @param foto Foto
     * @param licencia Licencia
     * @param esAptoParaVolar Indica si puede volar
     * @param nivel Nivel del piloto
     */
    public Pilotoentrenamiento(String nombre,int edad,double pesokg,
                               String id,String fechanacimiento,String foto,
                               String licencia,
                               boolean esAptoParaVolar,String nivel){

        super(nombre,edad,pesokg,id,fechanacimiento,foto,licencia);

        this.esAptoParaVolar = esAptoParaVolar;
        this.nivel = nivel;
    }

    /**
     * Simula una práctica de entrenamiento.
     */
    public void realizarSimulacion(){
        System.out.println("Simulación realizada");
    }

    /** @return si es apto para volar */
    public boolean getEsAptoParaVolar(){return esAptoParaVolar;}

    /**
     * @param esAptoParaVolar Nuevo estado de aptitud
     */
    public void setEsAptoParaVolar(boolean esAptoParaVolar){
        this.esAptoParaVolar = esAptoParaVolar;
    }

    /** @return nivel del piloto */
    public String getNivel(){return nivel;}

    /**
     * @param nivel Nuevo nivel
     */
    public void setNivel(String nivel){this.nivel = nivel;}

    /** @return salario base */
    public static int getSalarioBase(){return salarioBase;}

    /**
     * @param salarioBase Nuevo salario base
     */
    public static void setSalarioBase(int salarioBase){
        Pilotoentrenamiento.salarioBase = salarioBase;
    }

    /**
     * Representación en cadena del piloto en entrenamiento.
     *
     * @return información del objeto
     */
    @Override
    public String toString(){
        return super.toString()+
                " PilotoEntrenamiento{" +
                "nivel='" + nivel + '\'' +
                ", salarioBase=" + salarioBase +
                '}';
    }
}