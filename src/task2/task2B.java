package task2;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class task2B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i<nums.length;i++){
            nums[i]= sc.nextInt();
        }
        int slap = 0;
        for (int i = 0; i <nums.length; i++) {
            for (int j = i+1; j <nums.length; j++) {
                if(nums[i] >nums[j]) {
                    slap = nums[i];
                    nums[i] = nums[j];
                    nums[j] = slap;
                }
            }
        }
        for (int i = 0; i<nums.length;i++){
            System.out.print(nums[i]+" ");
        }
    }

}
