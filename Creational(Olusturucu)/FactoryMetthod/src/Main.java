public class Main {
    public static void main(String[] args) {

        Animal animal = AnimalFactory.createAnimal("dog");

        animal.speak(); // HAv HAv!

    }
}
