package u6t3;

public class Main {
    public static void main(String[] args) {
        String[] strings9 = {"HELlo", "Halo", "WHAT!", "Adam", "what", "booyAH", "WHY?", "for"};
        ArrayAlgorithms.makeUppercase(strings9);
        for (String str : strings9) {
            System.out.print(str + " ");
        }
        System.out.println();
    
    }
}
