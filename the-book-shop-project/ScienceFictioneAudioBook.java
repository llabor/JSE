public class ScienceFictioneAudioBook extends ScienceFictionBook implements eAudioBook {
private String size;
private int numberOfTracks;

public ScienceFictioneAudioBook(String title, String author, 
int yearOfPublication, String subject, int numberOfTracks, String size) {
    super(title, author, yearOfPublication, subject);
    this.numberOfTracks = numberOfTracks;
    this.size = size;
}

public String getSize() {
    return size;
}

public int getNumberOfTracks() {
    return numberOfTracks;
}

public void print() {
    super.print();
    System.out.printf("Number of Tracks: %d\nSize: %s\n", 
    getNumberOfTracks(), getSize());
}
}