package task2;

import java.util.Scanner;

public class task2C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i<nums.length;i++){
            nums[i]= sc.nextInt();
        }
        int clustersCount = 0;
        boolean isCluster = false;
        for (int i = 0; i <nums.length; i++) {
            if(i == nums.length-1)
            {
                break;
            }
            if(nums[i] == nums[i+1] && isCluster){
                continue;
            }
            else if(nums[i] == nums[i+1]) {
                isCluster = true;
                clustersCount++;
            }
            else{
                isCluster = false;
            }
        }
        System.out.println(clustersCount);
    }
}
