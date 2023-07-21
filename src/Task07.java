//Задание 7
//С клавиатуры вводится целое положительное число любой разрядности. Необходимо перевернуть это число, т. е.
//цифры должны располагаться в обратном порядке (например, вводим число 1234 – в результате будет 4321).
//Не использовать строки и массивы.

import java.util.Scanner;

public class Task07 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число");
        int number = in.nextInt();
       while(true) {
           int dig = number%10;
           number/=10;
           System.out.print(dig);
           if(number<=0) break;
        }
       }
}
