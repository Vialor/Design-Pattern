package adaptor;

public class Main {
    public static void main (String[] args) {
        // Object Adaptee
        AdapteeInterface adaptee = new Adaptee();
        Target objectAdaptee = new ObjectAdaptor((Adaptee) adaptee);
        objectAdaptee.workIn220V();

        // Class Adaptee
        Target classAdaptee = new ClassAdaptor();
        classAdaptee.workIn220V();
    }
}