import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Podaj słowo: ");
        String slowo = input.nextLine();

        boolean palindrom = true;
        for (int i = 0; i < slowo.length() / 2; i++) {
            if (slowo.charAt(i) != slowo.charAt(slowo.length() - 1 - i)) {
                palindrom = false;
                break;
            }
        }


        if (palindrom) {
            System.out.println(slowo + " jest palindromem.");
        } else {
            System.out.println(slowo + " nie jest palindromem.");
        }
    }
}
