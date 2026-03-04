package br.com.gpmendes7.enumcomposicao.entities;

public class Comment {

    private String text;

    public Comment() {

    }

    public Comment(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
