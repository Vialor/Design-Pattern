package observer.concept;
import java.util.List;
import java.util.ArrayList;

public class ConcreteSubject implements Subject{
    private List<Observer> observers = new ArrayList<Observer>();
    private int data = 0;

    @Override
    public void register(Observer o) {
        observers.add(o);
    }

    @Override
    public void unregister(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyObserver() {
        for (Observer o : observers){
            o.update(this);
        }
    }

    public void setData(int newData) {
        this.data = newData;
        notifyObserver();
    }

    public int getData(){
        return data;
    }
}