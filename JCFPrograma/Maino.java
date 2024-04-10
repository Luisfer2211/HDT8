package HDT8.JCFPrograma;


import java.io.*;
import java.util.*;

public class Maino {
    public static void main(String[] args) {
        PriorityQueue<Paciente> hospital = new PriorityQueue<>();
        String linea;

        try (BufferedReader br = new BufferedReader(new FileReader("pacientes.txt"))) {
            while ((linea = br.readLine()) != null) {
                String[] datos = linea.split(", ");
                Paciente paciente = new Paciente(datos[0], datos[1], datos[2].charAt(0));
                hospital.add(paciente);
            }
        } catch (IOException e) {
            System.out.println("Error al leer el archivo 'pacientes.txt'");
            e.printStackTrace();
        }

        while (!hospital.isEmpty()) {
            Paciente paciente = hospital.poll();
            System.out.println("El siguiente paciente a atender es: " + paciente);
        }
    }
}
