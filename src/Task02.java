// Задание 2
//Прямоугольный треугольник,
//прямым углом вверх-вправо:
//заполненный и пустой.

import java.util.Scanner;

public class Task02 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите размер");
        int size = in.nextInt();
        for (int i=0;i<size;i++){
            for (int j=0;j<size;j++){
                if(j>=i) System.out.print("*");
                else System.out.print(" ");
            }
            System.out.println();
        }
        for (int i=0;i<size;i++){
            for (int j=0;j<size;j++){
                if (i==0) System.out.print("*");
                else if(j==i||j==size-1) System.out.print("*");
                else System.out.print(" ");
            }
            System.out.println();
        }


    }
}
