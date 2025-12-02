package Utils;

public class Estilos {
    public static final String RESET = "\u001B[0m";

    // Cores
    public static final String LARANJA = "\u001B[38;5;208m";
    public static final String BEGE = "\u001B[38;5;187m";
    public static final String DOURADO = "\u001B[33m";
    public static final String NEGRITO = "\u001B[1m";

    // Caixa de texto
    public static void caixa(String titulo) {
        System.out.println(LARANJA + NEGRITO);
        System.out.println("╔════════════════════════════════════════╗");
        System.out.println("║   " + titulo);
        System.out.println("╚════════════════════════════════════════╝" + RESET);
    }

    public static void linha() {
        System.out.println(LARANJA + "────────────────────────────────────────────" + RESET);
    }
}