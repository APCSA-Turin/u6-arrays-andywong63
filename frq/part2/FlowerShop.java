package frq.part2;

import java.util.Arrays;
import java.util.Collections;

public class FlowerShop {

    private Flower[] flowerInventory;

    // ADDED TO ENABLE TESTING
    public FlowerShop(Flower[] flowerInventory) {
        this.flowerInventory = flowerInventory;
    }

    // ADDED TO ENABLE TESTING
    public Flower[] getFlowerInventory() {
        return flowerInventory;
    }

    // IMPLEMENTATION ADDED TO ENABLE TESTING
    public Flower[] sortByQuantity(Flower[] arr) {
        Flower[] sortedCopy = new Flower[arr.length];
        for (int i = 0; i < sortedCopy.length; i++) {
            sortedCopy[i] = arr[i];
        }
        Arrays.sort(sortedCopy); // sorts low to high (increasing) based on quantity
        Collections.reverse(Arrays.asList(sortedCopy)); // reverses to sort in decreasing order
        return sortedCopy;
    }

    // part a
    public void updateInventory(Flower[] newInventory) {
        for (int i = 0; i < newInventory.length; i++) {
            int oldQuantity = flowerInventory[i].getQuantity();
            int newQuantity = newInventory[i].getQuantity();
            flowerInventory[i].setQuantity(oldQuantity + newQuantity);
        }
    }

    // part b
    public boolean topNSame(int n, Flower[] otherInventory) {
        Flower[] sortedCurrent = sortByQuantity(flowerInventory);
        Flower[] sortedOther = sortByQuantity(otherInventory);
        for (int i = 0; i < n; i++) {
            String currentName = sortedCurrent[i].getName();
            String otherName = sortedOther[i].getName();
            if (!currentName.equals(otherName)) return false;
        }
        return true;
    }
}
