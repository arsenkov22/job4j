package ru.job4j.array;

public class BubbleSort {
    public int[] sort(int[] array){
        for (int i = 0; i < array.length; i++){
             int x = array[i];
             for (int j = i -1; j >= 0; j--){
                 int y = array[j];
                 if (x < y){
                     array[j+1] = y;
                     array[j] = x;
                 }else {
                     break;
                 }
             }
        }
        return array;
    }
}
