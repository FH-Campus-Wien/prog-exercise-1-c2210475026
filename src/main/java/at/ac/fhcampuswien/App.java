package at.ac.fhcampuswien;

import java.util.Scanner;

public class App {

    //todo Task 1
    public void sayHelloWorld(){
        System.out.println("Hello World!");
    }

    /*
     * '\n' - neue Zeile
     * '\r' - Enter
     * '\t' - Tab
     * '\b' - Backspace
     * '\f' - Seitenvorschub
     * '\' ' - Hochkomma
     * '\"' - Anführungsstriche
     * '\\' - Backslash
     */
    //todo Task 2
    public void helloRobot(){
        System.out.println("0123456789012345678901");
        System.out.println("         __");
        System.out.println(" _(\\    |@@|");
        System.out.println("(__/\\__ \\--/ __");
        System.out.println("   \\___|----|  |   __");
        System.out.println("       \\ }{ /\\ )_ / _\\");
        System.out.println("       /\\__/\\ \\__O (__");
        System.out.println("      (--/\\--)    \\__/");
        System.out.println("      _)(  )(_");
        System.out.println("     `---''---`");
    }
    // Informationen zu Literals in Java ->
    // https://www.straub.as/java/basic/const.html
    // https://www.geeksforgeeks.org/literals-in-java/
    //todo Task 3
    public void sumOfLiterals(){
        //char form ''
        char c='Z';
        int ci= (int) c;
        //hexadecimal form 0x....
        int i=0xface;
        //octal form literal 0....
        int i2=012;

        long l1=80L;
        int l1i= (int) l1;

        float f=44e-1f;
        int fi=(int) f;

        float f2=5.5f;
        int f2i=(int) f2;

        double d=8.88e1;
        int di=(int) d;

        double d2=99.9;
        int d2i=(int) d2;

        int sum = ci+i+i2+l1i+fi+f2i+di+d2i;
        System.out.println(sum);
    }

    //todo Task 4
    public void addTwoNumbers(){
        Scanner s = new Scanner(System.in);
        int sum=0;
        for(int i=0;i<2;i++){
            sum=sum+s.nextInt();
        }
        System.out.println(sum);

    }

    //todo Task 5
    public void swapTwoNumbers(){
        Scanner scanner= new Scanner(System.in);
        System.out.println("Before Swap:");
        int x = scanner.nextInt();
        System.out.print("x: ");
        int y = scanner.nextInt();
        System.out.print("y: ");
        x=x+y;
        y=x-y;
        x=x-y;
        /*
          zum Verständnis:
          x=9,y=4
          x=9+4=13
          y=13-4=9
          x=13-9=4
          x=4,y=9
         */
        System.out.println("After Swap:");
        System.out.println("x: "+x);
        System.out.println("y: "+y);
    }

    //todo Task 6
    public void compareTwoNumbers(){
        Scanner scanner = new Scanner(System.in);
        int n1 = scanner.nextInt();
        int n2 = scanner.nextInt();
        System.out.print("n1: ");
        System.out.print("n2: ");
        if(n1>n2){
            System.out.println("n1 > n2");
        }
        if(n1<n2){
            System.out.println("n2 > n1");
        }
        if(n1==n2){
            System.out.println("n1 == n2");
        }
    }

    //todo Task 7
    public void ratingSalesPerson(){
        System.out.print("Enter annual Revenue: ");
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        if(i<0 || i>=100000){
            System.out.println("Invalid Revenue");
        }
        if (i >= 0 && i < 20000) {
            System.out.println("Poor Sales Revenue");
        }
        if(i>=20000 && i<50000){
            System.out.println("Average Sales Revenue");
        }
        if(i>=50000 && i<80000){
            System.out.println("Good Sales Revenue");
        }
        if(i>=80000 && i<100000){
            System.out.println("Excellent Sales Revenue");
        }
    }

    //todo Task 8
    public void getCommissionRate(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter CommissionClass: ");
        int i = scanner.nextInt();
        double d = 0.00;
        System.out.print("Your Commission Rate was set to ");
        switch(i){
            case 1:
                d=0.01;
                System.out.println(d);
                break;
            case 2:
                d=0.02;
                System.out.println(d);
                break;
            case 3:
                d=0.03;
                System.out.println(d);
                break;
            case 4:
                d=0.04;
                System.out.println(d);
                break;
            default:
                System.out.println(d);
                break;
        }

    }

    //todo Task 9
    public void leapyear(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Year: ");
        int i = scanner.nextInt();
        if(i%4==0 && i%400==0){
            System.out.println("Leapyear");
        }else{
            System.out.println("Not a Leapyear");
        }
    }

    //todo Task 10
    public void transposedNumbers(){
        // input your solution here
    }


    public static void main(String[] args){
        App exercise1 = new App();

        System.out.println("Task 1: Say Hello World");
        exercise1.sayHelloWorld();

        System.out.println("\nTask 2: Hello Robot");
        exercise1.helloRobot();

        System.out.println("\nTask 3: Literals");
        exercise1.sumOfLiterals();

        System.out.println("\nTask 4: Add two Numbers");
        exercise1.addTwoNumbers();

        System.out.println("\nTask 5: Swap two Numbers without using a helper variable");
        exercise1.swapTwoNumbers();

        System.out.println("\nTask 6: Compare two Numbers");
        exercise1.compareTwoNumbers();

        System.out.println("\nTask 7: Rating Sales Person");
        exercise1.ratingSalesPerson();

        System.out.println("\nTask 8: Commission Rate");
        exercise1.getCommissionRate();

        System.out.println("\nTask 9: Leapyear");
        exercise1.leapyear();

        System.out.println("\nTask 10: Transposed Numbers");
        exercise1.transposedNumbers();
    }
}