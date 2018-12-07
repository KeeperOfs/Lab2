import java.util.Random;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        String symbols = "aAbBcCdDeEfFgGhHiIjJkKlLmMnNoOpPqQrRsStTuUvVwWxXyYzZ";
        int length, amount;
        System.out.println("Tell us, how many passwords you want to receive");
        Scanner len = new Scanner(System.in);
        amount = len.nextInt();
        System.out.println("Enter the desired length of your password");
        length = len.nextInt();
        for(int i = 0; i < amount; i++) {
            Random rand = new Random();
            char[] pass = new char[length];
            for (int k = 0; k < length; k++)
                pass[k] = symbols.charAt(rand.nextInt(symbols.length()));
            String randomPass = "";
            for (int n = 0; n < pass.length; n++)
                randomPass += pass[n];
            System.out.println("Your password will be = " + randomPass);
        }
    }
}

