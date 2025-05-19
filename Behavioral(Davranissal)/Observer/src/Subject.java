public interface Subject {

    void subscribe(Observer o);
    void unsubscribe(Observer o);
    void notifyObservers(String news);


}
