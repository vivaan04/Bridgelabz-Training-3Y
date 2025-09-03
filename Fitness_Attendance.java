import java.util.*;
//2. The Fitness Center Attendance 
// A gym tracks attendance for 10 days using an array.
// Use a for loop to calculate the total number of visitors in 10 days.
// Identify the day with the maximum attendance.
// Find the minimum attendance day.
// Display all days where attendance was above the averag
public class Fitness_Attendance {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int[] arr=new int[10];
        int sum=0,avg;
        for (int i=0;i<10;i++){
             arr[i]=sc.nextInt();
            sum+=arr[i];
        }
        int max=arr[0],min=arr[0],minimum=arr[0];    
        for (int i=0;i<10;i++){     
             if (arr[i]>max){
                 max=arr[i];
             }
             if (arr[i]<min){
                 min=Math.min(arr[i],min);
                 minimum=i+1;
             }if (arr[i]>sum/10){
                System.out.println(arr[i]+" ");
            }
            
        }
        System.out.println("the total number of visitors in 10 days  "+ sum);
        System.out.println("the maximum attendance "+ max);
        System.out.println("minimum attendance day "+ minimum);
    }
}
