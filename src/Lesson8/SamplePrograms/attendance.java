
package Lesson8.SamplePrograms;

public class attendance {

    public static void main(String[] args) {
        String attendance[][] = {
            {"Joe","S09","S12","014"},
            {"Amy"},
            {"Sue","S24"},
            {"Bob","S03","J01","Feb25"}
        };
        int abs[] = countAbs(attendance);
        for (int i = 0; i < attendance.length; i++) {
            for (int j = 0; j < attendance[i].length; j++) {
                System.out.print(j==0? attendance[i][j] + "Total Absences: "+ abs[i] + " Dates: " : attendance[i][j]+ " , ");
            }
            System.out.println("");
        }
        System.out.println("Here is how many absences each student has");
        for (int i = 0; i < abs.length; i++) {
            System.out.print(abs[i]+" , ");
        }
        System.out.println("");
    }
    public static int[] countAbs(String data[][]){
        int abs[] = new int[data.length];
        for (int i = 0; i < data.length; i++) {
            abs[i] = data[i].length -1;
        }
        return abs;
    }
    
}
