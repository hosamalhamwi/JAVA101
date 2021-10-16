import java.text.SimpleDateFormat;

public class Book {

    private String name;
    private Author author;
    private int publishedYear;

    public Book() {}

    private String publisherName;

    public Book(String name, Author author){
        this.name  = name;
        this.author = author;
    }

    public Book(String name , Author author , String publisherName){
        this.name = name;
        this.author = author;
        this.publisherName = publisherName;
    }

    public void setPublishedYear(int publishedYear) {
        this.publishedYear = publishedYear;
    }

    public void setPublisherName(String publisherName) {
        this.publisherName = publisherName;
    }

    public String getName() {
        return name;
    }

    public String getPublishedYear() {
        SimpleDateFormat ft = new SimpleDateFormat ("yyyy.MM.dd");

        return ft.format(publishedYear);
    }

    public String getPublisherName() {
        return publisherName;
    }

    public Author getAuthor() {
        return author;
    }
}
