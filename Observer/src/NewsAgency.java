import java.util.ArrayList;
import java.util.List;

public class NewsAgency implements Subject{
    private List<Observer> observers = new ArrayList<>();

    @Override
    public void subscribe(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void unsubscribe(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers(String news){
        for (Observer observer : observers) {
            observer.update(news);
        }
    }

    public void addNews(String news){
        System.out.println("Yeni haber : "+news);
        notifyObservers(news);
    }
}
