package ejercicio2;

public class Main {
	
    public static void main(String[] args) {
        Docente docente = new Docente("Carlos", 40, "Programación");
        Preceptor preceptor = new Preceptor("Laura", 32, "5to B");

        docente.mostrarInformacion();
        preceptor.mostrarInformacion();

        docente.setEdad(41);
        docente.setEdad(-5); 

        System.out.println("\n--- Luego de modificar la edad ---");
        docente.mostrarInformacion();
    }
}