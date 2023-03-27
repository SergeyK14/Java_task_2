package Homework_2;
//Дана строка (получение через обычный текстовый файл!!!)

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;


// "фамилия":"Иванов","оценка":"5","предмет":"Математика"
// "фамилия":"Петрова","оценка":"4","предмет":"Информатика"

// Написать метод(ы), который распарсит строку и, используя StringBuilder, создаст строки вида:
// Студент [фамилия] получил [оценка] по предмету [предмет].

// Пример вывода в консоль:
// Студент Иванов получил 5 по предмету Математика.
// Студент Петрова получил 4 по предмету Информатика.
// Студент Краснов получил 5 по предмету Физика.
public class Task_2 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        File file = new File ("students.txt");
        try{
            BufferedReader br = new BufferedReader(new FileReader(file));
            String str;
            String newStr;
            while ((str = br.readLine()) != null){
                str.split(",:");
                newStr = str.replaceAll("surname", "Student");
                newStr = newStr.replaceAll("grade", "recieved");
                newStr = newStr.replaceAll("subject", "in");
                newStr = newStr.replaceAll("[:,\"]", " ");
                System.out.println(newStr);
                sb.append(newStr);  
            }
            System.out.println();
            System.out.printf("%s\n", sb.toString());
            br.close();
        }
        catch(IOException error){
            System.out.println("Ошибка чтения ");}
    }
}
