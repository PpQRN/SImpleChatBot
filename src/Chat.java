import java.util.Scanner;

public class Chat {

    public static void main(String[] Args) {
        Scanner sc = new Scanner(System.in);
        Bot bot = new Bot();
        Human human = new Human("");

        System.out.println("Hello! My name is " + bot.name + ".\n" +
                "I was created in " + bot.birthYear + ".\n" +
                "Please, remind me your name.");
        human.setName(sc.nextLine());
        System.out.println("What a great name you have, " + human.getName());
        System.out.println("Let me guess your age \n" +
                "Enter remainders of dividing your age by 3, 5 and 7.");
        int a1 = sc.nextInt();
        int a2 = sc.nextInt();
        int a3 = sc.nextInt();
        int guess = guessage(a1, a2, a3);
        System.out.println("Yor age is " + guess + "; that's a good time to start programming!");
        System.out.println("Why do we use methods?");
        System.out.println("1. To repeat a statement multiple times.\n2." +
                " To decompose a program into several small subroutines.\n3." +
                " To determine the execution time of a program.\n4." +
                " To interrupt the execution of a program.");
        boolean n = false;
        while (!n) {
            try {
                switch (sc.nextInt()) {
                    case 1:
                        System.out.println("Please, try again.");
                        break;
                    case 2:
                        System.out.println("Congratulations, have a nice day!");
                        n = !n;
                        break;
                    case 3:
                        System.out.println("Please, try again.");
                        break;
                    case 4:
                        System.out.println("Please, try again.");
                        break;
                    default:
                        System.out.println("Enter numbers from 1 to 4");
                        break;
                }
            } catch (NullPointerException ex) {
                System.out.println("Enter numbers from 1 to 4");
                sc.next();
            }
        }
    }
    public static int guessage(int a1, int a2, int a3) {
        int age = (a1 * 70 + a2 * 21 + a3 * 15) % 105;
        return age;
    }
}
