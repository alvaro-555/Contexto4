package co.edu.poli.contexto4.vista;
import co.edu.poli.contexto4.model.*;
import co.edu.poli.contexto4.servicios.Pilotoentrenamiento;

public class Principal {

    public static void main(String[] args) {

        // Arreglo de la superclase
        Astronauta[] astronautas = new Astronauta[5];

        // Objetos
        astronautas[0] = new Astronauta("Juan",30,80,"1","2000","foto1");

        astronautas[1] = new Ingeniero("carlos", 32, 78, "I123", "20/02/1994", "foto", "alto");
        astronautas[1].setPesokg(75);

        astronautas[2] = new Piloto("Pedro",35,82,"2","1995","foto2","A1");

        astronautas[3] = new Pilotoentrenamiento(
                "Luis",28,78,"3","1998","foto3",
                "B2",true,"Intermedio"
        );

        // altura de prueba
        double altura = 1.75;

        // Polimorfismo + sobrescritura
        for(Astronauta a : astronautas){
            if(a != null){
                System.out.println(a.getClass().getSimpleName() +
                        " IMC: " + a.obtenerIMC(altura));
            }
        }
        // Polimorfismo con retorno
    Astronauta nuevo = crearAstronauta();

    // Polimorfismo con parámetro
    mostrarIMC(nuevo, 1.75);

    // FINAL atributo id no se puede modificar (clase Astronauta)
    // FINAL método obtenerIMC no se puede sobrescribir (clase Astronauta)
    // FINAL clase Ingeniero no puede ser heredada
    }

    public static void mostrarIMC(Astronauta a, double altura){
    System.out.println(
        a.getClass().getSimpleName() +
        " IMC: " + a.obtenerIMC(altura)
    );
}

    public static Astronauta crearAstronauta(){
    return new Ingeniero(
            "Ana", 29, 70, "I999", "1996", "foto", "Senior"
    );
}
}