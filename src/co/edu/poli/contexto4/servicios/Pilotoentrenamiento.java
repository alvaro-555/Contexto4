package co.edu.poli.contexto4.servicios;

import co.edu.poli.contexto4.model.Piloto;

public class Pilotoentrenamiento extends Piloto {

    private boolean esAptoParaVolar;
    private String nivel;
    private static int salarioBase;

    public Pilotoentrenamiento(String nombre,int edad,double pesokg,
                               String id,String fechanacimiento,String foto,
                               String licencia,
                               boolean esAptoParaVolar,String nivel){

        super(nombre,edad,pesokg,id,fechanacimiento,foto,licencia);

        this.esAptoParaVolar = esAptoParaVolar;
        this.nivel = nivel;
    }

    public void realizarSimulacion(){
        System.out.println("Simulación realizada");
    }

    public boolean getEsAptoParaVolar(){return esAptoParaVolar;}

    public void setEsAptoParaVolar(boolean esAptoParaVolar){
        this.esAptoParaVolar = esAptoParaVolar;
    }

    public String getNivel(){return nivel;}

    public void setNivel(String nivel){this.nivel = nivel;}

    public static int getSalarioBase(){return salarioBase;}

    public static void setSalarioBase(int salarioBase){
        Pilotoentrenamiento.salarioBase = salarioBase;
    }

    @Override
    public String toString(){
        return super.toString()+
                " PilotoEntrenamiento{" +
                "nivel='" + nivel + '\'' +
                ", salarioBase=" + salarioBase +
                '}';
    }
}