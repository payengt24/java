import java.util.Scanner;
public class helloWorld {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Hello, World! My name is Pa Yeng Thao. Nice to meet you!");
        System.out.println("Please enter your name so we know who you are: ");
 

        String token = sc.nextLine();

        System.out.println("Welcome to Pa Yeng's terminal " + token + ". Please come again!");
    }

}