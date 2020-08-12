package decorator;

public class DecoA extends ComponentDecorator{

    public DecoA(Component component) {
        super(component);
    }
    
    @Override
    public String produce(){
        return super.produce() + " with decoA";
    }
}