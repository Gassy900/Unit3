package Lesson8.SamplePrograms;

public class SwimTimes {

    public static void main(String[] args) {
        String athletes[] = {"Bob", "Sue", "Andy", "Joe"};
        double times[][] = {
            {12, 3, 6, 6.4},
            {12.9},
            {9.9, 9.4, 5, 6.6,},
            {33, 33.9},};
        double avgtime[] = getAvg(times);
        for (int i = 0; i < athletes.length; i++) {
            System.out.print(athletes[i] + " \tTimes: ");
            for (int j = 0; j < times[i].length; j++) {
                System.out.print(times[i][j] + "\t");
            }
            System.out.println("Average Time: "+avgtime[i]);
        }
    }

    public static double[] getAvg(double t[][]) {
        double avg[] = new double[t.length];
        for (int i = 0; i < t.length; i++) {
            for (int j = 0; j < t[i].length; j++) {
                avg[i] += t[i][j];
            }
            avg[i] = avg[i] / t[i].length;
        }
        return avg;
    }
}
