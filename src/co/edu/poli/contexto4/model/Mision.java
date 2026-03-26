package co.edu.poli.contexto4.model;

public class Mision {

    private Planeta[] planeta;
    private Astronauta[] astronauta;
    private String id;
    private String cohete;
    private int fechainicio;
    private int fechafin;

    public Mision(){}

    public Mision(Planeta[] planeta,Astronauta[] astronauta,String id,
                  String cohete,int fechainicio,int fechafin){

        this.planeta = planeta;
        this.astronauta = astronauta;
        this.id = id;
        this.cohete = cohete;
        this.fechainicio = fechainicio;
        this.fechafin = fechafin;
    }

    public int duracionmision(){
        return fechafin-fechainicio;
    }
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