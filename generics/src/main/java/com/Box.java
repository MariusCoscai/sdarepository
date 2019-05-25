package com;

public class Box<Object> {
    private Object object;

    public Object getObject() {
        return object;
    }

    public void setObject(Object object) {
        this.object = object;
    }

    public Box(Object object) {
        this.object = object;
    }
}
