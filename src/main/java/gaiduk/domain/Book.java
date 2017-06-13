package gaiduk.domain;

/**
 * Created by igaiduk on 6/10/2017.
 */
public class Book {
    private final Integer id;
    private final String author;
    private final String title;
    private final String description;
    private final String yearOfPublishing;

    public Book(Integer id, String author, String title, String description, String yearOfPublishing){
        this.id = id;
        this.author = author;
        this.title = title;
        this.description = description;
        this.yearOfPublishing = yearOfPublishing;
    }

    public Integer getId(){return id;}
    public String getAuthor() {return author;}
    public String getTitle(){return title;}
    public String getDescription(){return description;}
    public String getYearOfPublishing(){return yearOfPublishing;}

}
