import com.nerugdeveloper.comprasapp.modelo.Articulo;
import com.nerugdeveloper.comprasapp.modelo.TarjetaDeCredito;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entradaUsuario = new Scanner(System.in);
        TarjetaDeCredito miSaldo = new TarjetaDeCredito();
        Articulo miArticulo = new Articulo();
        Articulo costoDelArticulo =new Articulo();

        System.out.println("Ingresa el saldo de la tarjeta de crédito");
        miSaldo.setSaldo(entradaUsuario.nextInt());

        System.out.println("Que articulo desa comprar");
        entradaUsuario.nextLine();
        miArticulo.setArticulo(entradaUsuario.nextLine());

        System.out.println("Que articulo desa comprar");
        costoDelArticulo.setCostoArticulo(entradaUsuario.nextInt());

        

        System.out.println("su saldo actual es: " + miSaldo.getSaldo());
        System.out.println("el articulo a comprar es: " + miArticulo.getArticulo());
        System.out.println("el costo del articulo es: "+ costoDelArticulo.getCostoArticulo());
    }
}