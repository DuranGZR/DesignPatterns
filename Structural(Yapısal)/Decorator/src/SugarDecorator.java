public class SugarDecorator extends CoffeeDecorator{

    public SugarDecorator(Coffee coffee) {
        super(coffee);
    }

    public String getDescription() {
        return coffee.getDescription() + ", şeker";
    }

    public double getPrice() {
        return coffee.getPrice() + 1.0;
    }
}
