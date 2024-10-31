import com.nerugdeveloper.comprasapp.modelo.Articulo;
import com.nerugdeveloper.comprasapp.modelo.TarjetaDeCredito;

import java.util.ArrayList;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner entradaUsuario = new Scanner(System.in);
        TarjetaDeCredito miSaldo = new TarjetaDeCredito();
        Articulo miArticulo = new Articulo();
        Articulo costoDelArticulo =new Articulo();
        ArrayList<String> listArticulos = new ArrayList<>();

        System.out.println("Ingresa el saldo de la tarjeta de crédito");
        miSaldo.setSaldo(entradaUsuario.nextInt());

        while (miSaldo.getSaldo() > costoDelArticulo.getCostoArticulo() ){


            System.out.println("Que articulo desa comprar");
            entradaUsuario.nextLine();
            miArticulo.setArticulo(entradaUsuario.nextLine());

            System.out.println("Indica el valor del articulo");
            costoDelArticulo.setCostoArticulo(entradaUsuario.nextInt());

            miSaldo.setSaldo(miSaldo.getSaldo()- costoDelArticulo.getCostoArticulo());


            if (miSaldo.getSaldo() >= costoDelArticulo.getCostoArticulo()){
                listArticulos.add(miArticulo.getArticulo() + costoDelArticulo.getArticulo());
            }else {
                System.out.println("Su saldo es insuficiente");
                System.out.println(listArticulos.getClass());
            }

        }

    }
}