package hust.soict.hedspi.aims.media;
public class Disc extends Media {
    protected int length;
    private String director;

    // Constructor
    public Disc(int id, String title, String category, float cost, int length, String director) {
        super(id, title, category, cost);
        this.length = Math.max(length, 0); // Đảm bảo chiều dài không âm
        this.director = (director != null && !director.isEmpty()) ? director : "Unknown"; // Xử lý null/empty
    }

    // Getter cho length
    public int getLength() {
        return length;
    }

    // Setter cho length (nếu cần)
    public void setLength(int length) {
        if (length >= 0) {
            this.length = length;
        } else {
            System.out.println("Invalid length. Length must be non-negative.");
        }
    }

    // Getter cho director
    public String getDirector() {
        return director;
    }

    // Setter cho director (nếu cần)
    public void setDirector(String director) {
        if (director != null && !director.isEmpty()) {
            this.director = director;
        } else {
            System.out.println("Invalid director. Cannot set to null or empty.");
        }
    }

    // Phương thức toString để hiển thị thông tin của Disc
    @Override
    public String toString() {
        return String.format("Disc [ID=%d, Title=%s, Category=%s, Cost=%.2f, Length=%d, Director=%s]",
                getId(), getTitle(), getCategory(), getCost(), length, director);
    }
}
