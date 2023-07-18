import java.util.Scanner;

public class Task08 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число");
        int number = in.nextInt();
        int count = 0;
        int sum = 0;
        while(true) {
            int dig = number%10;
            number/=10;
            count++;
            sum+=dig;
            if(number<=0) break;
        }
        System.out.println(count);
        System.out.println(sum);
    }

}
