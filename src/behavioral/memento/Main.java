package src.behavioral.memento;

public class Main {
    public static void main(String[] args) {
        probarMemento();
    }

    private static void probarMemento(){
        Carataker carataker = new Carataker();

        Article article = new Article("Alberto","Memento es una pelicula");
        System.out.println("Article: " + article.getText());
        carataker.addMemento(article.createMemento());

        article.setText(article.getText() + " protagonizada por Guy Pearce ");
        System.out.println("Article: " + article.getText());
        carataker.addMemento(article.createMemento());

        article.setText(article.getText()+" y leonardo DiCaprio");
        System.out.println("Article: " + article.getText());

        article.restoreMemento(carataker.getMemento(0));
        System.out.println("Article: " + article.getText());
    }
}
