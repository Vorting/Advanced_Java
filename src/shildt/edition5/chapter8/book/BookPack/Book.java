package shildt.edition5.chapter8.book.BookPack;

public class Book {
    protected String author;
    protected String title;
    protected int pubDate;

    public Book(String t, String a, int d) {
        this.title = t;
        this.author = a;
        this.pubDate = d;
    }

    public void show() {
        System.out.println(title);
        System.out.println(author);
        System.out.println(pubDate);
        System.out.println();
    }

}
