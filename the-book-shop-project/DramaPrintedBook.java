public class DramaPrintedBook extends DramaBook implements PrintedBook {
private String weight;
private String dimensions;

public DramaPrintedBook(String title, String author, int yearOfPublication,
String time, String place, String dimensions, String weight) {
    super(title, author, yearOfPublication, time, place);
    this.dimensions = dimensions;
    this.weight = weight;
}

public String getDimensions() {
    return dimensions;
}

public String getWeight() {
    return weight;
}

public void print() {
    super.print();
    System.out.printf("Dimensions: %s\nWeight: %s\n", 
    getDimensions(), getWeight());
}
}