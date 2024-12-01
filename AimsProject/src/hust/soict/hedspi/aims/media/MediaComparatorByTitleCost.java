package hust.soict.hedspi.aims.media;
import java.util.Comparator;
public class MediaComparatorByTitleCost implements Comparator<Media> {

    @Override
    public int compare(Media m1, Media m2) {
        // So sánh tiêu đề (tăng dần)
        int titleComparison = m1.getTitle().compareTo(m2.getTitle());
        
        // Nếu tiêu đề khác nhau, trả về kết quả so sánh tiêu đề
        if (titleComparison != 0) {
            return titleComparison;
        }
        
        // Nếu tiêu đề giống nhau, so sánh chi phí (giảm dần)
        return Float.compare(m2.getCost(), m1.getCost());
    }
}
