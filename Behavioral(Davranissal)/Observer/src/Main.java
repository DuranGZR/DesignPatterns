
public class Main {
    public static void main(String[] args) {

        NewsAgency agency = new NewsAgency();

        Observer ali = new NewsSubscriber("Ali");
        Observer ayşe = new NewsSubscriber("Ayşe");


        agency.subscribe(ali);
        agency.subscribe(ayşe);

        agency.addNews("dolar 100 tl");

        agency.unsubscribe(ali);

        agency.addNews("dolar 1 tl");

    }
}