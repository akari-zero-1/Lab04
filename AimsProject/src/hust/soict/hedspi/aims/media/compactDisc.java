package hust.soict.hedspi.aims.media;
import java.util.ArrayList;
import java.util.List;
   
   public class CompactDisc extends Disc implements Playable {
       private String artist;
       private List<Track> tracks;
   
       // Constructor
       public CompactDisc(int id, String title, String category, float cost, int length, String director, String artist) {
           super(id, title, category, cost, length, director);
           this.artist = artist;
           this.tracks = new ArrayList<>();
       }
   
       // Getter cho artist
       public String getArtist() {
           return artist;
       }
   
       // Thêm track vào danh sách
       public void addTrack(Track track) {
           if (track == null) {
               System.out.println("Invalid track. Cannot add null track.");
               return;
           }
           if (tracks.contains(track)) {
               System.out.println("Track already exists in the list: " + track.getTitle());
           } else {
               tracks.add(track);
               System.out.println("Added track: " + track.getTitle());
           }
       }
   
       // Xóa track khỏi danh sách
       public void removeTrack(Track track) {
           if (track == null) {
               System.out.println("Invalid track. Cannot remove null track.");
               return;
           }
           if (tracks.remove(track)) {
               System.out.println("Removed track: " + track.getTitle());
           } else {
               System.out.println("Track not found in the list: " + track.getTitle());
           }
       }
   
       // Tính tổng độ dài của tất cả các track
       public int getLength() {
           return tracks.stream().mapToInt(Track::getLength).sum();
       }
   
       // Phương thức toString để hiển thị thông tin CD
       @Override
       public String toString() {
           StringBuilder builder = new StringBuilder();
           builder.append("CompactDisc [")
                  .append("ID=").append(getId()).append(", ")
                  .append("Title=").append(getTitle()).append(", ")
                  .append("Category=").append(getCategory()).append(", ")
                  .append("Cost=").append(getCost()).append(", ")
                  .append("Artist=").append(artist).append(", ")
                  .append("Total Tracks=").append(tracks.size())
                  .append("]");
           return builder.toString();
       }
   
       // Phương thức play
       @Override
       public void play() {
           System.out.println("Playing CD: " + this.getTitle());
           System.out.println("Artist: " + this.artist);
           if (tracks.isEmpty()) {
               System.out.println("No tracks available to play.");
               return;
           }
           System.out.println("Tracks:");
           for (Track track : tracks) {
               track.play(); // Gọi phương thức play() của từng Track
           }
       }
   }
    



