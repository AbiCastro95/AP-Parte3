package ejercicio5;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

/*
 * @author Abi Castro
 */
public class Colegio {

    private Scanner read = new Scanner(System.in);;
    private HashSet<Alumnos> lista;

    public Colegio() {
        this.lista = new HashSet<>();
    }

    public void addStudent(Alumnos student) {
        lista.add(student);
        System.out.println("Se ha agregado al estudiante: " + student);
    }

    public void removeStudent() {
        Iterator<Alumnos> iterator = lista.iterator();

        System.out.print("Ingrese el legajo del estudiante que desea remover: ");
        String legajo = read.next();
        System.out.println("");

        while (iterator.hasNext()) {
            Alumnos auxStudent = iterator.next();

            if (auxStudent.getLegajo().equalsIgnoreCase(legajo)) {
                iterator.remove();
                System.out.println("Se ha quitado al estudiante: " + auxStudent);
            }
        }
    }

    public void seeAll() {
        for (Alumnos aux : this.lista) {
            System.out.println(aux);
        }
    }

    public void sortByLastName() {
        ArrayList<Alumnos> list = new ArrayList<>(lista);

        list.sort(new Comparator<Alumnos>() {
            @Override
            public int compare(Alumnos student1, Alumnos student2) {
                return student1.getApellido().compareToIgnoreCase(student2.getApellido());
            }
        });

        for (Alumnos student : list) {
            System.out.println(student.toString());
        }
    }

    public void sortByCharacter() {
        ArrayList<Alumnos> list = new ArrayList<>(lista);

        System.out.print("Ingrese la inicial de los estudiantes a ordenar: ");
        String inicial = read.next();
        char character = Character.toUpperCase(inicial.charAt(0));

        System.out.println("Listado de alumnos cuyo apellido comienza con " + character);

        for (Alumnos student : list) {
            if (Character.toUpperCase(student.getApellido().charAt(0)) == character) {
                System.out.println(student);
            }
        }
    }

    public void menu() {
        System.out.println("-------BIENVENIDO-------");
        System.out.print("1| Ingresar estudiante.\n2| Remover estudiante.\n3| Listar todo.\n4| Listar por Apellido.\n5| Listar por Inicial.\n");
        System.out.println("Presione 0 para salir.");
        int answer = read.nextInt();
        read.nextLine();

        mainLoop:
        do {
            switch (answer) {
                case 1:

                    while (true) {
                        System.out.println("--------INGRESAR ESTUDIANTES--------");
                        System.out.print("Ingrese Legajo: ");
                        String l = read.nextLine();
                        System.out.print("Ingrese Apellido: ");
                        String a = read.nextLine();
                        System.out.print("Ingrese Nombre: ");
                        String n = read.nextLine();
                        System.out.print("Ingrese el año de cursado: ");
                        int g = read.nextInt();
                        read.nextLine();

                        addStudent(new Alumnos(l, a, n, g));
                        System.out.println("");

                        System.out.println("¿Desea ingresar otro estudiante? S|N");
                        String choice = read.nextLine();
                        if (choice.equalsIgnoreCase("N")) {
                            System.out.println("Gracias por utilizar el servicio.");
                            break;
                        }
                    }
                    break;
                case 2:
                    removeStudent();
                    break;
                case 3:
                    System.out.println("------------LISTAR TODOS------------");
                    seeAll();
                    break;
                case 4:
                    System.out.println("--------LISTADO POR APELLIDO--------");
                    sortByLastName();
                    break;
                case 5:
                    System.out.println("---------LISTAR POR INICIAL---------");
                    sortByCharacter();
                    break;
                case 0:
                    System.out.println("Saliendo del programa. ¡Hasta luego!");
                    break mainLoop;
                default:
                    System.out.println("Opción inválida.");
                    break;
            }
            System.out.println("");

            System.out.println("-------BIENVENIDO-------");
            System.out.print("1| Ingresar estudiante.\n2| Remover estudiante.\n3| Listar todo.\n4| Listar por Apellido.\n5| Listar por Inicial.\n");
            System.out.println("Presione 0 para salir.");
            answer = read.nextInt();
            read.nextLine();
        } while (true);

        read.close();
    }
}