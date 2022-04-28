package task2;

import java.util.ArrayList;
import java.util.Scanner;

public class task2E {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i<nums.length;i++){
            nums[i]= sc.nextInt();
        }
        ArrayList<ArrayList<Integer>> sequances = new ArrayList<>();
        int j = 0;
        boolean isSequence = false;
        for (int i = 0; i <nums.length; i++) {
            if(i == nums.length-1) {
                break;
            }
            if(isSequence && nums[i] < nums[i+1]) {
                sequances.get(j).add(nums[i]);
                if(i + 1 == nums.length-1){
                    sequances.get(j).add(nums[i+1]);
                }
            }
            else if(nums[i] < nums[i+1]){
                sequances.add(new ArrayList<>());
                sequances.get(j).add(nums[i]);
                isSequence = true;
            }
            else if(sequances.size() != 0){
                isSequence = false;
                sequances.get(j).add(nums[i]);
                j++;
            }
        }

        int sequenceIndex = 0;
        int maxSize = 0;
        int i = 0;
        for(ArrayList<Integer> sequence : sequances) {
            if(maxSize < sequence.size()) {
                maxSize = sequence.size();
                sequenceIndex = i;
            }
            i++;
        }
        for(int k = 0; k<sequances.get(sequenceIndex).size();k++){
            System.out.print(sequances.get(sequenceIndex).get(k) + " ");
        }
    }

}
