package Lection_2.HW;

public class Task3 {
    Task3(){

    }
    boolean task(int[]arr){
        for (int i = 0; i < arr.length-1; i++) {
            if (arr[i] ==0 && arr[i+1]==0) return true;
        }
        return false;
    }
}
