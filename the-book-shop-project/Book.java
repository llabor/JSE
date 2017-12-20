public class Book {
private String title;
private String author;
private int yearOfPublication;

public Book(String title, String author, int yearOfPublication) {
    this.title = title;
    this.author = author;
    this.yearOfPublication = yearOfPublication;
}

public String getTitle() {
    return title;
}

public String getAuthor() {
    return author;
}

public int getYearOfPublication() {
    return yearOfPublication;
}

public void print() {
    System.out.printf("Title: %s\nAuthor: %s\nYear of publication: %d\n", 
    getTitle(), getAuthor(), getYearOfPublication());
}
}