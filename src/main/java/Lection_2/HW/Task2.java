package Lection_2.HW;

public class Task2 {
    Task2(){

    }
    public int task(int[] arr){
        int min = arr[0];
        int max = arr[0];
        for (int i = 0; i < arr.length-1; i++) {
            if (min >arr[i+1]) min = arr[i+1];
            if (max<arr[i+1]) max = arr[i+1];
        }
        return max-min;
    }
}
