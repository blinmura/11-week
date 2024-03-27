package tools;

import java.util.Scanner;

public class MyDog {
    private String name;

    public MyDog(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void bark() {
        System.out.println("Bark! Bark! Bark!");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the dog's name: ");
        String dogName = scanner.nextLine();

        MyDog myDog = new MyDog(dogName);
        System.out.println("Your dog's name is: " + myDog.getName());
        myDog.bark();
    }
}
