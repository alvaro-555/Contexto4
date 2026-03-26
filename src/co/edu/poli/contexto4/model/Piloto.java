package co.edu.poli.contexto4.model;

public class Piloto extends Astronauta {

    private String licencia;

    public Piloto(String nombre,int edad,double pesokg,String id, String fechanacimiento,String foto,String licencia){

        super(nombre,edad,pesokg,id,fechanacimiento,foto);
        this.licencia = licencia;
    }

    public String getLicencia(){return licencia;}

    public void setLicencia(String licencia){this.licencia = licencia;}

    public void tipopiloto(String type){
        System.out.println("Tipo piloto: "+type);
    }

    @Override
    public String toString(){
        return super.toString()+
                " Piloto{" +
                "licencia='" + licencia + '\'' +
                '}';
    }
    @Override
    public String realizartrabajo() {
        return "el piloto esta manejando la nave";
    }
}