
public class Main {
    public static void main(String[] args) {

        Warrior savasci = new Warrior("Duran","6 patlar");

        savasci.display();

        //Klonlama
        Warrior sacasci2 = (Warrior) savasci.clone();
        Warrior sacasci3 = (Warrior) savasci.clone();

        sacasci2.display();
        sacasci3.display();

    }
}