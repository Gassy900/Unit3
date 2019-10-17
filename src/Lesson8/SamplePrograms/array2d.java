
package Lesson8.SamplePrograms;

public class array2d {

    public static void main(String[] args) {
        int nums[][] = {{91,96,97,45},{34,96,78,35},{95,97,89,99}};
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(nums[i][j]+"\t");
            }
            System.out.println("");
        }
        int total = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                total+=nums[i][j];
            }
        }
        System.out.println("Average = " + total/12);
        System.out.println("Sending original array into add10");
        add10(nums);
        System.out.println("Here is nums nows");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(nums[i][j]+"\t");
            }
            System.out.println("");
        }
        
        int avg[] = getAvg(nums);
        System.out.println("The average for each student");
        for (int i = 0; i < avg.length; i++) {
            System.out.println(""+avg[i]);
        }
    }
    
    public static void add10(int arr[][]){
         for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j]+= 10;
            }
    }
    
}
    public static int sum(int arr[][]){
   int total = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                total+=arr[i][j];
            }
        }
        return total;
    }
    public static int[] getAvg(int marks[][]){
        int result[] = new int[marks.length];
        for (int i = 0; i < marks.length; i++) {
            for (int j = 0; j < marks[i].length; j++) {
                result[i] += marks[i][j];
            }
            result[i] = result[i] / marks[i].length;
        }
        return result;
    }
}
