package co.edu.poli.contexto4.model;

public class Registro {

    private String id;
    private String fecha;
    private Astronauta astronauta;
    private Mision mision;
    private Diagnostico diagnostico;

    public Registro(){}

    public Registro(String id,String fecha,Astronauta astronauta,
                    Mision mision,Diagnostico diagnostico){

        this.id = id;
        this.fecha = fecha;
        this.astronauta = astronauta;
        this.mision = mision;
        this.diagnostico = diagnostico;
    }

    @Override
    public String toString(){
        return "Registro{" +
                "id='" + id + '\'' +
                ", fecha='" + fecha + '\'' +
                ", astronauta=" + astronauta +
                '}';
    }
    public String getId(){ return id; }

public void setId(String id){
    this.id = id;
}

public String getFecha(){ return fecha; }

public void setFecha(String fecha){
    this.fecha = fecha;
}

public Astronauta getAstronauta(){ return astronauta; }

public void setAstronauta(Astronauta astronauta){
    this.astronauta = astronauta;
}

public Mision getMision(){ return mision; }

public void setMision(Mision mision){
    this.mision = mision;
}

public Diagnostico getDiagnostico(){ return diagnostico; }

public void setDiagnostico(Diagnostico diagnostico){
    this.diagnostico = diagnostico;
}
}