package hust.soict.hedspi.aims.media;

import java.util.Comparator;

public abstract class Media {
    private int id;
    private String title;
    private String category;
    private float cost;
    public static final Comparator<Media> COMPARE_BY_TITLE_COST = new MediaComparatorByTitleCost();
    public static final Comparator<Media> COMPARE_BY_COST_TITLE = new MediaComparatorByCostTitle();

  
    public Media(int id, String title, String category, float cost) {
        this.id = id;
        this.title = title;
        this.category = category;
        this.cost = cost;
    }

    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

   
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    // Getter và Setter cho category
    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    
    public float getCost() {
        return cost;
    }

    public void setCost(float cost) {
        this.cost = cost;
    }

    @Override
    public boolean equals(Object obj) {
        // Kiểm tra nếu đối tượng tham chiếu đến chính nó
        if (this == obj) {
            return true;
        }
    
        // Kiểm tra nếu đối tượng null hoặc không cùng lớp
        if (obj == null || !(obj instanceof Media)) {
            return false;
        }
    
        // Ép kiểu và so sánh các thuộc tính
        Media media = (Media) obj;
        return title != null && title.equals(media.title);
    }
    @Override
    public String toString() {
    return String.format(
        "Media [ID=%d, Title=%s, Category=%s, Cost=%.2f]",
        id, title, category, cost
    );
}

    
}