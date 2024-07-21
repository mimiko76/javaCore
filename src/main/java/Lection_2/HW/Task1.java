package Lection_2.HW;

public class Task1 {
    Task1(){

    }
    public int task(int[]arr){
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]%2==0) count++;
        }
        return count;
    }
}
