package hust.soict.hedspi.aims.media;

public class DigitalVideoDisc extends Disc implements Playable {
    // Biến static để đếm số lượng DVD
    private static int totalDvds = 0;

    // Constructor với chỉ tiêu đề
    public DigitalVideoDisc(String title) {
        super(generateId(), title, null, 0, 0, null);
    }

    // Constructor với category, title, và cost
    public DigitalVideoDisc(String category, String title, float cost) {
        super(generateId(), title, category, cost, 0, null);
    }

    // Constructor với director, category, title, và cost
    public DigitalVideoDisc(String director, String category, String title, float cost) {
        super(generateId(), title, category, cost, 0, director);
    }

    // Constructor với tất cả thuộc tính
    public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
        super(generateId(), title, category, cost, length, director);
    }

    // Tự động tạo ID cho DVD
    private static int generateId() {
        return ++totalDvds;
    }

    // Getter cho số lượng DVD
    public static int getTotalDvds() {
        return totalDvds;
    }

    // Kiểm tra tiêu đề có khớp không
    public boolean matchesTitle(String title) {
        return getTitle().equalsIgnoreCase(title.trim()); // Loại bỏ khoảng trắng và so sánh không phân biệt hoa thường
    }

    // Phương thức toString để in thông tin DVD
    @Override
    public String toString() {
        return String.format("DVD [ID=%d, Title='%s', Category='%s', Director='%s', Length=%d minutes, Cost=%.2f]",
                getId(), getTitle(), getCategory(), getDirector(), getLength(), getCost());
    }

    // Phương thức play từ giao diện Playable
    @Override
    public void play() {
        System.out.println("Playing DVD: " + getTitle());
        System.out.println("DVD length: " + getLength() + " minutes");
    }
}
