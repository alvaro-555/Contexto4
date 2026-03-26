package co.edu.poli.contexto4.model;

public final class Ingeniero extends Astronauta { // FINAL no se puede heredar

    private String niveltecnico;

    public Ingeniero(){}

    public Ingeniero(String nombre,int edad,double pesokg,String id,
                     String fechanacimiento,String foto,String niveltecnico){

        super(nombre,edad,pesokg,id,fechanacimiento,foto);
        this.niveltecnico = niveltecnico;
    }

    @Override
    protected double calcularimc(double peso,double altura){
        return peso/(altura*altura)*1000;
    }

    public String getNiveltecnico(){return niveltecnico;}

    public void setNiveltecnico(String niveltecnico){
        this.niveltecnico = niveltecnico;
    }

    @Override
    public String toString(){
        return super.toString() +
                " Ingeniero{" +
                "niveltecnico='" + niveltecnico + '\'' +
                '}';
    }
    @Override  //aplicacion del metodo abstracto 
    public String realizartrabajo() {
        return "el ingeniero, esta realizando un mantenimiento";
    }
}