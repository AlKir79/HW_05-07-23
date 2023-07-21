// Задание 1
//Прямоугольный треугольник,
//прямым углом вниз-вправо:
//заполненный и пустой.

import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите размер");
        int size = in.nextInt();
        for (int i=0;i<size;i++){
            for (int j=0;j<size;j++){
                if(j>=size-1-i) System.out.print("*");
                else System.out.print(" ");
            }
System.out.println();
        }
        for (int i=0;i<size;i++){
            for (int j=0;j<size;j++){
                if (i==size-1) System.out.print("*");
                else if(j==size-1-i||j==size-1) System.out.print("*");
                else System.out.print(" ");
            }
            System.out.println();
        }


    }

}
