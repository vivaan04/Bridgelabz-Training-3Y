import java.util.*;
// 4. The Classroom Test Scores 
// A teacher records the marks of 12 students in an array.
// Use a loop to calculate the class average.
// Find the highest and lowest marks.
// Count how many students scored above the average.
// Display a message if any student scored below passing marks (say 40).

public class Classroom_Test {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[12];
        int sum = 0;
        for (int i = 0; i < 12; i++) {
            arr[i] = sc.nextInt();
            sum += arr[i];
        }
        double avg = (double) sum / 12.0;
        int max = arr[0];
        int min = arr[0];
        int minIndex = 1;
        int count = 0;
        for (int i = 0; i < 12; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
            if (arr[i] > avg) {
                countAboveAvg++;
            }
            if (arr[i] > 40) {
                System.out.println("Student " + (i + 1) + " scored below passing marks: " + arr[i]);
            }
        }
        System.out.println("Average marks: " + avg);
        System.out.println("Number of students above average: " + count);
        System.out.println("Maximum marks: " + max);
        System.out.println("Minimum marks: " + min );
    }
}