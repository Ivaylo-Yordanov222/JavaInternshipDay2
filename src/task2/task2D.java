package task2;

import java.util.Scanner;

public class task2D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i<nums.length;i++){
            nums[i]= sc.nextInt();
        }
        int position=-1;

        for (int i = 0; i <nums.length; i++) {
            int leftSum = leftSum(nums, i);
            int rightSum = rightSum(nums, i +1);
            if(leftSum == rightSum) {
                position = i;
            }
        }
        if(position != -1){
            System.out.println(position);
        }
        else{
            System.out.println("NO");
        }
    }

    private static int leftSum(int[] numbers, int position) {
        int sum = 0;
        for (int i = 0; i <=position; i++) {
            sum += numbers[i];
        }
        return sum;
    }
    private static int rightSum(int[] numbers, int position) {
        int sum = 0;
        for (int i = position; i < numbers.length; i++) {
            sum += numbers[i];
        }
        return sum;
    }
}
