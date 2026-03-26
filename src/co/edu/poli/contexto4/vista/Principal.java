package co.edu.poli.contexto4.vista;
import co.edu.poli.contexto4.model.*;
import co.edu.poli.contexto4.servicios.Pilotoentrenamiento;
import java.util.Scanner;
import co.edu.poli.contexto4.servicios.*;

public class Principal {

    public static void main(String[] args) {

        Scanner Sc1 = new Scanner(System.in);

        ImplementacionOperacionCRUD crud = new ImplementacionOperacionCRUD();

       
        Astronauta[] astronautas = new Astronauta[5];

        astronautas[1] = new Ingeniero("carlos", 32, 78, "I123", "20/02/1994", "foto", "alto");
        astronautas[1].setPesokg(75);

        astronautas[2] = new Piloto("Pedro",35,82,"2","1995","foto2","A1");

        astronautas[3] = new Pilotoentrenamiento(
                "Luis",28,78,"3","1998","foto3",
                "B2",true,"Intermedio"
        );

        double altura = 1.75;

        for(Astronauta a : astronautas){
            if(a != null){
                System.out.println(a.getClass().getSimpleName() +
                        " IMC: " + a.obtenerIMC(altura));
            }
        }

        int opcion;

        do {
            System.out.println("\nBienvenido, que desea hacer:");
            System.out.println("1. Añadir un Astronauta");
            System.out.println("2. Ver información de un astronauta");
            System.out.println("3. Ver todos los astronautas");
            System.out.println("4. Modificar datos");
            System.out.println("5. Eliminar astronauta");
            System.out.println("6. Salir");

            opcion = Sc1.nextInt();

            if (opcion > 6 || opcion <= 0){
                System.out.println("Opción inválida");
            } else {

                switch (opcion) {

                    case 1:
                        Astronauta nuevoAst = crearAstronauta(Sc1);
                        System.out.println(crud.crear(nuevoAst));
                        break;

                    case 2:
                        System.out.print("ID: ");
                        String idBuscar = Sc1.next();

                        Astronauta encontrado = crud.leerPorId(idBuscar);

                        if(encontrado != null){
                            System.out.println(encontrado);
                        } else {
                            System.out.println("No encontrado");
                        }
                        break;

                    case 3:
                        for(Astronauta a : crud.leerTodos()){
                            if(a != null){
                                System.out.println(a);
                            }
                        }
                        break;

                    case 4:
                        System.out.print("ID a modificar: ");
                        String idMod = Sc1.next();

                        Astronauta actualizado = crearAstronauta(Sc1);

                        System.out.println(crud.actualizar(idMod, actualizado));
                        break;

                    case 5:
                        System.out.print("ID a eliminar: ");
                        String idEliminar = Sc1.next();

                        Astronauta eliminado = crud.eliminar(idEliminar);

                        if(eliminado != null){
                            System.out.println("Eliminado: " + eliminado);
                        } else {
                            System.out.println("No encontrado");
                        }
                        break;

                    case 6:
                        System.out.println("Saliendo...");
                        break;
                }
            }

        } while (opcion != 6);
    }

    public static void mostrarIMC(Astronauta a, double altura){
        System.out.println(
            a.getClass().getSimpleName() +
            " IMC: " + a.obtenerIMC(altura)
        );
    }

    public static Astronauta crearAstronauta(Scanner sc){

        System.out.println("Tipo:");
        System.out.println("1. Ingeniero");
        System.out.println("2. Piloto");

        int tipo = sc.nextInt();

        System.out.print("Nombre: ");
        String nombre = sc.next();

        System.out.print("Edad: ");
        int edad = sc.nextInt();

        System.out.print("Peso: ");
        double peso = sc.nextDouble();

        System.out.print("ID: ");
        String id = sc.next();

        System.out.print("Fecha de nacimiento: ");
        String fechaNacimiento = sc.next();

        System.out.print("Foto: ");
        String foto = sc.next();

        if(tipo == 1){
            System.out.print("Especialidad: ");
            String especialidad = sc.next();

            return new Ingeniero(nombre, edad, peso, id, fechaNacimiento, foto, especialidad);

        } else {
            System.out.print("Licencia: ");
            String licencia = sc.next();

            return new Piloto(nombre, edad, peso, id, fechaNacimiento, foto, licencia);
        }
    }
}
