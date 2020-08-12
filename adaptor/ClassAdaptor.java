package adaptor;

public class ClassAdaptor extends Adaptee implements Target {
    @Override
    public void workIn220V() {
        super.workIn110V();
    }
}