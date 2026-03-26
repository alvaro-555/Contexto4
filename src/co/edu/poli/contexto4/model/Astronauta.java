package co.edu.poli.contexto4.model;

public abstract class Astronauta { //clase abstracta.

    private String nombre;
    private int edad;
    private double pesokg;
    private final String id; // FINAL no se puede modificar
    private String fechanacimiento;
    private String foto;

    public Astronauta(){
        this.id = ""; // necesario para constructor vacío
    }

    public Astronauta(String nombre,int edad,double pesokg,
                      String id,String fechanacimiento,String foto){
        this.nombre = nombre;
        this.edad = edad;
        this.pesokg = pesokg;
        this.id = id; // se asigna una sola vez
        this.fechanacimiento = fechanacimiento;
        this.foto = foto;
    }

    protected double calcularimc(){
        return pesokg;
    }

    
    protected double calcularimc(double peso,double altura){
        return peso/(altura*altura);
    }

    public final double obtenerIMC(double altura){ // FINAL, no se puede sobrescribir
        return calcularimc(pesokg,altura);
    }

    public String getNombre(){return nombre;}
    public void setNombre(String nombre){this.nombre = nombre;}

    public int getEdad(){return edad;}
    public void setEdad(int edad){this.edad = edad;}

    public double getPesokg(){return pesokg;}
    public void setPesokg(double pesokg){this.pesokg = pesokg;}

    public String getId(){return id;}
    //setter eliminado porque id es final

    public String getFechanacimiento(){return fechanacimiento;}
    public void setFechanacimiento(String fechanacimiento){this.fechanacimiento = fechanacimiento;}

    public String getFoto(){return foto;}
    public void setFoto(String foto){this.foto = foto;}

    @Override
    public String toString(){
        return "Astronauta{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", pesokg=" + pesokg +
                ", id='" + id + '\'' +
                '}';
    }
    public abstract String realizartrabajo();

}