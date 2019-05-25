package com;

public class GenericBox<T> {   // T   inseamna orice tip de date, orice tip de obiect
    private T t;

    public GenericBox(T t) {
        this.t = t;
    }

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }
}
