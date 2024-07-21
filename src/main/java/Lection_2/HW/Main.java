package Lection_2.HW;

import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random rnd = new Random();
        Task1 task1 =new Task1();
        Task2 task2 = new Task2();
        Task3 task3 =new Task3();
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rnd.nextInt(0,4);
        }
        System.out.println(Arrays.toString(arr));
        int task_1 = task1.task(arr);
        int task_2 = task2.task(arr);
        boolean task_3 = task3.task(arr);
        System.out.println(task_1 + " " +task_2);
        System.out.println(task_3);

    }

}
