import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        System.out.println("I'm Tealtie's first Java program.");
        System.out.println("He's learning Java.");
        System.out.println("Java is a high-level, class-based, object-oriented programming language.");
        System.out.println("Java is designed to have as few implementation dependencies as possible.");
        System.out.println("Java is a general-purpose programming language intended to let application developers write once, run anywhere (WORA).");
        System.out.println("It's pretty cool!");
        System.out.println("I'm going to ask you for your age.");
        
        try (Scanner scanboi = new Scanner(System.in)) {
            System.out.print("Please enter your age: ");
            int age = scanboi.nextInt();
            System.out.println("You are " + age + " years old.");
        }
    }
}
