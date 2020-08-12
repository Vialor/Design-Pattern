package observer;

public class Main {
    public static void main(String[] args) {
        Observer o = new Observer();
        Subject s = new Subject("test", 10);
        s.addPropertyChangeListener(o);
        s.setData(12);
    }
}