package hust.soict.hedspi.aims.media;
import java.util.Comparator;

public class MediaComparatorByCostTitle implements Comparator<Media> {

    @Override
    public int compare(Media m1, Media m2) {
        // So sánh theo cost (giảm dần)
        int costComparison = Float.compare(m2.getCost(), m1.getCost());
        
        // Nếu cost khác nhau, trả về kết quả so sánh cost
        if (costComparison != 0) {
            return costComparison;
        }
        
        // Nếu cost bằng nhau, so sánh theo title (tăng dần)
        return m1.getTitle().compareTo(m2.getTitle());
    }
}
