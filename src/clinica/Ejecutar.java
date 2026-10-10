package clinica;

import clinica.Paciente;
import java.util.Scanner;


public class Ejecutar {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Paciente paciente = new Paciente();

        System.out.println(":::::::::::::::::::::::::::::::::::::::::::::");
        System.out.println("::::        MORIDERO SOFT V1.28          ::::");
        System.out.println(":::::::::::::::::::::::::::::::::::::::::::::");
        System.out.println("Bienvenido a la clínica el moridero...");

        System.out.print("Ingrese el nombre del paciente: ");
        paciente.setNombre(sc.nextLine());

        System.out.print("Ingrese la identificación del paciente: ");
        paciente.setIdentificacion(sc.nextLine());

        System.out.print("Ingrese la edad del paciente: ");
        paciente.setEdad(Integer.parseInt(sc.nextLine()));

        System.out.print("Ingrese el género del paciente: M (Masculino) | F (Femenino)");
        paciente.setGenero(sc.nextLine());

        System.out.println("Ingrese la epicrisis del paciente: ");
        paciente.setEpicrisis(sc.nextLine());


        System.out.print("Ingrese los síntomas del paciente: ");
        String sintomas = sc.nextLine();
        int nivelTriage = paciente.asignarTriage(sintomas);
        System.out.println("Nivel de triage: " + nivelTriage);



        // tto

        String tratamiento;

        if(paciente.getGenero() == "M"){
            tratamiento = "Sr.";
        }else {
            tratamiento = "Sra.";
        }

        System.out.println("Paciente registrado: ");
        System.out.println(tratamiento + " " + paciente.getNombre());
    }

    }


