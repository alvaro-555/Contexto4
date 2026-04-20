package co.edu.poli.contexto4.vista;
import co.edu.poli.contexto4.model.*;

import java.util.Scanner;
import java.io.IOException;
import co.edu.poli.contexto4.servicios.*;

public class Principal {

    public static void main(String[] args) {

        Scanner Sc1 = new Scanner(System.in);

        ImplementacionOperacionCRUD crud = new ImplementacionOperacionCRUD();

        Astronauta[] astronautas = new Astronauta[5];

       // astronautas[0] = new Ingeniero("carlos", 32, 78.0, "I123", "alto");
      //  astronautas[0].setPesokg(75);
       // astronautas[1] = new Piloto("Pedro", 35, 82, "2", "A1");
       // astronautas[2] = new Pilotoentrenamiento("Luis", 28, 78, "3", "B2", true, "Intermedio");

       // double altura = 1.75;

        //for (Astronauta a : astronautas) {
          //  if (a != null) {
           //     System.out.println(a.getClass().getSimpleName() +
             //           " IMC: " + a.obtenerIMC(altura));
           // }
       // }

        int opcion;

        do {
            System.out.println("\nBienvenido, que desea hacer:");
            System.out.println("1. Añadir un Astronauta");
            System.out.println("2. Ver información de un astronauta");
            System.out.println("3. Ver todos los astronautas");
            System.out.println("4. Modificar datos");
            System.out.println("5. Eliminar astronauta");
            System.out.println("6. Serializar datos");
            System.out.println("7. Deserializar datos");
            System.out.println("8. Salir");

            try {
                opcion = Sc1.nextInt();
            } catch (Exception e) {
                System.out.println("Error al leer opción: " + e.getMessage());
                Sc1.nextLine();
                opcion = 0;
            }

            if (opcion > 8 || opcion <= 0) {
                System.out.println("Opción inválida");
            } else {

                switch (opcion) {

                    case 1:
                        try {
                            Astronauta nuevoAst = crearAstronauta(Sc1);
                            System.out.println(crud.crear(nuevoAst));
                        } catch (IllegalArgumentException e) {
                            System.out.println("Error de argumento: " + e.getMessage());
                        } catch (Exception e) {
                            System.out.println("Error al crear astronauta: " + e.getMessage());
                        }
                        break;

                    case 2:
                        try {
                            System.out.print("ID: ");
                            String idBuscar = Sc1.next();
                            Astronauta encontrado = crud.leerPorId(idBuscar);
                            if (encontrado != null) {
                                System.out.println(encontrado);
                            } else {
                                System.out.println("No encontrado");
                            }
                        } catch (IllegalArgumentException e) {
                            System.out.println("Error de argumento: " + e.getMessage());
                        } catch (Exception e) {
                            System.out.println("Error al buscar astronauta: " + e.getMessage());
                        }
                        break;

                    case 3:
                        try {
                            for (Astronauta a : crud.leerTodos()) {
                                if (a != null) {
                                    System.out.println(a);
                                }
                            }
                        } catch (Exception e) {
                            System.out.println("Error al listar astronautas: " + e.getMessage());
                        }
                        break;

                    case 4:
                        try {
                            System.out.print("ID a modificar: ");
                            String idMod = Sc1.next();
                            Astronauta actualizado = crearAstronauta(Sc1);
                            System.out.println(crud.actualizar(idMod, actualizado));
                        } catch (IllegalArgumentException e) {
                            System.out.println("Error de argumento: " + e.getMessage());
                        } catch (Exception e) {
                            System.out.println("Error al modificar astronauta: " + e.getMessage());
                        }
                        break;

                    case 5:
                        try {
                            System.out.print("ID a eliminar: ");
                            String idEliminar = Sc1.next();
                            Astronauta eliminado = crud.eliminar(idEliminar);
                            if (eliminado != null) {
                                System.out.println("Eliminado: " + eliminado);
                            } else {
                                System.out.println("No encontrado");
                            }
                        } catch (IllegalArgumentException e) {
                            System.out.println("Error de argumento: " + e.getMessage());
                        } catch (Exception e) {
                            System.out.println("Error al eliminar astronauta: " + e.getMessage());
                        }
                        break;

                    case 6:
                        try {
                            System.out.println(crud.serializar(crud.leerTodos(), "datos/", "listaAstronautas.dat"));
                        } catch (IOException e) {
                            System.out.println("Error al serializar: " + e.getMessage());
                        }
                        break;

                    case 7:
                        try {
                            crud.deserializar("datos/", "listaAstronautas.dat");
                            System.out.println("Datos cargados correctamente");
                        } catch (IOException e) {
                            System.out.println("Error de archivo: " + e.getMessage());
                        } catch (ClassNotFoundException e) {
                            System.out.println("Error de clase: " + e.getMessage());
                        }
                        break;

                    case 8:
                        System.out.println("Saliendo...");
                        break;
                }
            }

        } while (opcion != 8);
    }

    public static void mostrarIMC(Astronauta a, double altura) {
        System.out.println(
                a.getClass().getSimpleName() +
                        " IMC: " + a.obtenerIMC(altura)
        );
    }

    public static Astronauta crearAstronauta(Scanner sc) throws IllegalArgumentException {

        System.out.println("Tipo:");
        System.out.println("1. Ingeniero");
        System.out.println("2. Piloto");

        int tipo = sc.nextInt();

        if (tipo != 1 && tipo != 2) {
            throw new IllegalArgumentException("Tipo de astronauta inválido: " + tipo);
        }

        System.out.print("Nombre: ");
        String nombre = sc.next();

        if (nombre == null || nombre.isEmpty()) {
            throw new IllegalArgumentException("El nombre no puede estar vacío");
        }

        System.out.print("Edad: ");
        int edad = sc.nextInt();

        if (edad <= 0) {
            throw new IllegalArgumentException("La edad debe ser mayor a 0");
        }

        System.out.print("Peso: ");
        double peso = sc.nextDouble();

        if (peso <= 0) {
            throw new IllegalArgumentException("El peso debe ser mayor a 0");
        }

        System.out.print("ID: ");
        String id = sc.next();

        if (id == null || id.isEmpty()) {
            throw new IllegalArgumentException("El ID no puede estar vacío");
        }

        if (tipo == 1) {
            System.out.print("Especialidad: ");
            String especialidad = sc.next();
            return new Ingeniero(nombre, edad, peso, id, especialidad);
        } else {
            System.out.print("Licencia: ");
            String licencia = sc.next();
            return new Piloto(nombre, edad, peso, id, licencia);
        }
    }
}