import java.util.Scanner;

public class Timer
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("What number do you want to count up to? ");
        int countTo = scanner.nextInt();

        int counter = 0;
        while (counter < countTo)
        {
            counter++; // increment before printing, rather than after
            System.out.println(counter);
        }
    }
}








