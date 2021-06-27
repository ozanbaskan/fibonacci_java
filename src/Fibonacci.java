import java.util.Scanner;

public class Fibonacci {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int input = s.nextInt(), previous = 0, current = 1;

        for (int i = 0;i < input;i++)
        {
            System.out.print(current + " ");
            current += previous;
            previous = current - previous;
        }
    }
}
