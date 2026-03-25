package co.edu.poli.contexto4.model;

public class Medidor {

    private String tipo;
    private String id;
    private String resultado;

    public Medidor(){}

    public Medidor(String tipo,String id,String resultado){
        this.tipo = tipo;
        this.id = id;
        this.resultado = resultado;
    }
    public String getTipo(){ return tipo; }

public void setTipo(String tipo){
    this.tipo = tipo;
}

public String getId(){ return id; }

public void setId(String id){
    this.id = id;
}

public String getResultado(){ return resultado; }

public void setResultado(String resultado){
    this.resultado = resultado;
}
@Override
public String toString(){
    return "Medidor{" +
            "tipo='" + tipo + '\'' +
            ", id='" + id + '\'' +
            ", resultado='" + resultado + '\'' +
            '}';
}
}