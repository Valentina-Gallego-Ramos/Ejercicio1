import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        metodos m = new metodos();

        System.out.println("Cuantas filas desea?");
        int filas = teclado.nextInt();

        System.out.println("Cuantas columnas desea?");
        int columnas = teclado.nextInt();

        objProducto[][] matriz = new objProducto[filas][columnas];

        // Registrar productos
        matriz = m.registrarProductos(matriz);

        teclado.nextLine(); // limpiar buffer

        // Buscar producto
        System.out.println("Ingrese el nombre del producto a buscar:");
        String nombre = teclado.nextLine();

        m.buscarProducto(matriz, nombre);
    }
}
