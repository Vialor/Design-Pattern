package observer.concept;

public class Main {
    public static void main(String[] args){
        // setup
        System.out.println("=======Observer Pattern=======");

        ConcreteSubject subject = new ConcreteSubject();
        Observer observer = new ConcreteObserver();
        subject.register(observer);

        // test
        subject.setData(100);

    }
}