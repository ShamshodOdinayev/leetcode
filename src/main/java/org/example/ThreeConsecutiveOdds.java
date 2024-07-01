package org.example;

public class ThreeConsecutiveOdds {
    public static void main(String[] args) {
        int[] arr = {1, 2, 34, 3, 4, 5, 7, 23, 12};
        System.out.println(threeConsecutiveOdds(arr));
    }

    public static boolean threeConsecutiveOdds(int[] arr) {
        int count = 0;
        int[] newArr = new int[3];
        for (int i : arr) {
            if (i % 2 != 0) {
                count++;
                newArr[count - 1] = i;
            } else {
                count = 0;
                newArr = new int[3];
            }
            if (count == 3) {
                return true;
            }
        }
        return false;
    }
}