package person;

import java.util.Scanner;
import tools.MyDog;

public class MyOwner {
    private String name;
    private MyDog dogName;

    public MyOwner(String name, MyDog dogName) {
        this.name = name;
        this.dogName = dogName;
    }

    public String toString() {
        return name + " и " + dogName.getName();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the dog's name: ");
        String dogName = scanner.nextLine();
        MyDog myDog = new MyDog(dogName);

        System.out.print("Enter the owner's name: ");
        String ownerName = scanner.nextLine();

        MyOwner owner = new MyOwner(ownerName, myDog);
        System.out.println("Owner details: " + owner);
    }
}
