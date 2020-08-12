package adaptor;

public class ObjectAdaptor implements Target {
    private AdapteeInterface adaptee;

    public ObjectAdaptor(Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    public void workIn220V() {
        this.adaptee.workIn110V();
    }
}