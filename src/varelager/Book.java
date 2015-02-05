package varelager;
import actors.Author;
import actors.Publisher;

/**
 * Created by andreas on 30.01.15.
 */
public class Book {
    private String isbnNr;
    private String name;
    private Author author;
    private Publisher publisher;

    public Book(String isbnNr, String name, Author author, Publisher publisher) {
        this.isbnNr = isbnNr;
        this.name = name;
        this.author = author;
        this.publisher = publisher;
    }

    public String getIsbnNr() {
        return isbnNr;
    }

    public void setIsbnNr(String isbnNr) {
        this.isbnNr = isbnNr;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public Publisher getPublisher() {
        return publisher;
    }

    public void setPublisher(Publisher publisher) {
        this.publisher = publisher;
    }
}
