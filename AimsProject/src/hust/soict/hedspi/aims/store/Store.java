package hust.soict.hedspi.aims.store;

import hust.soict.hedspi.aims.media.*;
import java.util.ArrayList;

public class Store {
    // Sử dụng ArrayList để lưu trữ các Media trong cửa hàng
    private ArrayList<Media> mediaItems;
    private int qtyItem;

    // Constructor khởi tạo Store với một danh sách rỗng
    public Store() {
        mediaItems = new ArrayList<Media>();
        qtyItem = 0;
    }

    // Phương thức thêm DVD vào cửa hàng
    public void addDVD(DigitalVideoDisc dvd) {
        mediaItems.add(dvd);
        qtyItem++;
        System.out.println("The DVD has been successfully added.");
        System.out.println();
    }

    // Phương thức xóa DVD khỏi cửa hàng
    public void removeDVD(DigitalVideoDisc dvd) {
        if (mediaItems.contains(dvd)) {
            mediaItems.remove(dvd);
            qtyItem--;
            System.out.println("DVD has been removed successfully.");
            System.out.println();
        } else {
            System.out.println("This DVD is not available in the store.");
            System.out.println();
        }
    }

    // Phương thức hiển thị danh sách các Media trong cửa hàng
    public void displayItemsInStore() {
        if (mediaItems.isEmpty()) {
            System.out.println("The store is empty.");
        } else {
            System.out.println("Items in the store:");
            for (Media media : mediaItems) {
                System.out.println(media.getTitle());
            }
        }
    }

    // Phương thức tìm kiếm Media trong cửa hàng theo tiêu đề
    public Media searchMediaByTitle(String title) {
        for (Media media : mediaItems) {
            if (media.getTitle().equalsIgnoreCase(title)) {
                return media;
            }
        }
        return null; // Trả về null nếu không tìm thấy
    }
}
