package u6t3.WarmUp;

public class ArrayAlgorithms {

    private ArrayAlgorithms() {
    }

    public static int[] multiplyByNoModify(int[] numList, int multiplier) {
        int[] multiplied = numList;
        for (int i = 0; i < numList.length; i++) {
            multiplied[i] = numList[i] * multiplier;
        }
        return multiplied;
    }
}
