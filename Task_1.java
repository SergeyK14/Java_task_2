package Homework_2;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

//Реализуйте алгоритм сортировки пузырьком числового массива (введён вами),
//результат после каждой итерации запишите в лог-файл.

public class Task_1 {
    public static void main(String[] args) {
        int[] array = new int[]{1, 2, 6, 8, 1, 4};
        int temp = 0;
        File file = new File ("tsk.txt");
        for (int i = 0; i < array.length; i++){
            for (int j = 0; j < array.length; j++){
                if (array[j] >= array[i]){
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                    
                try{
                    FileWriter fr = new FileWriter(file, true);
                    fr.write(Arrays.toString(array));
                    fr.write("\n");
                    fr.close();
                }
                catch(IOException error){
                    System.out.println("Ошибка записи ");
                }
                }
            }
        }    
        System.out.println(Arrays.toString(array));
    }
}
