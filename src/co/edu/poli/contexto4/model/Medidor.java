package co.edu.poli.contexto4.model;

public class Medidor {

    private String tipo;
    private String id;
    private String resultado;
    private String ubicacion;
    private String tamanio;

    public Medidor(){}

    public Medidor(String tipo, String id, String resultado,
                   String ubicacion, String tamanio){
        this.tipo = tipo;
        this.id = id;
        this.resultado = resultado;
        this.ubicacion = ubicacion;
        this.tamanio = tamanio;
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

    public String getUbicacion(){ return ubicacion; }

    public void setUbicacion(String ubicacion){
        this.ubicacion = ubicacion;
    }

    public String getTamanio(){ return tamanio; }

    public void setTamanio(String tamanio){
        this.tamanio = tamanio;
    }

    @Override
    public String toString(){
        return "Medidor{" +
                "tipo='" + tipo + '\'' +
                ", id='" + id + '\'' +
                ", resultado='" + resultado + '\'' +
                ", ubicacion='" + ubicacion + '\'' +
                ", tamanio='" + tamanio + '\'' +
                '}';
    }
}