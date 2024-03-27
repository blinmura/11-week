package tools;
import java.util.Scanner;

public class Myname {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите имя: ");
        String inputName = scanner.nextLine();

        String name = inputName.replaceAll("[aeiouAEIOU]", "");

        System.out.println("Имя без гласных: " + name);
    }
}
