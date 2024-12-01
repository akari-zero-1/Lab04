package hust.soict.hedspi.aims.media;

import java.util.ArrayList;
import java.util.List;

public class book extends media {
    private List<String> author =new ArrayList<>(); 
    public book(int id, String title, String category, float cost) {
        super(id, title, category, cost);
    }
    public List<String> get_author(){
        return author;
    }
    public void addAuthor(String authorName) {
        if (authorName != null && !authors.contains(authorName)) {
            authors.add(authorName);
        }
    }
    public void removeAuthor(String authorName) {
        if (authorName != null && authors.contains(authorName)) {
            authors.remove(authorName);
        }
    }
    @Override
public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("Book [")
           .append("ID=").append(getId()).append(", ")
           .append("Title=").append(getTitle()).append(", ")
           .append("Category=").append(getCategory()).append(", ")
           .append("Cost=").append(getCost()).append(", ")
           .append("Authors=").append(String.join(", ", authors))
           .append("]");
    return builder.toString();
}

    
    
}

