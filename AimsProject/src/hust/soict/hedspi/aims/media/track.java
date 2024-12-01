package hust.soict.hedspi.aims.media;
public class track implements playable {
    private String title;
    private int length;
    public track(String title,int length){
        this.title = title;
        this.length = length;
    }
    public String get_Title() {
        return title;
    }
    public int get_Length() {
        return length;
    }
    @Override
        public boolean equals(Object obj) {
        // Kiểm tra nếu đối tượng tham chiếu đến chính nó
        if (this == obj) {
            return true;
        }

        // Kiểm tra null và kiểu đối tượng
        if (!(obj instanceof Track)) {
            return false;
        }

        // Ép kiểu đối tượng và so sánh thuộc tính
        Track track = (Track) obj;
        return (title != null && title.equals(track.title)) && length == track.length;
    }


        @Override
        public String toString() {
        return String.format("Track [Title=%s, Length=%d]", title, length);
        }

        @Override
        public void play() {
            if (title != null) {
                System.out.println("Playing Track: " + title);
            } else {
                System.out.println("Track title is not set.");
            }
        
            System.out.println("Track length: " + length + " seconds");
        }
        

}
