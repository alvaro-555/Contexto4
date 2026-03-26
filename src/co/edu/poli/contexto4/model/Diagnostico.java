package co.edu.poli.contexto4.model;

public class Diagnostico {

    private String id;
    private int nivelRadiacion;
    private String fechaDiagnostico;
    private Astronauta astronauta;
    private Medidor medidor;

    public Diagnostico(){}

    public Diagnostico(String id, int nivelRadiacion, String fechaDiagnostico,
                       Astronauta astronauta, Medidor medidor){

        this.id = id;
        this.nivelRadiacion = nivelRadiacion;
        this.fechaDiagnostico = fechaDiagnostico;
        this.astronauta = astronauta;
        this.medidor = medidor;
    }

    public String getId(){ return id; }

    public void setId(String id){
        this.id = id;
    }

    public int getNivelRadiacion(){ return nivelRadiacion; }

    public void setNivelRadiacion(int nivelRadiacion){
        this.nivelRadiacion = nivelRadiacion;
    }

    public String getFechaDiagnostico(){ return fechaDiagnostico; }

    public void setFechaDiagnostico(String fechaDiagnostico){
        this.fechaDiagnostico = fechaDiagnostico;
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
                "id='" + id + '\'' +
                ", nivelRadiacion=" + nivelRadiacion +
                ", fechaDiagnostico='" + fechaDiagnostico + '\'' +
                ", astronauta=" + astronauta +
                ", medidor=" + medidor +
                '}';
    }
}