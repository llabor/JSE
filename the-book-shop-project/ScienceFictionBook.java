public class ScienceFictionBook extends Book {
private String subject;

public ScienceFictionBook(String title, String author, 
int yearOfPublication, String subject) {
    super(title, author, yearOfPublication);
    this.subject = subject;
}

public String getSubject() {
    return subject;
}

public void print() {
    super.print();
    System.out.printf("Subject: %s\n", getSubject());
}
}