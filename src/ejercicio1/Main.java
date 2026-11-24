package ejercicio1;

public class Main {
    public static void main(String[] args) {
        Jugador j1 = new Jugador("Lucas");
        Jugador j2 = new Jugador("Martina");

        System.out.println("--- Datos iniciales ---");
        System.out.println(j1.getNombre() + " | Nivel: " + j1.getNivel() + " | Puntos: " + j1.getPuntos());
        System.out.println(j2.getNombre() + " | Nivel: " + j2.getNivel() + " | Puntos: " + j2.getPuntos());

        j1.ganarPuntos(150);
        j2.ganarPuntos(200);
        j1.ganarPuntos(-50);
        j2.subirNivel();

        System.out.println("\n--- Datos finales ---");
        System.out.println(j1.getNombre() + " | Nivel: " + j1.getNivel() + " | Puntos: " + j1.getPuntos());
        System.out.println(j2.getNombre() + " | Nivel: " + j2.getNivel() + " | Puntos: " + j2.getPuntos());
    }
}