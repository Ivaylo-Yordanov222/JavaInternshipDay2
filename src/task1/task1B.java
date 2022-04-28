package task1;
import java.util.Scanner;
public class task1B {
        public static void main(String[] args) {
           Scanner sc = new Scanner(System.in);
           int n = sc.nextInt();
           sc.nextLine();
           String input = sc.nextLine();
           int[] numbers = getNumbers(input);
           for (int i = 0; i < numbers.length;i++){
               if(i == numbers.length -1)
               {
                   System.out.println(numbers[i]);
                   break;
               }
               System.out.print(numbers[i] + ",");
           }
        }
    public static int[] getNumbers(String str)
    {
        String[] splitArray = str.split(" ");
        int[] array = new int[splitArray.length];

        for (int i = 0; i < splitArray.length; i++) {
            array[i] = Integer.parseInt(splitArray[i]);
        }
        return array;
    }
}
