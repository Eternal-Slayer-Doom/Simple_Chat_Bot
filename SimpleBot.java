package bot;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class SimpleBot {
    final static BufferedReader br=new BufferedReader(new InputStreamReader(System.in)); // Do not change this line

    public static void main(String[] args) throws IOException {
        greet("Aid", "2020"); // change it as you need
        remindName();
        guessAge();
        count();
        test();

    }

    static void greet(String assistantName, String birthYear) {
        System.out.println("Hello! My name is " + assistantName + ".");
        System.out.println("I was created in " + birthYear + ".");
        System.out.println("Please, remind me your name.");
    }

    static void remindName() throws IOException {
        String name = br.readLine();
        System.out.println("What a great name you have, " + name + "!");
    }

    static void guessAge() throws IOException {
        System.out.println("Let me guess your age.");
        System.out.println("Enter remainders of dividing your age by 3, 5 and 7.");
        int rem3 = Integer.parseInt(br.readLine());
        int rem5 = Integer.parseInt(br.readLine());
        int rem7 = Integer.parseInt(br.readLine());
        int age = (rem3 * 70 + rem5 * 21 + rem7 * 15) % 105;
        System.out.println("Your age is " + age + "; that's a good time to start programming!");
    }

    static void count() throws IOException {
        System.out.println("Now I will prove to you that I can count to any number you want.");
        int num = Integer.parseInt(br.readLine());
        for (int i = 0; i <= num; i++) {
            System.out.printf("%d!\n", i);
        }
    }

    static void test() throws IOException {
        System.out.println("Let's test your programming knowledge.");
        // write your code here
        System.out.println("Why do we use methods?");
        System.out.println("1. To repeat a statement multiple times.");
        System.out.println("2. To decompose a program into several small subroutines.");
        System.out.println("3. To determine the execution time of a program.");
        System.out.println("4. To interrupt the execution of a program.");
        int check=Integer.parseInt(br.readLine());
        while (true){
        if(check==2){ end();break;
        }
        else System.out.println("Please try again");
            check=Integer.parseInt(br.readLine());
        }
    }

    static void end() {
        System.out.println("Congratulations, have a nice day!"); // Do not change this text
    }
}
