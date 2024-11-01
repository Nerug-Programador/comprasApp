# conprasApp

## Descripción
**ComprasApp** es una aplicación desarrollada en Java que permite a los usuarios gestionar sus compras utilizando una tarjeta de    crédito. Los usuarios pueden añadir artículos a una lista de compras, especificar el costo de cada artículo y realizar la compra mientras se actualiza el saldo disponible en la tarjeta. La aplicación también permite visualizar los artículos comprados y el saldo restante en la tarjeta.

## Características
* **Gestión de Artículos:** Añade artículos con sus nombres y costos a una lista de compras.

* **Saldo de Tarjeta de Crédito:** Configura y actualiza el saldo de la tarjeta de crédito.

* **Proceso de Compra:** Realiza compras mientras verifica y actualiza el saldo disponible.

* **Visualización de Compras:** Imprime una lista de los artículos comprados y muestra el saldo restante.

## Instalación
1. **Clona el repositorio:**
    

    git clone https://github.com/Nerug-Programador/comprasapp.git


2. **Navega al directorio del proyecto:**


    cd comprasapp

3. **Compila y ejecuta el proyecto:**


    javac -d bin src/com/nerugdeveloper/comprasapp/principal/Principal.java

    java -cp bin com.nerugdeveloper.comprasapp.principal.Principal

## Uso

1. **Ingresar el Saldo:** Al iniciar la aplicación, se solicita al usuario que ingrese el saldo de la tarjeta de crédito.

2. **Añadir Artículos:** El usuario ingresa el nombre y el costo de cada artículo que desea comprar.

3. **Verificación del Saldo:** La aplicación verifica si el saldo es suficiente para realizar la compra.

4. **Actualización del Saldo:** Si el saldo es suficiente, se actualiza restando el costo del artículo.

5. **Visualización de Compras:** Al finalizar, se muestra una lista de los artículos comprados y el saldo restante.

## Estructura del Proyecto
## Clases Principales
*   **Principal.java:** Contiene el método ``main`` y coordina la interacción entre las clases.
    *   Solicita la entrada del usuario para el saldo y los artículos.

    *   Verifica y actualiza el saldo durante el proceso de compra.

    *   Imprime la lista de artículos comprados y el saldo restante.


*   **Articulo.java:** Clase que representa un artículo.
    *   Atributos: ``nombre``, ``costo``.

    *   Métodos: ``getArticulo``, ``setArticulo``, ``getCostoArticulo``, ``setCostoArticulo``.


*   **TarjetaDeCredito.java:** Clase que representa una tarjeta de crédito.
    *   Atributos: ``saldo``.

    *   Métodos: ``getSaldo``, ``setSaldo``.

## Ejemplo de Código

public class Principal {
public static void main(String[] args) {
Scanner entradaUsuario = new Scanner(System.in);
TarjetaDeCredito miSaldo = new TarjetaDeCredito();
Articulo miArticulo = new Articulo();
Articulo costoDelArticulo = new Articulo();
ArrayList<String> listArticulos = new ArrayList<>();

        System.out.println("Ingresa el saldo de la tarjeta de crédito");
        miSaldo.setSaldo(entradaUsuario.nextDouble());

        while (true) {
            System.out.println("Que artículo desea comprar");
            entradaUsuario.nextLine(); // Consumir el salto de línea pendiente
            miArticulo.setArticulo(entradaUsuario.nextLine());

            System.out.println("Indica el valor del artículo");
            costoDelArticulo.setCostoArticulo(entradaUsuario.nextDouble());

            if (miSaldo.getSaldo() >= costoDelArticulo.getCostoArticulo()) {
                miSaldo.setSaldo(miSaldo.getSaldo() - costoDelArticulo.getCostoArticulo());
                listArticulos.add(miArticulo.getArticulo() + " - $" + costoDelArticulo.getCostoArticulo());
            } else {
                System.out.println("Su saldo es insuficiente para comprar el artículo: " + miArticulo.getArticulo());
                break; // Salir del bucle si el saldo es insuficiente
            }
        }

        // Imprimir la lista de artículos
        System.out.println("Artículos comprados:");
        for (String articulo : listArticulos) {
            System.out.println(articulo);
        }

        // Imprimir el saldo restante
        System.out.println("Saldo restante: $" + miSaldo.getSaldo());
    }
}


## Autor
**William German Aranguren Buitrago** - https://github.com/Nerug-Programador

## Licencia
Este proyecto no tiene una licencia específica.