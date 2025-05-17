public class Warrior implements Character{

    private String name;
    private String weapon;

    public Warrior(String name, String weapon){
        this.name = name;
        this.weapon = weapon;
    }


    @Override
    public Character clone(){
        return new Warrior(this.name, this.weapon);
    }

    @Override
    public  void display(){
        System.out.println("Savaşçı: " + name + ", Silah: " + weapon);
    }

}
