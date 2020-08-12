package decorator;

public class PlainComponent implements Component {

    @Override
    public String produce() {
        return "simple component";
    }
    
}