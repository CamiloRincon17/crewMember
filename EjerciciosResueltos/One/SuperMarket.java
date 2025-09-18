package EjerciciosResueltos.One;

public class SuperMarket {
    String ProductName;
    double Price;
    int Quantity;
    public SuperMarket(String ProductName, double Price, int Quantity) {
        this.ProductName = ProductName;
        this.Price = Price;
        this.Quantity = Quantity;
    }
    public void ProductVat(){
        double Vat = Price * 0.16;
        System.out.println("The VAT for the product " + ProductName + " is: " + Vat);
    }
}
