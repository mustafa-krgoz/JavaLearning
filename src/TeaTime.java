import java.util.Scanner;
public class TeaTime {
    public static void announceTeaTime(){
        System.out.println("Waiting for tea time...");
        System.out.print("Type in random word and press Enter to start tea time = ");
        Scanner scan = new Scanner(System.in);
        scan.next();
        System.out.println("It's tea time!");
    }
    public static void main(String[] args) {
        System.out.println("Welcome to your new job!");

        announceTeaTime();

        System.out.println("Write Code");
        System.out.println("Review Code");
        System.out.println("Learn Stuff");

        announceTeaTime();

        System.out.println("Get promoted!");
        System.out.println();
    }

}
