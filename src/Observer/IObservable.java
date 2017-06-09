package Observer;

public interface IObservable {
    void addObserver(IObserver observer);
    void notifyObserver();
}
