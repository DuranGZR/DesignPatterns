public class MilkDecorator extends CoffeeDecorator{

    public MilkDecorator(Coffee coffee){
        super(coffee);
    }

    public String getDescription() {
        return coffee.getDescription() + ", süt";
    }

    public double getPrice() {
        return coffee.getPrice() + 2.0;
    }
}
