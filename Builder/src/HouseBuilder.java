public class HouseBuilder {

    private House house;

    public HouseBuilder() {
        house = new House();
    }

    public HouseBuilder buildfoundation(String foundation) {
        house.setFoundation(foundation);
        return this;
    }

    public HouseBuilder buildwalls(String walls) {
        house.setWalls(walls);
        return this;
    }

    public HouseBuilder buildroof(String roof) {
        house.setRoof(roof);
        return this;
    }

    public House build() {
        return house;
    }

}
