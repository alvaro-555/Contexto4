package co.edu.poli.contexto4.model;


public class Diagnostico {

    private int nivelradiacion;
    private String fecha;
    private Astronauta astronauta;
    private Medidor medidor;

    public Diagnostico(){}

    public Diagnostico(int nivelradiacion,String fecha,
                       Astronauta astronauta,Medidor medidor){

        this.nivelradiacion = nivelradiacion;
        this.fecha = fecha;
        this.astronauta = astronauta;
        this.medidor = medidor;
    }
    public int getNivelradiacion(){ return nivelradiacion; }

public void setNivelradiacion(int nivelradiacion){
    this.nivelradiacion = nivelradiacion;
}

public String getFecha(){ return fecha; }

public void setFecha(String fecha){
    this.fecha = fecha;
}

public Astronauta getAstronauta(){ return astronauta; }

public void setAstronauta(Astronauta astronauta){
    this.astronauta = astronauta;
}

public Medidor getMedidor(){ return medidor; }

public void setMedidor(Medidor medidor){
    this.medidor = medidor;
}
@Override
public String toString(){
    return "Diagnostico{" +
            "nivelradiacion=" + nivelradiacion +
            ", fecha='" + fecha + '\'' +
            ", astronauta=" + astronauta +
            ", medidor=" + medidor +
            '}';
}
}