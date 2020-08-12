package decorator;

public abstract class ComponentDecorator implements Component {
    private Component component;

    public ComponentDecorator(Component component) {
        this.component = component;
    }

    @Override
    public String produce() {
        return this.component.produce();
    }

}