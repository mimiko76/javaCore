package Lection_2.HW;

public class Task1 {
    Task1(){

    }
    public int task(int[]arr){
        int count = 0;
        for (int j : arr) {
            if (j % 2 == 0) count++;
        }
        return count;
    }
}
