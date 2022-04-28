package task2;

import java.util.Scanner;

public class task2A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i<nums.length;i++){
            nums[i]= sc.nextInt();
        }
        int maxValue = Integer.MIN_VALUE;
        for (int j = 0; j <nums.length;j++){
            if(maxValue < nums[j]) {
                maxValue = nums[j];
            }
        }
        System.out.println(maxValue);
    }
}
