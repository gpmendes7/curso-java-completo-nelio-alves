package br.com.gpmendes7.abstracao.entities;

import br.com.gpmendes7.abstracao.entities.enums.Color;

public abstract class Shape {

    private Color color;

    public Shape() {

    }

    public Shape(Color color) {
        this.color = color;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public abstract double area();
}
