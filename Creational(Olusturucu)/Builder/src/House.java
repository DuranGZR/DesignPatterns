public class House {
    private String foundation;
    private String walls;
    private String roof;


    public void setFoundation(String foundation) {
        this.foundation = foundation;
    }

    public void setWalls(String walls) {
        this.walls = walls;
    }

    public void setRoof(String roof) {
        this.roof = roof;
    }

    public void showHouse() {
        System.out.println("Temel: " + foundation);
        System.out.println("Duvarlar: " + walls);
        System.out.println("Çatı: " + roof);
    }


}
