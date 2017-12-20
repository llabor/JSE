// Heritage
public class DramaBook extends Book {
private String time;
private String place;

public DramaBook(String title, String author, int yearOfPublication,
String time, String place) {
    super(title, author, yearOfPublication);
    this.time = time;
    this.place = place;
}

public String getTime() {
    return time;
}

public String getPlace() {
    return place;
}

public void print() {
    super.print();
    System.out.printf("Time: %s\nPlace: %s\n", getTime(), getPlace());
}
}
