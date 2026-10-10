package clinica;

import java.util.Locale;

public class Paciente {

    // Atributos

    private String nombre;
    private String identificacion;
    private int edad ;
    private String epicrisis;
    private String genero;


    // Constructor

    public Paciente () {
    }



    // Metodo

    public int asignarTriage (String sintomas) {

        String sintomasProcesados = sintomas.toLowerCase();


        // Nivel 1: Rojo
        if (sintomasProcesados.contains("Paro") ||
                sintomasProcesados.contains("Cardiaco") ||
                sintomasProcesados.contains("Trauma craneocefalico") ||
                sintomasProcesados.contains("Hemorragia") ||
                sintomasProcesados.contains("Inconsiente")) {
            return 1;
            }

        // Nivel 2: Naranja
        if (sintomasProcesados.contains("Dolor fuerte") ||
                sintomasProcesados.contains("Respirar") ||
                sintomasProcesados.contains("Pecho") ||
                sintomasProcesados.contains("FiebreAlta")) {
            return 2;
        }

        // Nivel 3: Amarillo
        if (sintomasProcesados.contains("Fiebre") ||
                sintomasProcesados.contains("Vomito") ||
                sintomasProcesados.contains("Diarrea") ||
                sintomasProcesados.contains("Tos") ||
                sintomasProcesados.contains("Dolor de cabeza")) {
            return 3;
        }

        // Nivel 4: Verde
        if (sintomasProcesados.contains("Dolor leve") ||
                sintomasProcesados.contains("Gripe") ||
                sintomasProcesados.contains("Resfriado") ||
                sintomasProcesados.contains("Malestar")) {
            return 4;
        }

        // Nivel 5: Azul

        return 5;
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getEpicrisis() {
        return epicrisis;
    }

    public void setEpicrisis(String epicrisis) {
        this.epicrisis = epicrisis;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }


}










