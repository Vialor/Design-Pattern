package observer;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

public class Observer implements PropertyChangeListener {

    @Override
    public void propertyChange(PropertyChangeEvent evt) {
        String msg = String.format("Data Changes Detected, %s: from %d to %d", ((Subject) evt.getSource()).getName(),
                evt.getOldValue(), evt.getNewValue());
        System.out.println(msg);
    }
}