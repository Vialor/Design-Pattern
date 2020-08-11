package observer.concept;

public class ConcreteObserver implements Observer{

    @Override
    public void update(ConcreteSubject dataSubject) {
        if (dataSubject.getData() > 10){
            System.out.println("oberser detects that data is bigger than 10");
        }
    }
    
}