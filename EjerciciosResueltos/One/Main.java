package EjerciciosResueltos.One;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        SuperMarket product1 = new SuperMarket("Laptop", 1200.00, 5);
        SuperMarket product2 = new SuperMarket("Smartphone", 800.00, 10);
        Scanner scanner = new Scanner(System.in);
        System.out.println("El producto "+product1.ProductName+" tiene un precio de: "+product1.Price+" y una cantidad de: "+product1.Quantity+"Lleva iva? (si/no)");
        String llevaIva="";
        llevaIva=scanner.nextLine();
        if(llevaIva.equalsIgnoreCase("si") || llevaIva.equalsIgnoreCase("s")){
            product1.ProductVat();
        }else{
            System.out.println("El producto no lleva iva");
            System.out.println("El producto "+product1.ProductName+" tiene un precio de: "+product1.Price+" y una cantidad de: "+product1.Quantity+".");
    }
}
}