import java.util.Scanner;

public class Task09 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число ярусов и высоту через пробел");
        int size = in.nextInt();
        int height = in.nextInt();
        int count = size;
        for(int k=0;k<size;k++){
            for (int i = 0; i < height; i++) {
                for(int l=0;l<count;l++)
                {System.out.print(" ");}
                for (int j = 0; j < height * 2; j++) {
                    if ((j >= height - i) && (j <= height + i)) System.out.print("*");
                    else System.out.print(" ");
                }
                System.out.println();
            }
            count--;
            height++;
        }

    }
}
