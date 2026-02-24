import java.util.Scanner;

public class metodos {

    Scanner teclado = new Scanner(System.in);

    public objProducto[][] registrarProductos(objProducto[][] matriz) {

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {

                objProducto o = new objProducto();

                System.out.println("\nProducto en posición [" + i + "][" + j + "]");

                System.out.print("Ingrese el nombre del producto: ");
                o.setNombre(teclado.nextLine()); // nextLine para permitir espacios

                System.out.print("Ingrese el precio: ");
                o.setPrecio(teclado.nextDouble());
                teclado.nextLine(); // 🔥 limpiar buffer

                System.out.print("Ingrese la cantidad: ");
                o.setCantidad(teclado.nextInt());
                teclado.nextLine(); // 🔥 limpiar buffer

                matriz[i][j] = o;
            }
        }

        return matriz;
    }

    public void buscarProducto(objProducto[][] matriz, String nombreBuscado) {

        boolean encontrado = false;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {

                if (matriz[i][j] != null &&
                        matriz[i][j].getNombre().equalsIgnoreCase(nombreBuscado)) {

                    System.out.println("\nProducto encontrado:");
                    System.out.println("Fila: " + i + " | Columna: " + j);
                    System.out.println(matriz[i][j]);
                    encontrado = true;
                }
            }
        }

        if (!encontrado) {
            System.out.println("\nProducto no encontrado.");
        }
    }
}
