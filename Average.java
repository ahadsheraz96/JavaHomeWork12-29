import java.util.Scanner;
public class Average {
    public static void main(String args[]) {
        Average obj1 = new Average();
        obj1.example();
        obj1.numberLucky();
    }
    public void example() {
        int average;
        int score1;
        int score2;
        int score3;
        Scanner ahad = new Scanner(System.in);
        System.out.println("enter score1");
        score1 = ahad.nextInt();
        System.out.println("enter score2");
        score2 = ahad.nextInt();
        System.out.println("enter 3");
        score3 = ahad.nextInt();
        average = (score1 + score2 + score3) / 3;
        System.out.println("your average score is " + average);
    }
    public static void numberLucky(){
        int x =25; int b=96;
        System.out.println(x+b);
    }
}
