package exceptionHandling;

public class Product {
    double price;
    double discount;

    Product(double price,double discount) throws InvalidDiscountException , InvalidPriceException {
        if (price <= 0){
            throw new InvalidPriceException("Price must be greater than zero.");
        }
        if (discount < 50 || discount > 0){
            throw new InvalidDiscountException("Discount must be between 0% and 50%");
        }
        this.price = price;
        this.discount = discount;
    }

    double calculatePrice(){
        return price - (price - discount/100);
    }

    public static void main(String[] args) {
        try {
            double productPrice = 500;
            double discountPercent = 30;

            Product pd = new Product(productPrice , discountPercent);
            double finalPrice = pd.calculatePrice();
            System.out.println("Final price after discount : "+ finalPrice);
        }catch (InvalidPriceException | InvalidDiscountException e){
            System.out.println(e.getMessage());
        }
    }
}
