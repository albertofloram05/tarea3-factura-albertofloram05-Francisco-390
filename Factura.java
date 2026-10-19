
import java.util.Scanner;

public class Factura {

    static final double IVA = 0.21;
    static final String PROPIETARIO = "albertofloram05-Francisco-390";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== FACTURA de " + PROPIETARIO + " ===");
        System.out.print("Producto: ");
        String producto = sc.nextLine();

        System.out.print("Precio unitario: ");
        double precio = sc.nextDouble();

        System.out.print("Cantidad: ");
        int cantidad = sc.nextInt();

        System.out.print("Es cliente socio (s/n): ");
        boolean socio = sc.next().equals("s");

        double base = precio * cantidad;

        double descuento = calcularDescuento(base, socio);
        double total = aplicarIVA(base - descuento);

        System.out.println("Producto: " + producto);
        System.out.printf("Base: %.2f euros%n", base);
        System.out.printf("Descuento: %.2f euros%n", descuento);
        System.out.printf("Total con IVA: %.2f euros%n", total);

        sc.close();
    }

    static double calcularDescuento(double base, boolean socio) {
        double descuento = 0;

        if (base > 100) {
            descuento = base * 0.10;
        }

        if (socio) {
            descuento += base * 0.05;
        }

        return descuento;
    }

    static double aplicarIVA(double importe) {
        return importe * (1 + IVA);
    }
}
