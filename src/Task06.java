// Задание 6
//Нарисовать на экране лесенку. Количество ступенек указывает пользователь с клавиатуры

import java.util.Scanner;

public class Task06 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число ступенек");
        int st = in.nextInt();
        System.out.println("***");
        for (int i = 0;i<st-1;i++) {
            for (int j=0; j<(i+1)*2;j++) System.out.print(" ");
            System.out.println("*");
            for (int j=0; j<(i+1)*2;j++) System.out.print(" ");
            System.out.println("***");
        }
    }
}
