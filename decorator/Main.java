package decorator;

public class Main {
    public static void main (String[] args) {
        Component c = new DecoA(new PlainComponent());
        System.out.println(c.produce());
    }
}