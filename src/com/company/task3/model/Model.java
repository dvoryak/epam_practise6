package com.company.task3.model;

public class Model {
    private double value;

    public Model() {
    }

    public Model(double value) {
        this.value = value;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public void increment() {
        value++;
    }

    public void decrement() {
        value--;
    }

    public void changSign() {
        value = - value;
    }

    @Override
    public String toString() {
        return "Model{" +
                "value=" + value +
                '}';
    }
}
