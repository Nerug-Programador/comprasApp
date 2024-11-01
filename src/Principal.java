import com.nerugdeveloper.comprasapp.modelo.Articulo;
import com.nerugdeveloper.comprasapp.modelo.TarjetaDeCredito;
import java.util.ArrayList;
import java.util.Scanner;

// Define la clase Principal que contiene el método main
public class Principal {
    public static void main(String[] args) {
        // Crea un objeto Scanner para leer la entrada del usuario desde la consola
        Scanner entradaUsuario = new Scanner(System.in);

        // Crea una instancia de la clase TarjetaDeCredito para manejar el saldo
        TarjetaDeCredito miSaldo = new TarjetaDeCredito();

        // Crea una instancia de la clase Articulo para manejar el nombre del artículo
        Articulo miArticulo = new Articulo();

        // Crea otra instancia de la clase Articulo para manejar el costo del artículo
        Articulo costoDelArticulo = new Articulo();

        // Crea una lista de ArrayList para almacenar los artículos comprados
        ArrayList<String> listArticulos = new ArrayList<>();

        // Solicita al usuario que ingrese el saldo de la tarjeta de crédito
        System.out.println("Ingresa el saldo de la tarjeta de crédito");
        miSaldo.setSaldo(entradaUsuario.nextDouble());

        // Bucle que continúa mientras haya suficiente saldo para comprar el artículo
        while (true) {
            // Solicita al usuario que ingrese el nombre del artículo que desea comprar
            System.out.println("Que artículo desea comprar");
            entradaUsuario.nextLine(); // Consumir el salto de línea pendiente
            miArticulo.setArticulo(entradaUsuario.nextLine());

            // Solicita al usuario que ingrese el valor del artículo
            System.out.println("Indica el valor del artículo");
            costoDelArticulo.setCostoArticulo(entradaUsuario.nextDouble());

            // Verifica si el saldo es suficiente para realizar la compra
            if (miSaldo.getSaldo() >= costoDelArticulo.getCostoArticulo()) {
                // Actualiza el saldo restante restando el costo del artículo
                miSaldo.setSaldo(miSaldo.getSaldo() - costoDelArticulo.getCostoArticulo());

                // Añade el artículo comprado a la lista de artículos
                listArticulos.add(miArticulo.getArticulo() + " - $" + costoDelArticulo.getCostoArticulo());
            } else {
                // Indica que el saldo es insuficiente para realizar la compra
                System.out.println("Su saldo es insuficiente para comprar el artículo: " + miArticulo.getArticulo());

                // Salir del bucle si el saldo es insuficiente
                break;
            }
        }

        // Imprimir la lista de artículos comprados
        System.out.println("Artículos comprados:");
        for (String articulo : listArticulos) {
            System.out.println(articulo);
        }

        // Imprimir el saldo restante
        System.out.println("Saldo restante: $" + miSaldo.getSaldo());
    }
}