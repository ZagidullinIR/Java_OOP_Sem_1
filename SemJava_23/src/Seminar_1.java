import java.time.LocalTime;
import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class Seminar_1 {
    public static void main(String[] args) {
       System.out.println(task0("Добро пожаловать на курс по Java"));
    }

    public static String task0(String str){
        // во фразе "Добро пожаловать на курс по Java" переставить слова в обратном порядке.
        str = str.toLowerCase();
        String[] arr = str.split(" ");
        String result = "";
        for (int i = arr.length - 1; i >= 0; i--) {
           result += arr[i] + " ";
        }
        return result;
    }

}