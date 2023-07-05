import java.util.Scanner;

public class Task03 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите размер");
        int size = in.nextInt();
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size*2; j++) {
                if ((j >= size - i)&&(j<=size+i)) System.out.print("*");
                else System.out.print(" ");
            }
            System.out.println();
        }
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size*2; j++) {
                if (i==size-1&&j>0) System.out.print("*");
                else if ((j == size - i)||(j==size+i)) System.out.print("*");
                else System.out.print(" ");
            }
            System.out.println();
        }

    }
}
