package co.edu.poli.contexto4.model;

public class Planeta {

    private String tipo;
    private String id;
    private int tamano;
    private String atmosfera;
    private int distancia;

    public Planeta(){}

    public Planeta(String tipo,String id,int tamano,String atmosfera,int distancia){
        this.tipo = tipo;
        this.id = id;
        this.tamano = tamano;
        this.atmosfera = atmosfera;
        this.distancia = distancia;
    }

    @Override
    public String toString(){
        return "Planeta{" +
                "tipo='" + tipo + '\'' +
                ", id='" + id + '\'' +
                '}';
    }
    public String getTipo(){ return tipo; }

public void setTipo(String tipo){
    this.tipo = tipo;
}

public String getId(){ return id; }

public void setId(String id){
    this.id = id;
}

public int getTamano(){ return tamano; }

public void setTamano(int tamano){
    this.tamano = tamano;
}

public String getAtmosfera(){ return atmosfera; }

public void setAtmosfera(String atmosfera){
    this.atmosfera = atmosfera;
}

public int getDistancia(){ return distancia; }

public void setDistancia(int distancia){
    this.distancia = distancia;
}
}