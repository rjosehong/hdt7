public class Main {
    public static void main(String[] args) {
        Diccionario dic = new Diccionario();

        dic.cargarDiccionario("diccionario.txt");

        System.out.println("\n\nTraduccion:");
        dic.traducirTexto("texto.txt");
    }
}
