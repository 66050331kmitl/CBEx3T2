package com.bound.properties;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeEvent;

public class Subscriber implements PropertyChangeListener {
    private String name;

    public Subscriber(String name) {
        this.name = name;
    }

    @Override
    public void propertyChange(PropertyChangeEvent evt) {
        System.out.println(name + " live result: " + evt.getNewValue());
    }

}
