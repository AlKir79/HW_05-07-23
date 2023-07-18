import java.util.Scanner;

public class Task05 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите высоту");
        int size = in.nextInt();
        for (int i=0;i<size;i++){
            for (int j = 0;j<size*5;j++){
                if(j>=size-i-1&&j<=size*5-i-1) System.out.print("*");
                else System.out.print(" ");
            }
            System.out.println();
        }
        for (int i=0;i<size;i++){
            for (int j = 0;j<size*5;j++){
                if ((i==0&&j>=size-i)||(i==size-1&&j<size*5-i-1)) System.out.print("*");
                else if(j==size-i-1||j==size*5-i-1) System.out.print("*");
                else System.out.print(" ");
            }
            System.out.println();
        }
    }
}
