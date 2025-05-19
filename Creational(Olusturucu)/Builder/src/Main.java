
public class Main {
    public static void main(String[] args) {


        House myHouse = new HouseBuilder()
                .buildfoundation("beton temel")
                .buildwalls("tuğla duvar")
                .buildroof("kiremit çatı")
                .build();

        myHouse.showHouse();
    }
}