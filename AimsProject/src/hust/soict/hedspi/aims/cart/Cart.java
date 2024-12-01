package hust.soict.hedspi.aims.cart;

import hust.soict.hedspi.aims.media.*;
import java.util.ArrayList;
import java.util.Scanner;
public class Cart {

    public static final int MAX_NUMBERS_ORDERED = 20;// so luong toi da trong gio hang
    private float totalCost =0; // tong gia tri gio hang
    ArrayList<DigitalVideoDisc> itemsOderedList = new ArrayList<DigitalVideoDisc>(MAX_NUMBERS_ORDERED);// mang arraylist luu danh sach cac dia trong gio hang
    private int qtyOrdered = 0;// so luong DVD hien co trong gio hang

 /**
  *  add the digital video disc
  * @param disc
  */
    public void addDigitalVideoDisc(Media media) {
        if (qtyOrdered < MAX_NUMBERS_ORDERED) {
            itemOrdered[qtyOrdered] = disc;
            qtyOrdered++;
            System.out.println("The disc has been added.");
        } else {
            System.out.println("The cart is full. Cannot add more discs.");
        }
    }

    /**
     * Removes the digital video disc
     * @param disc
     */
    public void removeDigitalVideoDisc(Media media) {
        int index = findDiscIndex(media);
        if (index != -1) { 
            System.arraycopy(itemOrdered, index + 1, itemOrdered, index, qtyOrdered - index - 1);
            itemOrdered[qtyOrdered - 1] = null; 
            qtyOrdered--;
            System.out.println("The disc has been removed.");
        } else {
            System.out.println("Cannot find the disc in the cart!");
        }
    }

    /**
     *  Find the  digital video disc
     * @param disc
     * @return i
     */
    private int findDiscIndex(Media media) {
        for (int i = 0; i < qtyOrdered; i++) {
            if (itemOrdered[i].equals(media)) {
                return i;
            }
        }
        return -1;
    }

    /**
     * Total cost
     * @param disc
     * @return the float
     */
    // tinh tong tien DVD trong gio 
    public float totalCost() {
        float total = 0;
        for (int i = 0; i < qtyOrdered; i++) {
            total += itemOrdered[i].getCost();
        }
        return total;
    }

    /**
     * Search cart keyword
     *
     * @param id the keyword
     */
	public void search(String keywords) {
		int matchItem = 0;
		int i = 0;
		while (i < qtyOrdered) {
			if (itemOrdered[i].isMatch(keywords)) {
				matchItem++;
				System.out.println(itemOrdered[i].toString());
			}
			i++;
		}
		if (matchItem == 0) {
			System.out.println("No item found!");
		}
	}
    
    /**
     * Search cart id.
     *
     * @param id the id
     */
	public void search(int ID) {
		int matchItem = 0;
		int i = 0;
		while (i < qtyOrdered) {
			if (itemOrdered[i].getId() == ID) {
				matchItem++;
				System.out.println(itemOrdered[i].toString());
			}
			i++;
		}
		if (matchItem == 0) {
			System.out.println("No item found!");
		}
	}
	
	
}
