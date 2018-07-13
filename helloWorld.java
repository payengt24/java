import java.util.Scanner;
public class helloWorld {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Hello, World! My name is Pa Yeng Thao");
        System.out.println("Enter name: ");
 

        String token = sc.nextLine();

        System.out.println("Hi, " + token);
    }

}