package observer;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

public class Subject {
    private String name;
    private int data;
    private final PropertyChangeSupport changeSupport;

    public Subject(String name, int data) {
        this.data = data;
        this.name = name;
        changeSupport = new PropertyChangeSupport(this);
    }

    public String getName(){
        return name;
    }

    public int getData(){
        return data;
    }

    public void setData(int newData){
        if (this.data == newData) return;
        changeSupport.firePropertyChange("data", this.data, newData);
        this.data = newData;
    }

    public void addPropertyChangeListener(PropertyChangeListener pcl) {
        changeSupport.addPropertyChangeListener(pcl);
    }

    public void removePropertyChangeListener(PropertyChangeListener pcl) {
        changeSupport.removePropertyChangeListener(pcl);
    }
}