
package Lesson8.SamplePrograms;

public class practice {

    public static void main(String[] args) {
        int x[][] = new int[5][4];
        for (int i = 0; i < x.length; i++) {
            for (int j = 0; j < x[i].length; j++) {
                x[i][j] = i + j;
                System.out.print(x[i][j]+"\t");
            }
            System.out.println("");
        }
        int total=0;
        for (int i = 0; i < x.length; i++) {
            for (int j = 0; j < x[i].length; j++) {
                total += x[i][j];
            }
        }
        System.out.println(total);
        int yeet = 0;
        int arr[] = {6,7,2,5,6,7,34,2,4,5,6,7,8,9,0,7,56,4,3,4,6,3,4,5,6,7,34,3,5,6};
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == 56){
                yeet++;
            }
        }
        System.out.println(yeet);
        }
    }
    
